package com.qianfeng.openapi.warehouse.service.impl;

import com.codingapi.txlcn.tc.annotation.LcnTransaction;
import com.qianfeng.openapi.warehouse.dao.WarehouseProductMapper;
import com.qianfeng.openapi.warehouse.pojo.WarehouseProduct;
import com.qianfeng.openapi.warehouse.pojo.WarehouseProductExample;
import com.qianfeng.openapi.warehouse.service.HouserProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class HouserProductServiceImpl implements HouserProductService {

    @Autowired
    private WarehouseProductMapper warehouseProductMapper;


    @Override
    @LcnTransaction//通过lcn来控制这个事务
    @Transactional //让spring来控制这个本地事务,防止出现异常的时候不回滚
    public int updateHouse(Long skuId, int cnt) {
        WarehouseProductExample example = new WarehouseProductExample();
        WarehouseProductExample.Criteria criteria = example.createCriteria();
        criteria.andProductIdEqualTo(skuId.intValue());
        List<WarehouseProduct> warehouseProducts = warehouseProductMapper.selectByExample(example);
        WarehouseProduct warehouseProduct = warehouseProducts.get(0);
        warehouseProduct.setCurrentCnt(warehouseProduct.getCurrentCnt()+cnt);
        int i = warehouseProductMapper.updateByPrimaryKeySelective(warehouseProduct);

        return i;
    }
}
