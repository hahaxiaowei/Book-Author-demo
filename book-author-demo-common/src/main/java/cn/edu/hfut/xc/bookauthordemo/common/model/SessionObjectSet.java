package cn.edu.hfut.xc.bookauthordemo.common.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Map;

/**
 * Created by sunwei on 2018/1/11 Time:14:39
 */
public class SessionObjectSet implements Serializable {
    private static final long serialVersionUID = 8664350155115979577L;

    private Map<String, Object> sessionnRelatedObject;//会话关联对象
    private Date lastInteractDate;//最后一次交互时间

    public SessionObjectSet(Map<String, Object> sessionnRelatedObject, Date lastInteractDate) {
        this.sessionnRelatedObject = sessionnRelatedObject;
        this.lastInteractDate = lastInteractDate;
    }

    public Map<String, Object> getSessionnRelatedObject() {
        return sessionnRelatedObject;
    }


    public Date getLastInteractDate() {
        return lastInteractDate;
    }

    public void setSessionnRelatedObject(Map<String, Object> sessionnRelatedObject) {
        this.sessionnRelatedObject = sessionnRelatedObject;
    }

    public void setLastInteractDate(Date lastInteractDate) {
        this.lastInteractDate = lastInteractDate;
    }
}
