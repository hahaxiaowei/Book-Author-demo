package cn.edu.hfut.xc.bookauthordemo.common.util;

import org.apache.commons.codec.digest.DigestUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by lulx on 2017/11/21 0021 下午 14:01
 */
public class EncryptUtil {

    private static Logger logger = LoggerFactory.getLogger(EncryptUtil.class);

    /**
     * MD5底层的加密算法实现
     * @param in
     * @return
     * @throws NoSuchAlgorithmException
     */
    public static String md5(String in) throws NoSuchAlgorithmException {
        char[] hexDigits = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'b', 'd', 'e', 'f'};
        MessageDigest mdInst = MessageDigest.getInstance("MD5");
        mdInst.update(in.getBytes());
        byte[] md = mdInst.digest();
        int j = md.length;
        char[] str = new char[j * 2];
        int k = 0;

        for(int i = 0; i < j; ++i) {
            byte byte0 = md[i];
            str[k++] = hexDigits[byte0 >>> 4 & 15];
            str[k++] = hexDigits[byte0 & 15];
        }

        return new String(str);
    }
    /**
     * MD5加密
     *
     * @param key
     * @return
     */
    public static String md5Hex(String key) {
        if (StringUtil.isNullOrEmpty(key)) {
            return "";
        }
        String md5Val = "";
        try {
            md5Val = md5(key);
        } catch (NoSuchAlgorithmException e) {
            logger.error("EncryptUtil.md5Hex() : key {} : " + key + " error {} :" + e.getMessage(), e);
            throw new RuntimeException("EncryptUtil.md5Hex() : key {} : " + key + " error {} :" + e.getMessage());
        }
        return md5Val;
    }

    /**
     * sha1 迭代1024次加密
     *
     * @param key
     * @return
     */
    public static String shaHex1024(String key) {
        if (StringUtil.isNullOrEmpty(key)) {
            return "";
        }
        String shaHexVal = key;
        int i = 1024;
        while (i > 0) {
            shaHexVal = DigestUtils.sha1Hex(shaHexVal);
            i--;
        }
        return shaHexVal;
    }

    /**
     * 生成明文密码对应的密文密码
     *
     * @param passWord
     * @return
     */
    public static String encryptPassWord(String passWord) {
        if (StringUtil.isNullOrEmpty(passWord)) {
            return "";
        }
        String pwMd5 = md5Hex(passWord);
        String pwMd5Sub = pwMd5.substring(0, 16);
        return pwMd5Sub + shaHex1024(passWord);
    }


    /**
     * 对token取前16位加密
     */
    public static String getTokenKey(ServletRequest request) {
        HttpServletRequest httpRequest = (HttpServletRequest) request;
        String token = httpRequest.getHeader("Authorization");
        return EncryptUtil.encryptPassWord(token);
    }

    /**
     * 密码（必填）MD5(username+MD5(pwd))
     * pwd为明文密码
     *
     * @param userName
     * @param passWord
     * @return
     */
    public static String msgPassword(String userName, String passWord) {
        return md5Encode(userName + md5Encode(passWord, ""), "");
    }

    public static String md5Encode(String strSrc, String key) {

        try {
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            md5.update(strSrc.getBytes("UTF8"));
            StringBuilder result = new StringBuilder(32);
            byte[] temp;
            temp = md5.digest(key.getBytes("UTF8"));
            for (int i = 0; i < temp.length; i++) {
                result.append(Integer.toHexString(
                        (0x000000ff & temp[i]) | 0xffffff00).substring(6));
            }
            return result.toString();
        } catch (Exception e) {
            logger.error("EncryptUtil.md5Hex() : key {} : " + strSrc + " error {} :" + e.getMessage(), e);
            throw new RuntimeException("EncryptUtil.md5Hex() : key {} : " + strSrc + " error {} :" + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Long start = System.currentTimeMillis();
        //System.out.println(shaHex1024("123"));
        //System.out.println(md5Hex("123"));
        System.out.println(encryptPassWord("123qwe"));
        System.out.println(System.currentTimeMillis() - start);
    }

}
