package cn.edu.hfut.xc.bookauthordemo.provider.config;

import cn.edu.hfut.xc.bookauthordemo.common.model.SystemSession;
import cn.edu.hfut.xc.bookauthordemo.common.util.EncryptUtil;
import cn.edu.hfut.xc.bookauthordemo.common.util.SerializeUtils;
import cn.edu.hfut.xc.bookauthordemo.common.util.StringUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletRequest;

/**
 * Created by sunwei on 2018/1/15 Time:14:06
 */
public class SessionUtils {
    private static Logger logger = LoggerFactory.getLogger(SessionUtils.class);


    /**
     * 获取会话服务器地址
     */
    public static String getSessionHost() {
        return "this is sessionHost";
    }

    /**
     * 获取会话识别码
     */
    public static String getSessionCode() {
        return "this is sessionCode";
    }

    /**
     * 获取会话风格
     */
    public static String getSessionStyle() {
        return "this is sessionStyle";
    }

    /**
     * 获取当前语言
     */
    public static String getLanguage() {
        return "this is language";
    }


    /**
     * 获取SystemSession，获取session信息要用到
     */
    public static SystemSession getSession(ServletRequest request) {
        //对token前16位加密
        String tokenKey = EncryptUtil.getTokenKey(request);
        logger.info("tokenKey:" + tokenKey);
        //根据token从redis里面取对应的sesssion信息
        byte[] dataStr = RedisUtils.getInstance().getByteValue((tokenKey).getBytes());
        SystemSession systemSession = new SystemSession();
        if (!StringUtil.isNullOrEmpty(dataStr)) {
            //如果取出的session信息不为空则转成systemSession
            systemSession = (SystemSession) SerializeUtils.deserialize(dataStr);
        }
        return systemSession;
    }

}
