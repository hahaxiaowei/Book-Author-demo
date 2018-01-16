package cn.edu.hfut.xc.bookauthordemo.provider.config;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import redis.clients.jedis.*;

/**
 * Created by sunwei on 2018/1/11 Time:15:28
 */
public class RedisClusterUtils {
    private static final Logger logger = LoggerFactory.getLogger(RedisClusterUtils.class);
    private static final int DEFAULT_TIMEOUT = 5000;
    private static final int DEFAULT_MAX_REDIRECTIONS = 5;
    private static final int MAX_TOTAL = 20;
    private static final int MAX_IDLE = 20;
    private static final int MIN_IDLE = 5;
    private static final long MAX_WAIT_MILLIS = 6000L;
    private static JedisPoolConfig config;
    private static JedisCluster jedisCluster;

    public RedisClusterUtils(String nodesString) {
        this.genJedisConfig();
        String[] serverArray = nodesString.split(",");
        Set<HostAndPort> nodes = new HashSet();
        String[] var4 = serverArray;
        int var5 = serverArray.length;

        for(int var6 = 0; var6 < var5; ++var6) {
            String ipPort = var4[var6];
            String[] ipPortPair = ipPort.split(":");
            nodes.add(new HostAndPort(ipPortPair[0].trim(), Integer.valueOf(ipPortPair[1].trim()).intValue()));
        }

        jedisCluster = new JedisCluster(nodes, 5000, 5, config);
    }

    private void genJedisConfig() {
        config = new JedisPoolConfig();
        config.setMaxTotal(20);
        config.setMaxIdle(20);
        config.setMinIdle(5);
        config.setMaxWaitMillis(6000L);
        config.setTestOnBorrow(true);
    }

    public static void clusterClose() {
        try {
            if (jedisCluster != null) {
                jedisCluster.close();
            }

        } catch (Exception var1) {
            var1.printStackTrace();
            logger.error("some error occur when execute clusterClose function:", var1);
            throw new RuntimeException("some error occur when execute clusterClose function:", var1);
        }
    }

    public boolean setValue(String key, String value) {
        boolean OK = false;

        try {
            String ret = jedisCluster.set(key, value);
            OK = "OK".equals(ret);
            return OK;
        } catch (Exception var5) {
            OK = false;
            var5.printStackTrace();
            logger.error("some error occur when execute setValue function:", var5);
            throw new RuntimeException("some error occur when execute setValue function:", var5);
        }
    }

    public boolean setByteValue(byte[] key, byte[] value) {
        boolean OK = false;

        try {
            String ret = jedisCluster.set(key, value);
            OK = "OK".equals(ret);
            return OK;
        } catch (Exception var5) {
            OK = false;
            var5.printStackTrace();
            logger.error("some error occur when execute setByteValue function:", var5);
            throw new RuntimeException("some error occur when execute setByteValue function:", var5);
        }
    }

    public String getValue(String key) {
        String value = null;

        try {
            value = jedisCluster.get(key);
            return value;
        } catch (Exception var4) {
            var4.printStackTrace();
            logger.error("some error occur when execute getValue function:", var4);
            throw new RuntimeException("some error occur when execute getValue function:", var4);
        }
    }

    public byte[] getByteValue(byte[] key) {
        Object var2 = null;

        try {
            byte[] value = jedisCluster.get(key);
            return value;
        } catch (Exception var4) {
            var4.printStackTrace();
            logger.error("some error occur when execute getByteValue function:", var4);
            throw new RuntimeException("some error occur when execute getByteValue function:", var4);
        }
    }

    public boolean setValue(String key, String value, int expireSec) {
        boolean OK = false;

        try {
            String ret = jedisCluster.setex(key, expireSec, value);
            OK = "OK".equals(ret);
            return OK;
        } catch (Exception var6) {
            OK = false;
            var6.printStackTrace();
            logger.error("some error occur when execute setValue function:", var6);
            throw new RuntimeException("some error occur when execute setValue function:", var6);
        }
    }

