package com.qianfeng.openapi.gateway.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;
import java.util.Set;

/**
 * todo : 这里是网关模块，这里是用Feign去调用Redis模块；
 */
@FeignClient("OPENAPI-CACHE")
public interface RedisService {

    @RequestMapping("/cache/hgetall/{key}")
    Map<Object, Object> hgetAll(@PathVariable String key);

    @RequestMapping("/cache/members/{key}")
    Set<String> members(@PathVariable String key);

    @RequestMapping("/cache/get/{key}")
    String get(@PathVariable String key);

    @RequestMapping("/cache/save2cache")
    void set(@RequestParam("key") String key, @RequestParam("value") String value, @RequestParam("expire") long expire);

    @RequestMapping("/cache/hget/{key}/{field}")
    String hget(@PathVariable String key, @PathVariable String field);


    @RequestMapping("/cache/hincr/{key}/{field}")
    long hdecr(@PathVariable String key, @PathVariable String field, @RequestParam(name = "increment", defaultValue = "0") long increment);


    @RequestMapping("/cache/keys/{partten}")
    Set<String> keys(@PathVariable  String partten);

}
