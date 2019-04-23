package com.sspu.service;
/**
*@author:wushiyi
*@version:2019年4月21日下午3:02:44
*/

import com.sspu.vo.BaseResponse;
import com.sspu.vo.request.GoodsInfoRequest;

public interface GoodsInfoService {
	
	public BaseResponse queryGoodsPageInfo(GoodsInfoRequest request);

}