    public boolean setValue(String key, byte[] value, int expireSec) {
        boolean OK = false;

        try {
            String ret = jedisCluster.setex(key, expireSec, value.toString());
            OK = "OK".equals(ret);
            return OK;
        } catch (Exception var6) {
            OK = false;
            var6.printStackTrace();
            logger.error("some error occur when execute setValue function:", var6);
            throw new RuntimeException("some error occur when execute setValue function:", var6);
        }
    }

    public boolean setValue(byte[] key, byte[] value, int expireSec) {
        boolean OK = false;

        try {
            String ret = jedisCluster.setex(key, expireSec, value);
            OK = "OK".equals(ret);
            return OK;
        } catch (Exception var6) {
            OK = false;
            var6.printStackTrace();
            logger.error("some error occur when execute setValue function:", var6);
            throw new RuntimeException("some error occur when execute setValue function:", var6);
        }
    }

    public long add2set(String key, String... values) {
        long ret = 0L;

        try {
            ret = jedisCluster.sadd(key, values).longValue();
            return ret;
        } catch (Exception var6) {
            var6.printStackTrace();
            logger.error("some error occur when execute add2set function:", var6);
            throw new RuntimeException("some error occur when execute add2set function:", var6);
        }
    }

    public long add2set(String key, byte[]... values) {
        long ret = 0L;

        try {
            ret = jedisCluster.sadd(key.getBytes(), values).longValue();
            return ret;
        } catch (Exception var6) {
            var6.printStackTrace();
            logger.error("some error occur when execute add2set function:", var6);
            throw new RuntimeException("some error occur when execute add2set function:", var6);
        }
    }

    public boolean sismember(String key, String member) {
        boolean b = false;

        try {
            b = jedisCluster.sismember(key, member).booleanValue();
            return b;
        } catch (Exception var5) {
            var5.printStackTrace();
            logger.error("some error occur when execute sismember function:", var5);
            throw new RuntimeException("some error occur when execute sismember function:", var5);
        }
    }

    public void srem(String key, String... member) {
        try {
            jedisCluster.srem(key, member);
        } catch (Exception var4) {
            var4.printStackTrace();
            logger.error("some error occur when execute srem function:", var4);
            throw new RuntimeException("some error occur when execute srem function:", var4);
        }
    }

    public Set<String> smembers(String key) {
        Set ret = null;

        try {
            ret = jedisCluster.smembers(key);
            return ret;
        } catch (Exception var4) {
            var4.printStackTrace();
            logger.error("some error occur when execute smembers function:", var4);
            throw new RuntimeException("some error occur when execute smembers function:", var4);
        }
    }

    public String getSet(String key, String value) {
        String str = null;

        try {
            str = jedisCluster.getSet(key, value);
            return str;
        } catch (Exception var5) {
            var5.printStackTrace();
            logger.error("some error occur when execute getSet function:", var5);
            throw new RuntimeException("some error occur when execute getSet function:", var5);
        }
    }

    public Set<byte[]> getBinarySet(String key) {
        Set ret = null;

        try {
            ret = jedisCluster.smembers(key.getBytes());
            return ret;
        } catch (Exception var4) {
            var4.printStackTrace();
            logger.error("some error occur when execute getBinarySet function:", var4);
            throw new RuntimeException("some error occur when execute getBinarySet function:", var4);
        }
    }

    public String renameKey(String oldKey, String newKey) {
        String ret = "";

        try {
            jedisCluster.set(newKey, jedisCluster.get(oldKey));
            jedisCluster.del(oldKey);
            return ret;
        } catch (Exception var5) {
            var5.printStackTrace();
            logger.error("some error occur when execute renameKey function:", var5);
            throw new RuntimeException("some error occur when execute renameKey function:", var5);
        }
    }

