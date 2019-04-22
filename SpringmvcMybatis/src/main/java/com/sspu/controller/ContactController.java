package com.sspu.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sspu.enums.ResponseEnums;
import com.sspu.service.ContactService;
import com.sspu.vo.BaseResponse;
import com.sspu.vo.request.ContactRequest;


@Controller
@CrossOrigin(origins = "*", maxAge = 3600)
public class ContactController {
	
	
	@Autowired
	private HttpSession httpSession;

	@Autowired
    private ContactService contactService;
     
   
    @PostMapping("/contact")
    @ResponseBody
    public BaseResponse registerUser(@RequestBody ContactRequest request) {
    	return this.contactService.getAll(request);
    }
    
    
}
