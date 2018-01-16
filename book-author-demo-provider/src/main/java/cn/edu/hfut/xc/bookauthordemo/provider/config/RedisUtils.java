package cn.edu.hfut.xc.bookauthordemo.provider.config;

import cn.edu.hfut.xc.bookauthordemo.common.util.StringUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * Created by sunwei on 2018/1/15 Time:10:09
 */
@Service
@Lazy(false)
public class RedisUtils {
    private Logger logger = LoggerFactory.getLogger(RedisUtils.class);
    @Value("${redisNodes}")
    String redisNodes;
    private static String tempRedisNodes;
    private static RedisClusterUtils instance = null;

    public RedisUtils() {
    }

    @PostConstruct
    public void init() {
        tempRedisNodes = this.redisNodes;
        this.logger.info("redisNodes : " + tempRedisNodes);
    }

    public static RedisClusterUtils getInstance() {
        if (instance == null) {
            Class var0 = RedisUtils.class;
            synchronized (RedisUtils.class) {
                if (instance == null) {
                    if (StringUtil.isNullOrEmpty(tempRedisNodes)) {
                        throw new RuntimeException("redis services config error : redisNodes can not be null ");
                    }

                    instance = new RedisClusterUtils(tempRedisNodes);
                }
            }
        }

        return instance;
    }
}


