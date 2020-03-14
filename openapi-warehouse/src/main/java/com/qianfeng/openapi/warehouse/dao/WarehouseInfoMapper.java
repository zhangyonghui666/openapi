package com.qianfeng.openapi.warehouse.dao;

import com.qianfeng.openapi.warehouse.pojo.WarehouseInfo;
import com.qianfeng.openapi.warehouse.pojo.WarehouseInfoExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface WarehouseInfoMapper {
    long countByExample(WarehouseInfoExample example);

    int deleteByExample(WarehouseInfoExample example);

    int deleteByPrimaryKey(Short wId);

    int insert(WarehouseInfo record);

    int insertSelective(WarehouseInfo record);

    List<WarehouseInfo> selectByExample(WarehouseInfoExample example);

    WarehouseInfo selectByPrimaryKey(Short wId);

    int updateByExampleSelective(@Param("record") WarehouseInfo record, @Param("example") WarehouseInfoExample example);

    int updateByExample(@Param("record") WarehouseInfo record, @Param("example") WarehouseInfoExample example);

    int updateByPrimaryKeySelective(WarehouseInfo record);

    int updateByPrimaryKey(WarehouseInfo record);
}