package com.qianfeng.openapi.order.service.impl;

import com.codingapi.txlcn.tc.annotation.LcnTransaction;
import com.qianfeng.openapi.order.client.HouseFeignClient;
import com.qianfeng.openapi.order.dao.PopOrderDataMapper;
import com.qianfeng.openapi.order.dao.PopOrderItemMapper;
import com.qianfeng.openapi.order.pojo.PopOrderData;
import com.qianfeng.openapi.order.pojo.PopOrderItem;
import com.qianfeng.openapi.order.pojo.PopOrderItemExample;
import com.qianfeng.openapi.order.service.PopOrderDataService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class PopOrderDataServiceImpl implements PopOrderDataService {
    @Autowired
    private PopOrderDataMapper popOrderDataMapper;
    @Autowired
    private PopOrderItemMapper popOrderItemMapper;
    @Autowired
    private HouseFeignClient houseFeignClient;


    private Logger logger = LoggerFactory.getLogger(PopOrderDataServiceImpl.class);


    @Override
    public Map<String, Object> findByOrderId(Long id) {
        Map<String, Object> qianfeng_pop_order_get_response = new HashMap<>();
        Map<String, Object> orderDetailInfo = new HashMap<>();
        Map<String, Object> all = new HashMap<>();
        Map<String, Object> res = popOrderDataMapper.selectByOrderId(id);
        //订单信息
        Map<String, Object> orderInfo = new HashMap<>();
        orderInfo.put("order_id",res.get("order_id"));
        orderInfo.put("vender_id",res.get("vender_id"));
        orderInfo.put("cky2",res.get("cky2"));
        orderInfo.put("payment_type",res.get("payment_type"));
        orderInfo.put("order_type",res.get("order_type"));
        orderInfo.put("freight",res.get("freight"));
        orderInfo.put("paysum_type",res.get("paysum_type"));
        orderInfo.put("state",res.get("state"));
        orderInfo.put("order_create_date",res.get("order_create_date"));
        //发票信息
        Map<String, Object> invoiceEasyInfo = new HashMap<>();
        invoiceEasyInfo.put("order_sum",res.get("order_sum"));
        invoiceEasyInfo.put("invoice_title",res.get("invoice_title"));
        invoiceEasyInfo.put("invoice_content_id",res.get("invoice_content_id"));
        invoiceEasyInfo.put("invoice_type",res.get("invoice_type"));
        invoiceEasyInfo.put("seller_order_sum",res.get("seller_order_sum"));
        invoiceEasyInfo.put("coupon_event_sum",res.get("coupon_event_sum"));
        //商品信息
        Map<String, Object> productInfo = new HashMap<>();
        productInfo.put("sku_id",res.get("sku_id"));
        productInfo.put("sku_name",res.get("sku_name"));
        productInfo.put("num",res.get("num"));
        productInfo.put("warranty",res.get("warranty"));
        productInfo.put("price",res.get("price"));
        productInfo.put("give_point",res.get("give_point"));
        productInfo.put("created",res.get("created"));
        //优惠信息
        Map<String, Object> couponInfo = new HashMap<>();
        couponInfo.put("rf_code",res.get("rf_code"));
        couponInfo.put("coupon_type",res.get("coupon_type"));
        couponInfo.put("coupon_price",res.get("coupon_price"));
        couponInfo.put("use_date",res.get("use_date"));
        couponInfo.put("operate_user",res.get("operate_user"));
        all.put("orderInfo",orderInfo);
        all.put("invoiceEasyInfo",invoiceEasyInfo);
        all.put("productInfo",productInfo);
        all.put("couponInfo",couponInfo);
        orderDetailInfo.put("orderDetailInfo",all);
        orderDetailInfo.put("code",0);
        qianfeng_pop_order_get_response.put("qianfeng_pop_order_get_response",orderDetailInfo);
        return qianfeng_pop_order_get_response;
    }

    @Override
    @Transactional
    @LcnTransaction
    public int updateStatus(PopOrderData pojo, String exp) {
        int i = popOrderDataMapper.updateByPrimaryKeySelective(pojo);
        Long id = pojo.getId();
        PopOrderData popOrderData = popOrderDataMapper.selectByPrimaryKey(id);
        Long orderId = popOrderData.getOrderId();
        PopOrderItemExample example = new PopOrderItemExample();
        PopOrderItemExample.Criteria criteria = example.createCriteria();
        criteria.andOrderIdEqualTo(orderId);
        List<PopOrderItem> popOrderItems = popOrderItemMapper.selectByExample(example);
        PopOrderItem popOrderItem = popOrderItems.get(0);
        Long skuId = popOrderItem.getSkuId();
        //更新仓库
        int updateProduct = houseFeignClient.updateProduct(skuId, 1);
        if("1".equals(exp)) {
            //人为制造异常
            int v = 100 / 0;
        }
        return i+updateProduct;
    }

}
