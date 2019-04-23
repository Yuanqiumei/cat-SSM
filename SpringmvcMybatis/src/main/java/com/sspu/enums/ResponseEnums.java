package com.sspu.enums;



public enum ResponseEnums {
	
	SUCCESS("200","处理成功"),
	FAIL("202","处理失败"),
	LOGIN_ERROR("000","登录失败"),
	LOGIN_REPEAT("001","登录名重复");
	
	private String code;
	
	private String message;

	private ResponseEnums(String code, String message) {
		this.code = code;
		this.message = message;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	

}
