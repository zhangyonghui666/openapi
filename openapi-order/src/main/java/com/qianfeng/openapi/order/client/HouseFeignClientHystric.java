package com.qianfeng.openapi.order.client;

import org.springframework.stereotype.Component;

@Component
public class HouseFeignClientHystric implements HouseFeignClient {
    @Override
    public int updateProduct(Long skuId, Integer cnt) {
        System.out.println("进入断路器......");
        throw new RuntimeException("修改库存失败.");
    }
}
