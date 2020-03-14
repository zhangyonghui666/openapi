package com.qianfeng.openapi.order.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.qianfeng.openapi.order.pojo.PopOrderData;
import com.qianfeng.openapi.order.service.PopOrderDataService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@Api(description = "订单管理api",value = "订单管理")
public class OrderController {
    private final static Logger log = LoggerFactory.getLogger(OrderController.class);
    @Autowired
    private PopOrderDataService popOrderDataService;
    @ApiOperation(value = "退货接口")
    @RequestMapping("/ordercancel")
    public String can(@ApiParam(name = "param_json",defaultValue = "{\"order_id\":\"1\",\"cancel_type\":\"1\",\"cancel_reason\":\"不想买\",\"exp\":\"0\"}",value = "取消订单",required = true) @RequestParam("param_json") String param_json){
        JSONObject jsonObject = JSON.parseObject(param_json);
        String order_id1 = (String) jsonObject.get("order_id");
        Long  order_id = Long.parseLong(order_id1);
        Object del_apply_type = jsonObject.get("del_apply_type");
        Object del_apply_reason = jsonObject.get("del_apply_reason");
        String exp =jsonObject.getString("exp");

        Map<String,Object> map = new HashMap<>();

        PopOrderData popOrderData = new PopOrderData();
        popOrderData.setId(order_id);
        popOrderData.setState(6L);
        int i = 0;
        try {
            i = popOrderDataService.updateStatus(popOrderData, exp);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if(i>=2){
            map.put("code","ok");
            map.put("msg","退货成功");
        }else {
            map.put("code","-1");
            map.put("msg","退货失败");
        }
        String s = JSON.toJSONString(map);
        return s;
    }

    @ApiOperation(value = "查询接口")
    @GetMapping("/orderget")
    public String findById(@ApiParam(name = "param_json",defaultValue = "{\"order_id\":\"1\",\"order_state\":\"1\"}",value = "查询订单",required = true) @RequestParam("param_json") String param_json){
        JSONObject jsonObject = JSON.parseObject(param_json);
        String order_id1 = (String) jsonObject.get("order_id");
        Long  order_id = Long.parseLong(order_id1);
        Object order_state = jsonObject.get("order_state");
        Map<String, Object> byId = popOrderDataService.findByOrderId(order_id);
        String s = JSON.toJSONString(byId);
//        System.out.println(s);
        return s;
    }


}
