package com.qianfeng.openapi.cache.api.impl;

import com.qianfeng.openapi.cache.api.RedisServiceApi;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 * todo: 实现对redis的CRUD：
 *       两步走：
 *          第一步，加载 StringRedisTemplate 模板对象；
 *          第二步，通过StringRedisTemplate 模板对象，执行相应的方法；
 */
@Service
public class RedisServiceImpl implements RedisServiceApi {

    /**
     * todo: 第一步，加载 StringRedisTemplate 模板对象；
     *              （ 加载日志对象Logger；）
     */
    @Autowired
    private StringRedisTemplate template;
    private Logger logger = LoggerFactory.getLogger(RedisServiceImpl.class);


    /**
     * todo: 第二步：存入数据到Redis中：opsForValue().set(key, value)方法；
     */
    @Override
    public boolean set(String key, String value, long expire) {
        logger.error("set方法执行--->key:{}--->value:{}===>expire:{}", key, value, expire);
        template.opsForValue().set(key, value);

        // 返回expire()方法，常规操作，记住就行；
        return expire(key, expire);
    }


    /**
     * todo : 第二步：从Redis中取数据，opsForValue().get(key)方法；
     */
    @Override
    public String get(String key) {
        logger.error("get方法执行--->key:{}", key);
        return template.opsForValue().get(key);
    }


    /**
     * todo : 第二步：从Redis中删除数据；delete(key)方法；
     */
    @Override
    public boolean deleteKey(String key) {
        logger.error("deleteKey方法执行--->key:{}", key);
        return template.delete(key);

    }


    /**
     * todo : 第二步：设置key的有效期；expire(key, expire)方法；
     */
    @Override
    public boolean expire(String key, long expire) {
        logger.error("expire方法执行--->key:{}--->expire{}", key, expire);
        return template.expire(key, expire, TimeUnit.MILLISECONDS);
    }


    /**
     * todo : 第二步：获取Redis的hash类型的map数据；（指定key）
     *               opsForHash().entries(key)：获取指定key的整个哈希值。
     */
    @Override
    public Map<Object, Object> hGetAll(String key) {
        Map<Object, Object> map = template.opsForHash().entries(key);
        return map;
    }


    /**
     * todo : 第二步：获取Redis中的set类型的数据（指定key）
     *          opsForSet().members(key)方法：通过指定的key,获取对应的set中的所有元素；
     */
    @Override
    public Set<String> getlijiawei(String key) {
        return template.opsForSet().members(key);

    }


    /**
     * todo: 第二步：获取Redis的hash类型的map数据中的value值；
     *         opsForHash().get(key,field)：获取指定key的哈希值中的field（key）对应的value值。
     */
    @Override
    public String hget(String key, String field) {
        return (String) template.opsForHash().get(key,field);
    }


    /**
     * todo : 第二步：查找与给定的partten匹配的所有key(键)。
     *               keys(partten)方法；
     */
    @Override
    public Set<String> keys(String partten) {
        return template.keys(partten);

    }

//    ---------- 后边的方法，不再一一解释： -----------

    @Override
    public long hdecr(String key, String field, long increment) {
        return template.opsForHash().increment(key, field, increment);
    }

    @Override
    public void mPut(String key, Map fieldValue) {
        template.opsForHash().putAll(key, fieldValue);
    }
}
