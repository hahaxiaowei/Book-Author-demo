package cn.edu.hfut.xc.bookauthordemo.provider.config;

import cn.edu.hfut.xc.bookauthordemo.common.util.StringUtil;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by sunwei on 2018/1/15 Time:17:38
 */
public class BusinessUtils {
    private static long crashTime = 5;
    /**
     * redis key值前缀项目识别码
     */
    public static String LOGIN_AUTHENTICATION_ = "LOGIN_AUTHENTICATION_";
    /**
     * @param phoneNumber
     * @return java.util.Map
     * @description 根据手机号获取合法验证码
     * @method getVerificatCode
     */
    public static Map<String, Object> getValidVerificatCode (String phoneNumber) throws InterruptedException {
        //根据手机号从redis里面取数据
        String value = RedisUtils.getInstance().getValue(LOGIN_AUTHENTICATION_+phoneNumber);

        if (!StringUtil.isNullOrEmpty(value)) {
            Map<String, Object> mapRedis = JSON.parseObject(value, Map.class);
            Long createTime = (Long) mapRedis.get("createTime");
            long laveTime = 60 - (System.currentTimeMillis() - createTime) / 1000;
            //剩余时间小于5s,创建新的
            if (laveTime > crashTime) {
                Map<String,Object> mapSecond = new HashMap<String,Object>();
                mapSecond.put("verificatCode",mapRedis.get("verificatCode"));
                mapSecond.put("time",laveTime);
                return mapSecond;
            }
        }
        // 重新创建验证码
        Map<String, Object> newMapSecond = new HashMap<String, Object>();
        int randNumSecond = 0 + (int) (Math.random() * 1000000);
        newMapSecond.put("createTime", System.currentTimeMillis());
        newMapSecond.put("verificatCode", randNumSecond);
        RedisUtils.getInstance().setValue(LOGIN_AUTHENTICATION_+phoneNumber, JSONObject.toJSONString(newMapSecond), 60);
        newMapSecond.put("time","60");
        return newMapSecond;
    }
}
