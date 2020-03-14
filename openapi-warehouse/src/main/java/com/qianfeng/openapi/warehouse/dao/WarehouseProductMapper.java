package com.qianfeng.openapi.warehouse.dao;

import com.qianfeng.openapi.warehouse.pojo.WarehouseProduct;
import com.qianfeng.openapi.warehouse.pojo.WarehouseProductExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface WarehouseProductMapper {
    long countByExample(WarehouseProductExample example);

    int deleteByExample(WarehouseProductExample example);

    int deleteByPrimaryKey(Integer wpId);

    int insert(WarehouseProduct record);

    int insertSelective(WarehouseProduct record);

    List<WarehouseProduct> selectByExample(WarehouseProductExample example);

    WarehouseProduct selectByPrimaryKey(Integer wpId);

    int updateByExampleSelective(@Param("record") WarehouseProduct record, @Param("example") WarehouseProductExample example);

    int updateByExample(@Param("record") WarehouseProduct record, @Param("example") WarehouseProductExample example);

    int updateByPrimaryKeySelective(WarehouseProduct record);

    int updateByPrimaryKey(WarehouseProduct record);
}