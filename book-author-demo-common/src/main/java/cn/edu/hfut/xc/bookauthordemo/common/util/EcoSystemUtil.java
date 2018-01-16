package cn.edu.hfut.xc.bookauthordemo.common.util;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import org.apache.commons.codec.binary.Base64;

import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by sunwei on 2018/1/11 Time:13:38
 */
public class EcoSystemUtil {
    private static final String JWT_SECRET = "7786df7fc3a34e26a61c034d5ec8245d";

    public EcoSystemUtil() {
    }

    public static Map<String, String> ifAuthUsable(String jwt) {
        Map<String, String> usermap = new LinkedHashMap();
        boolean usableFlag = false;
        String epeoCode = "";
        Map<String, Map<String, String>> claimmap = (Map) Jwts.parser().setSigningKey(DatatypeConverter.parseBase64Binary("7786df7fc3a34e26a61c034d5ec8245d")).parseClaimsJws(jwt).getBody();
        if (claimmap.containsKey("sub")) {
            usermap = (Map) claimmap.get("sub");
        }

        return (Map) usermap;
    }

    private static SecretKey generalKey() {
        byte[] encodedKey = Base64.decodeBase64("7786df7fc3a34e26a61c034d5ec8245d");
        SecretKey key = new SecretKeySpec(encodedKey, 0, encodedKey.length, "AES");
        return key;
    }

    public static Claims parseJWT(String jwt) {
        try {
            SecretKey key = generalKey();
            Claims claims = (Claims) Jwts.parser().setSigningKey(key).parseClaimsJws(jwt).getBody();
            return claims;
        } catch (Exception var3) {
            return null;
        }
    }
}
