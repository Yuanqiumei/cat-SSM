package com.sspu.vo;

import java.io.Serializable;




public class BaseResponse implements Serializable{
	
	private String code = "0000";
	
	private String msg = "处理成功";
	
	private Object result;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object getResult() {
		return result;
	}

	public void setResult(Object result) {
		this.result = result;
	}

	public BaseResponse(String code, String msg, Object result) {
		super();
		this.code = code;
		this.msg = msg;
		this.result = result;
	}

	public BaseResponse() {
		super();
	}
	
	
	
	

}
