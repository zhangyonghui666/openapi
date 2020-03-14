package com.qianfeng.openapi.order.dao;


import com.qianfeng.openapi.order.pojo.PopOrderItem;
import com.qianfeng.openapi.order.pojo.PopOrderItemExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface PopOrderItemMapper {
    long countByExample(PopOrderItemExample example);

    int deleteByExample(PopOrderItemExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PopOrderItem record);

    int insertSelective(PopOrderItem record);

    List<PopOrderItem> selectByExample(PopOrderItemExample example);

    PopOrderItem selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PopOrderItem record, @Param("example") PopOrderItemExample example);

    int updateByExample(@Param("record") PopOrderItem record, @Param("example") PopOrderItemExample example);

    int updateByPrimaryKeySelective(PopOrderItem record);

    int updateByPrimaryKey(PopOrderItem record);
}