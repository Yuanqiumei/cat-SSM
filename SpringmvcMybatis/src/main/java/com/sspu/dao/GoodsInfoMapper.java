package com.sspu.dao;

import com.sspu.model.GoodsInfo;

public interface GoodsInfoMapper {
    int deleteByPrimaryKey(String goodsNo);

    int insert(GoodsInfo record);

    int insertSelective(GoodsInfo record);

    GoodsInfo selectByPrimaryKey(String goodsNo);

    int updateByPrimaryKeySelective(GoodsInfo record);

    int updateByPrimaryKey(GoodsInfo record);
}