    public Set<String> getKeys(String pattern) {
        TreeSet keys = null;

        try {
            keys = new TreeSet();
            Map<String, JedisPool> clusterNodes = jedisCluster.getClusterNodes();
            Iterator var4 = clusterNodes.keySet().iterator();

            while(var4.hasNext()) {
                String k = (String)var4.next();
                JedisPool jp = (JedisPool)clusterNodes.get(k);
                Jedis connection = jp.getResource();

                try {
                    keys.addAll(connection.keys(pattern));
                } catch (Exception var13) {
                    var13.printStackTrace();
                } finally {
                    connection.close();
                }
            }

            return keys;
        } catch (Exception var15) {
            var15.printStackTrace();
            logger.error("some error occur when execute getKeys function:", var15);
            throw new RuntimeException("some error occur when execute getKeys function:", var15);
        }
    }

    public boolean delKey(String key) {
        boolean OK = false;

        try {
            long ret = jedisCluster.del(key).longValue();
            OK = ret == 1L;
            return OK;
        } catch (Exception var5) {
            OK = false;
            var5.printStackTrace();
            logger.error("some error occur when execute delKey function:", var5);
            throw new RuntimeException("some error occur when execute delKey function:", var5);
        }
    }

    public String setCounter(String topic, String key, long value) {
        String ret = null;

        try {
            ret = jedisCluster.set(topic + "_" + key, String.valueOf(value));
            return ret;
        } catch (Exception var7) {
            var7.printStackTrace();
            logger.error("some error occur when execute setCounter function:", var7);
            throw new RuntimeException("some error occur when execute setCounter function:", var7);
        }
    }

    public long incrCounter(String topic, String key) {
        long ret = 0L;

        try {
            ret = jedisCluster.incr(topic + "_" + key).longValue();
            return ret;
        } catch (Exception var6) {
            var6.printStackTrace();
            logger.error("some error occur when execute incrCounter function:", var6);
            throw new RuntimeException("some error occur when execute incrCounter function:", var6);
        }
    }

    public long incrCounter(String topic, String key, long num) {
        long ret = 0L;

        try {
            ret = jedisCluster.incrBy(topic + "_" + key, num).longValue();
            return ret;
        } catch (Exception var8) {
            var8.printStackTrace();
            logger.error("some error occur when execute incrCounter function:", var8);
            throw new RuntimeException("some error occur when execute incrCounter function:", var8);
        }
    }

    public void resetCounter(String topic, String... keys) {
        try {
            String[] var3 = keys;
            int var4 = keys.length;

            for(int var5 = 0; var5 < var4; ++var5) {
                String key = var3[var5];
                jedisCluster.del(topic + "_" + key);
            }

        } catch (Exception var7) {
            var7.printStackTrace();
            logger.error("some error occur when execute resetCounter function:", var7);
            throw new RuntimeException("some error occur when execute resetCounter function:", var7);
        }
    }

    public void resetCounter(String keyPrefix) {
        try {
            Set<String> keys = jedisCluster.hkeys(keyPrefix);
            Iterator var3 = keys.iterator();

            while(var3.hasNext()) {
                String key = (String)var3.next();
                jedisCluster.del(key);
            }

        } catch (Exception var5) {
            var5.printStackTrace();
            logger.error("some error occur when execute resetCounter function:", var5);
            throw new RuntimeException("some error occur when execute resetCounter function:", var5);
        }
    }

    public void delete(String... keys) {
        try {
            String[] var2 = keys;
            int var3 = keys.length;

            for(int var4 = 0; var4 < var3; ++var4) {
                String key = var2[var4];
                jedisCluster.del(key);
            }

        } catch (Exception var6) {
            var6.printStackTrace();
            logger.error("some error occur when execute delete function:", var6);
            throw new RuntimeException("some error occur when execute delete function:", var6);
        }
    }

    public void delete(byte[]... keys) {
        try {
            byte[][] var2 = keys;
            int var3 = keys.length;

            for(int var4 = 0; var4 < var3; ++var4) {
                byte[] key = var2[var4];
                jedisCluster.del(key);
            }

        } catch (Exception var6) {
            var6.printStackTrace();
            logger.error("some error occur when execute delete function:", var6);
            throw new RuntimeException("some error occur when execute delete function:", var6);
        }
    }

