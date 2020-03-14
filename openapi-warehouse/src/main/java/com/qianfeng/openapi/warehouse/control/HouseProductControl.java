package com.qianfeng.openapi.warehouse.control;

import com.qianfeng.openapi.warehouse.service.HouserProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HouseProductControl {

    @Autowired
    private HouserProductService houserProductService;

    @RequestMapping("/house/productres/{skuId}/{cnt}")
    @ResponseBody
    public int updateProduct(@PathVariable("skuId") Long skuId , @PathVariable("cnt") Integer cnt){
        Map<String,Object> map = new HashMap<>();
        int i = houserProductService.updateHouse(skuId,cnt);
        return i;
    }

}
