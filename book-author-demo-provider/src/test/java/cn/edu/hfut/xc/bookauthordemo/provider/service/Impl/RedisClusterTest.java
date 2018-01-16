package cn.edu.hfut.xc.bookauthordemo.provider.service.Impl;

import cn.edu.hfut.xc.bookauthordemo.provider.BookAuthorDemoProviderApplication;
import cn.edu.hfut.xc.bookauthordemo.provider.config.RedisUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.JedisCluster;

import java.util.HashSet;

/**
 * Created by sunwei on 2018/1/15 Time:9:56
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = BookAuthorDemoProviderApplication.class)
public class RedisClusterTest {
    @Test
    public void testJedisCluster() throws Exception{
//        JedisPoolConfig config = new JedisPoolConfig();
//        config =new JedisPoolConfig();
//        config.setMaxTotal(60000);//设置最大连接数
//        config.setMaxIdle(1000); //设置最大空闲数
//        config.setMaxWaitMillis(3000);//设置超时时间
//        config.setTestOnBorrow(true);

        HashSet<HostAndPort> nodes = new HashSet<HostAndPort>();
        nodes.add(new HostAndPort("192.168.152.133", 7001));
        nodes.add(new HostAndPort("192.168.152.133", 7002));
        nodes.add(new HostAndPort("192.168.152.133", 7003));
        nodes.add(new HostAndPort("192.168.152.133", 7004));
        nodes.add(new HostAndPort("192.168.152.133", 7005));
        nodes.add(new HostAndPort("192.168.152.133", 7006));

        JedisCluster cluster = new JedisCluster(nodes);

        cluster.set("key1", "1000");
        String string = cluster.get("key1");
        System.out.println(string);

        cluster.close();
    }
    @Test
    public void RedisUtilsTest(){
        RedisUtils.getInstance().setValue("hello","你好");
        System.out.println(RedisUtils.getInstance().getKeys("hello"));
    }
}
