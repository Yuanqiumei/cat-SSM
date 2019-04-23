package com.sspu.dao;

import java.util.List;
import java.util.Map;

import com.sspu.model.GoodsInfo;

public interface GoodsInfoMapperExt {
   public List<GoodsInfo> queryGoodsInfoList(Map<String,Object> map);
   
   
   public int queryGoodsInfoCount(Map<String,Object> map);
}