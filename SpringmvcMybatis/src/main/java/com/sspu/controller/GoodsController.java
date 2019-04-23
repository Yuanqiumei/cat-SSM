package com.sspu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sspu.service.GoodsInfoService;
import com.sspu.vo.BaseResponse;
import com.sspu.vo.request.GoodsInfoRequest;


@RestController
@RequestMapping("/goods")
@CrossOrigin(origins = "*", maxAge = 3600)
public class GoodsController {
	
	@Autowired
	private GoodsInfoService goodsInfoService;
	
	
	
	@PostMapping("/queryGoodsInfoList")
	@ResponseBody
	public BaseResponse queryGoodsInfoList(@RequestBody GoodsInfoRequest request) {

		return this.goodsInfoService.queryGoodsPageInfo(request);
	}


}
