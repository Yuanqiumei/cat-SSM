package com.sspu.controller;

import javax.servlet.http.HttpSession;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
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
import com.sspu.model.User;
import com.sspu.service.IUserService;
import com.sspu.vo.BaseResponse;
import com.sspu.vo.request.LoginRequest;
import com.sspu.vo.request.RegisterRequest;



@Controller
@RequestMapping("/user")
@CrossOrigin(origins = "*", maxAge = 3600)
public class UserController {
	
	
	@Autowired
	private HttpSession httpSession;

	@Autowired
    private IUserService userService;
     
    /**
     * 登录判断
     *last_update:2019年4月14日@param request
     *last_update:2019年4月14日@return
     * @param request
     * @return
     */
    @PostMapping("/login")
    @ResponseBody
    public BaseResponse login(HttpServletRequest qq,@RequestBody LoginRequest request) {
    	BaseResponse response = new BaseResponse();
    	try {
    		User user = this.userService.getUserByNameAndPassword(request.getUser_email(), request.getPassword());
    		if(user != null) {
        		response.setResult(user);
        		response.setMsg("登录成功");
        		qq.setAttribute("user", user); 
    		}else {
    			response.setCode(ResponseEnums.LOGIN_ERROR.getCode());
    			response.setMsg(ResponseEnums.LOGIN_ERROR.getMessage());
    		}
    	}catch(Exception e) {
    		System.out.println("exception:::e"+e);
    		response.setCode(ResponseEnums.FAIL.getCode());
			response.setMsg(ResponseEnums.FAIL.getMessage());
    	}
    	return response;
    }
    
    @PostMapping("/regist")
    @ResponseBody
    public BaseResponse registerUser(@RequestBody RegisterRequest request) {
    	return this.userService.register(request);
    }
    
    
}