    public boolean setValueIfNotExist(String key, String value) {
        boolean ret = false;

        try {
            long flag = jedisCluster.setnx(key, value).longValue();
            ret = flag != 0L;
            return ret;
        } catch (Exception var6) {
            var6.printStackTrace();
            logger.error("some error occur when execute setValueIfNotExist function:", var6);
            throw new RuntimeException("some error occur when execute setValueIfNotExist function:", var6);
        }
    }

    public void setHashMap(String key, Map<String, Integer> map) {
        try {
            Iterator var3 = map.keySet().iterator();

            while(var3.hasNext()) {
                String name = (String)var3.next();
                jedisCluster.hset(key, name, String.valueOf(map.get(name)));
            }

        } catch (Exception var5) {
            var5.printStackTrace();
            logger.error("some error occur when execute setHashMap function:", var5);
            throw new RuntimeException("some error occur when execute setHashMap function:", var5);
        }
    }

    public Map<String, String> getHashMap(String key) {
        Map map = null;

        try {
            map = jedisCluster.hgetAll(key);
            return map;
        } catch (Exception var4) {
            var4.printStackTrace();
            logger.error("some error occur when execute getHashMap function:", var4);
            throw new RuntimeException("some error occur when execute getHashMap function:", var4);
        }
    }

    public void pushList(String key, String value) {
        try {
            jedisCluster.lpush(key, new String[]{value});
        } catch (Exception var4) {
            var4.printStackTrace();
            logger.error("some error occur when execute pushList function:", var4);
            throw new RuntimeException("some error occur when execute pushList function:", var4);
        }
    }

    public String rpop(String key) {
        String ret = null;

        try {
            ret = jedisCluster.rpop(key);
            return ret;
        } catch (Exception var4) {
            var4.printStackTrace();
            logger.error("some error occur when execute rpop function:", var4);
            throw new RuntimeException("some error occur when execute rpop function:", var4);
        }
    }

    public void expire(String key, int seconds) {
        try {
            jedisCluster.expire(key, seconds);
        } catch (Exception var4) {
            var4.printStackTrace();
            logger.error("some error occur when execute expire function:", var4);
            throw new RuntimeException("some error occur when execute expire function:", var4);
        }
    }

    public void trimList(String key, int size) {
        try {
            jedisCluster.ltrim(key, 0L, (long)(size - 1));
        } catch (Exception var4) {
            var4.printStackTrace();
            logger.error("some error occur when execute trimList function:", var4);
            throw new RuntimeException("some error occur when execute trimList function:", var4);
        }
    }

    public List<String> rangeList(String key, int start, int end) {
        List ret = null;

        try {
            ret = jedisCluster.lrange(key, (long)start, (long)end);
            return ret;
        } catch (Exception var6) {
            var6.printStackTrace();
            logger.error("some error occur when execute rangeList function:", var6);
            throw new RuntimeException("some error occur when execute rangeList function:", var6);
        }
    }

    public long removeInList(String key, String value) {
        long ret = 0L;

        try {
            ret = jedisCluster.lrem(key, 0L, value).longValue();
            return ret;
        } catch (Exception var6) {
            var6.printStackTrace();
            logger.error("some error occur when execute removeInList function:", var6);
            throw new RuntimeException("some error occur when execute removeInList function:", var6);
        }
    }

    public void publish(String channel, String message) {
        try {
            jedisCluster.publish(channel, message);
        } catch (Exception var4) {
            var4.printStackTrace();
            logger.error("some error occur when execute publish function:", var4);
            throw new RuntimeException("some error occur when execute publish function:", var4);
        }
    }

    public static void main(String[] args) {
        String nodesString = "192.168.152.133:7001,192.168.152.133:7002,192.168.152.133:7003,192.168.152.133:7004,192.168.152.133:7005,192.168.152.133:7006";
        System.out.println("nodesString:" + nodesString);
        long time1 = System.currentTimeMillis();
        RedisClusterUtils rcu = new RedisClusterUtils(nodesString);
        System.out.println("======" + rcu.toString());
        rcu.setValue("li", "chunjie");
        System.out.println(rcu.setValueIfNotExist("li2", "chunjie123"));
        System.out.println(rcu.getValue("li"));
    }
}
