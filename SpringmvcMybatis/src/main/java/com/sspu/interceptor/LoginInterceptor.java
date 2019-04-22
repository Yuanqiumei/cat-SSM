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
		/*
		 * String requestURI = request.getRequestURI();
		 * if(requestURI.indexOf("editClientIfo.action")>0){ //说明处在编辑的页面 HttpSession
		 * session = request.getSession(); String username = (String)
		 * session.getAttribute("name"); if(username!=null){ //登陆成功的用户 return true;
		 * }else{ //没有登陆，转向登陆界面 return false; } }else{ return true; }
		 */
       
       HttpSession session = request.getSession();
		//String uri = request.getRequestURI(); // 获取登录的uri，这个是不进行拦截的
		//if(session.getAttribute("LOGIN_USER")!=null || uri.indexOf("system/login")!=-1) {// 说明登录成功 或者 执行登录功能			
		if(session.getAttribute("u")!=null) {
			// 登录成功不拦截
			return true;
		}else {
			// 拦截后进入登录页面
			return false;
		}
    } 
    @Override  
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {  
        System.out.println("===========HandlerInterceptor1 postHandle");  
    }  
    @Override  
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {  
        System.out.println("===========HandlerInterceptor1 afterCompletion");  
    }  
	
}