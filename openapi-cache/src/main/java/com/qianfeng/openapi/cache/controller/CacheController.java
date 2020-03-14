package com.qianfeng.openapi.cache.controller;

//

import com.qianfeng.openapi.cache.api.RedisServiceApi;
import com.qianfeng.openapi.cache.exception.ExceptionDict;
import com.qianfeng.openapi.cache.exception.RedisException;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.Set;

/**
 * todo: 缓存模块，就是对Redis的CRUD：
 */
@RestController // 因为包含了@ResponseBody注解，所以使用了这个注解，spring会把这个类里边的所有handler，返回的信息放到response的body中，不会再去走视图解析器了
@RequestMapping("/cache")
@Api(description = "缓存的controller")  // 在线接口文档用到的，description——描述；
public class CacheController {
    @Autowired
    private RedisServiceApi redisServiceApi;

    /**
     * todo : 保存字符串数据到redis中
     *
     * @param key
     * @param value
     * @param expire
     */
    @ApiOperation("添加字符串到缓存") // 在线接口文档用到的，对该handler的描述："添加字符串到缓存"；
    @RequestMapping(value = "/save2cache", method = RequestMethod.GET)
    // @ApiParam（name=在线接口文档中的，参数名称）； required = true：是不是必填的； defaultValue：默认值；
    public boolean save2cache(@ApiParam(name = "key", required = true, defaultValue = "laowang") String key, @ApiParam(name = "value", required = true, defaultValue = "qianfengdiyijian") String value, @ApiParam(required = true, defaultValue = "10000") long expire) {
        //有效期是个数字,用户就可能会传递负数
        //有效期为负数的情况下我们应该如何处理,
        // 比如不管,报错,转成正数,认为不设置有效期等等都可以

        //我们无法控制用户,所以用户可能会出现参数不传递的情况
        checkKey(key);
        return redisServiceApi.set(key, value, expire);

    }

    /**
     * 获取hash类型的数据的操作：hgetAll 获得所有的key/value对
     * @param key
     * @return
     */
    @GetMapping("/hgetall/{key}")
    public Map<Object, Object> hgetAll(@PathVariable("key") String key) {
        checkKey(key);
        return redisServiceApi.hGetAll(key);
    }

    @RequestMapping("/members/{key}")
    public Set<String> members(@PathVariable String key) {
        checkKey(key);
        return redisServiceApi.getlijiawei(key);
    }

    @RequestMapping("/get/{key}")
    public String get(@PathVariable String key) {
        checkKey(key);
        return redisServiceApi.get(key);
    }



    @RequestMapping("/hget/{key}/{field}")
    public String hget(@PathVariable String key, @PathVariable String field) {
        checkKey(key);
        checkKey(field);
        return redisServiceApi.hget(key, field);
    }


    @RequestMapping("/hincr/{key}/{field}")
    public long hdecr(@PathVariable String key, @PathVariable String field, @RequestParam(defaultValue = "0") long increment) {
        checkKey(key);

        checkKey(field);

        increment = increment == 0 ? -1 : increment;

        return redisServiceApi.hdecr(key, field, increment);
    }

    @RequestMapping("/keys/{partten}")
    public Set<String> keys(@PathVariable  String partten) {

        return redisServiceApi.keys(partten);
    }

    @PostMapping("/mput/{key}")
    public boolean mPut(@PathVariable String key, @RequestBody  Map fieldValue) {
        checkKey(key);
        redisServiceApi.mPut(key, fieldValue);
        return true;
    }


    /**
     * todo: 检查key是否格式正确；
     * @param key
     */
    private void checkKey(String key) {
        if (key == null || "".equalsIgnoreCase(key.trim())) {
            throw new RedisException(ExceptionDict.REDISKEYISNULL, "redis的key不能为空");
        }
    }

}
