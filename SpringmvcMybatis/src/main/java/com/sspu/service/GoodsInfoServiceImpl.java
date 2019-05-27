package com.sspu.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sspu.dao.GoodsInfoMapper;
import com.sspu.dao.GoodsInfoMapperExt;
import com.sspu.enums.ResponseEnums;
import com.sspu.model.GoodsInfo;
import com.sspu.vo.BaseResponse;
import com.sspu.vo.request.GoodsInfoRequest;
import com.sspu.vo.response.PageResponse;


@Service
public class GoodsInfoServiceImpl implements GoodsInfoService {
	
	@Autowired
	private GoodsInfoMapperExt goodsInfoMapperExt;
	

	public BaseResponse queryGoodsPageInfo(GoodsInfoRequest request) {
		
		Map<String,Object> map = new HashMap<String, Object>();
		int startPageSize = (request.getPage()-1)*request.getPageSize();
		if(startPageSize == 0) {
			startPageSize =1;
		}
		
		if(request.getPageSize() ==0) {
			request.setPageSize(5);
		}
		map.put("psStart",startPageSize );
		map.put("pageSize", request.getPage());
		map.put("goodsNo", request.getGoodsNo());
		
		PageResponse response = new PageResponse();
		List<GoodsInfo> list = this.goodsInfoMapperExt.queryGoodsInfoList(map);
		
		int goodsCount = this.goodsInfoMapperExt.queryGoodsInfoCount(map);
		response.setResult(list);
		response.setCount(goodsCount);
		response.setPageSize(request.getPageSize());
		response.setPage(request.getPage());
		return new BaseResponse(ResponseEnums.SUCCESS.getCode(), ResponseEnums.SUCCESS.getMessage(), response);

	}

}
