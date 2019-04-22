package com.sspu.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.print.attribute.HashAttributeSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sspu.dao.ContactDao;
import com.sspu.enums.ResponseEnums;
import com.sspu.model.Contact;
import com.sspu.vo.BaseResponse;
import com.sspu.vo.request.ContactRequest;



@Service
public class ContactServiceImpl implements ContactService{
	//自动装配
	@Autowired
    private ContactDao contactDao;
    
   
    
	@Override
	public BaseResponse getAll(ContactRequest request) {
		BaseResponse response = new BaseResponse();
		Contact contact = new Contact();
		
		contact.setPhone(request.getPhone());
		contact.setAddress(request.getAddress());
		contact.setEmail(request.getEmail());
		 
		this.contactDao.insertContact(contact);
		
		
		return response;
	}




}
