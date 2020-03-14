package com.qianfeng.openapi.gateway.listener;

//


import com.qianfeng.openapi.gateway.constans.SystemParameter;
import com.qianfeng.openapi.gateway.feign.RedisService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.util.Map;
import java.util.Set;

/**
 *  todo: 在网关启动的时候，通过该监听器，从Redis中 把固定数据（各个服务模块中的接口信息）给加载过来，存到网关的缓存中；
 *
 *  补充： javaWeb中学过的八个监听器：
 *  ServletContextListener, ServletContextAttributeListener, HttpSessionListener,
 *  HttpSessionAttributeListener, HttpSessionBindingListener, HttpSessionActivationListener,
 *  ServletRequestListener, ServletRequestAttributeListener
 *

 */
@Component
public class MyContextLoadlistener implements ServletContextListener {
    Logger logger = LoggerFactory.getLogger(MyContextLoadlistener.class);

    @Autowired
    private RedisService redisService;

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        //spring在这里初始化对象

        //在这里加载数据,连接redis查询应用信息,查询所有的应用的信息,根据key查, 怎么知道所有的key
        //我们所有的key都是以Apiname:开头
        Set<String> keys = redisService.keys(SystemParameter.REDISAPIPRE + "*");

        // 常量类里边提前定义好的一个map,先清空一下；
        SystemParameter.allApiInfoMap.clear();
        //获取所有key的数据
        for (String key : keys) {
            Map<Object, Object> result = redisService.hgetAll(key);
            SystemParameter.allApiInfoMap.put(key, result);
        }
        logger.error("初始化api信息,得到的结果是:{}", SystemParameter.allApiInfoMap);


    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
