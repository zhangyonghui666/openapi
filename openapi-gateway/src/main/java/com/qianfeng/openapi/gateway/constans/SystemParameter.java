package com.qianfeng.openapi.gateway.constans;
//
//

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 *
 */
public interface SystemParameter {
    String REDISAPIPRE="Apiname:";//这个是服务在接口中的key的前缀
    String REDISAPPKEYPRE="APPKEY:";//这个是应用在redis中的信息的key
    String REDISAPILIMIEPRE = "APILIMIT:";//这是用户相关的接口剩余次数的key

    // 在网关中新建了一个map，用来存储接口的信息等固定数据，做网关的缓存使用；
    Map<String, Map<Object, Object>> allApiInfoMap = new ConcurrentHashMap<>();
}
