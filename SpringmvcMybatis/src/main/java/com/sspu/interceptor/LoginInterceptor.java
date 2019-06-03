package com.sspu.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class LoginInterceptor  extends HandlerInterceptorAdapter {
	@Override  
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
	   System.out.println("===========HandlerInterceptor1 postHandle");
	   response.setCharacterEncoding("UTF-8");
		 response.setContentType("application/json; charset=utf-8");
		 response.setHeader("Access-Control-Allow-Credentials", "true");
		 response.setHeader("Access-Control-Allow-Origin",
		 request.getHeader("Origin"));
		 response.setHeader("Access-Control-Allow-Headers",
		 "Origin, No-Cache, X-Requested-With, If-Modified-Since, Pragma, Last-Modified, Cache-Control, Expires, Content-Type, X-E4M-With,userId,token,Access-Control-Allow-Headers"
		 ); response.setHeader("Access-Control-Allow-Methods",
		 "GET, HEAD, POST, PUT, DELETE, TRACE, OPTIONS, PATCH");
		 
		final String ENC = "UTF-8";
		String fullPath = request.getRequestURI().toString();
		String path = request.getContextPath();
		String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
		System.out.println(basePath);
		if (fullPath != null) {
			HttpSession session = request.getSession();
			String sessionId = session.getId();
			String user = (String) session.getAttribute("user");
			if (user != null) {
				return true;
			} else {
				return false;
			}
			
		} else {
			return true;
		}
	}
	
}