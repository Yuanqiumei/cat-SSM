package com.sspu.service;

import com.sspu.vo.BaseResponse;
import com.sspu.vo.request.GoodsInfoRequest;

public interface GoodsInfoService {
	
	public BaseResponse queryGoodsPageInfo(GoodsInfoRequest request);

}
