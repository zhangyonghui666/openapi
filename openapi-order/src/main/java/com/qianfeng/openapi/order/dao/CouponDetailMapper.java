package com.qianfeng.openapi.order.dao;


import com.qianfeng.openapi.order.pojo.CouponDetail;
import com.qianfeng.openapi.order.pojo.CouponDetailExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CouponDetailMapper {
    long countByExample(CouponDetailExample example);

    int deleteByExample(CouponDetailExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CouponDetail record);

    int insertSelective(CouponDetail record);

    List<CouponDetail> selectByExample(CouponDetailExample example);

    CouponDetail selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CouponDetail record, @Param("example") CouponDetailExample example);

    int updateByExample(@Param("record") CouponDetail record, @Param("example") CouponDetailExample example);

    int updateByPrimaryKeySelective(CouponDetail record);

    int updateByPrimaryKey(CouponDetail record);
}