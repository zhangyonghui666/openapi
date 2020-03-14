package com.qianfeng.openapi.order.client;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
//对应服务提供者在Eureka中的名称
@FeignClient(value = "openapi-warehouse",fallback = HouseFeignClientHystric.class)
public interface HouseFeignClient {
    //和服务提供者在HouseProductControl定义的接口一一对应
    @RequestMapping("/house/productres/{skuId}/{cnt}")
    public int updateProduct(@PathVariable("skuId") Long skuId, @PathVariable("cnt") Integer cnt);
}







