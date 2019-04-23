package com.sspu.vo.request;

import java.io.Serializable;




public class GoodsInfoRequest implements Serializable{
	
	private int page;
	
	private int pageSize;
	
	private String goodsNo;

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public String getGoodsNo() {
		return goodsNo;
	}

	public void setGoodsNo(String goodsNo) {
		this.goodsNo = goodsNo;
	}
	
	
	

}
