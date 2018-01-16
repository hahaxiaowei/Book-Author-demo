package cn.edu.hfut.xc.bookauthordemo.common.model;

import java.io.Serializable;
import java.util.Map;

/**
 * Created by sunwei on 2018/1/11 Time:14:33
 */
public class SystemSession implements Serializable {

    private static final long serialVersionUID = 4779596346134257971L;
    /**
     * 会话服务器地址
     */
    private String sessionHost;

    /**
     * 会话识别码
     */
    private String sessionCode;

    /**
     * 会话语言
     */
    private String language;

    /**
     * 会话风格
     */
    private String sessionStyle;

    /**
     * 作者对象
     */
    private Author author;

    /**
     * 会话对象集合
     */
    private Map<String, SessionObjectSet> sessionnObjectSet;

    /**
     * 当前活跃对象
     */
    private CurrentStatus currentStatus;


    public String getSessionHost() {
        return sessionHost;
    }

    public String getSessionCode() {
        return sessionCode;
    }

    public String getLanguage() {
        return language;
    }

    public String getSessionStyle() {
        return sessionStyle;
    }



    public void setSessionHost(String sessionHost) {
        this.sessionHost = sessionHost;
    }

    public void setSessionCode(String sessionCode) {
        this.sessionCode = sessionCode;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setSessionStyle(String sessionStyle) {
        this.sessionStyle = sessionStyle;
    }


    public Map<String, SessionObjectSet> getSessionnObjectSet() {
        return sessionnObjectSet;
    }

    public void setSessionnObjectSet(Map<String, SessionObjectSet> sessionnObjectSet) {
        this.sessionnObjectSet = sessionnObjectSet;
    }

    public CurrentStatus getCurrentStatus() {
        return currentStatus;
    }

    public void setCurrentStatus(CurrentStatus currentStatus) {
        this.currentStatus = currentStatus;
    }
}
