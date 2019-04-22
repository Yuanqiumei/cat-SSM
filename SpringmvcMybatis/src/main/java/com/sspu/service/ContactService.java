package com.sspu.service;

import java.util.List;

import com.sspu.model.Contact;
import com.sspu.vo.BaseResponse;
import com.sspu.vo.request.ContactRequest;




public interface ContactService {

	
    public BaseResponse getAll(ContactRequest request);
    
    
}
