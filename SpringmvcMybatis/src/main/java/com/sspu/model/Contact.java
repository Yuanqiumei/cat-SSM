package com.sspu.model;

import java.io.Serializable;

public class Contact implements Serializable {
	
	//电话
    private String phone;
    //邮箱
    private String email;
    //地址
    private String address;
    
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
    
    

}
