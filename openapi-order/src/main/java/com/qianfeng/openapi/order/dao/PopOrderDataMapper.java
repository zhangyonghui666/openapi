package com.qianfeng.openapi.order.dao;


import com.qianfeng.openapi.order.pojo.PopOrderData;
import com.qianfeng.openapi.order.pojo.PopOrderDataExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface PopOrderDataMapper {
    long countByExample(PopOrderDataExample example);

    int deleteByExample(PopOrderDataExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PopOrderData record);

    int insertSelective(PopOrderData record);

    List<PopOrderData> selectByExample(PopOrderDataExample example);

    PopOrderData selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PopOrderData record, @Param("example") PopOrderDataExample example);

    int updateByExample(@Param("record") PopOrderData record, @Param("example") PopOrderDataExample example);

    int updateByPrimaryKeySelective(PopOrderData record);

    int updateByPrimaryKey(PopOrderData record);

    Map<String,Object> selectByOrderId(@Param("id") long id);

}