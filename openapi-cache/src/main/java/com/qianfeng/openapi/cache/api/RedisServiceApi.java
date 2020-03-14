package com.qianfeng.openapi.cache.api;
//


import java.util.Map;
import java.util.Set;

/**
 * todo : 实现对Redis的CRUD：
 */
public interface RedisServiceApi {
    /**
     * 保存字符串到redis中
     * @param key
     * @param value
     * @param expire
     */
     boolean set(String key, String value, long expire);

    /**
     * 从redis中获取字符串
     * @param key
     * @return
     */
    String get(String key);

    /**
     * 删除key
     * @param key
     * @return
     */
    boolean deleteKey(String key);

    /**
     * 设置有效期
     * @param key
     * @param expire
     * @return
     */
    boolean expire(String key, long expire);


   Map<Object,Object> hGetAll(String key);

    /**
     * 从redis中获取指定set的值  lijiewei就是一个set
     * @param key
     * @return
     */
   Set<String> getlijiawei(String key);

    /**
     * 从redis获取指定key的field的值
     * @param key
     * @param field
     * @return
     */
    String hget(String key, String field);

    /**
     * hash中自增或者自减
     * @param key
     * @param field
     * @return
     */
    long hdecr(String key, String field,long increment);

    /**
     * 查询指定的结构的key
     * @param partten
     * @return
     */
    Set<String> keys(String partten);

    /**
     * 向redis批量设置hash内容
     * @param key
     * @param fieldValue
     */
    void mPut(String key, Map fieldValue);

}
