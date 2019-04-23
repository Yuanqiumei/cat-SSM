package com.sspu.config;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.annotation.Configuration;
@Configuration
public class CrossFilter implements Filter {
	public void destroy() {
	}
	public void doFilter(ServletRequest req, ServletResponse res,
			FilterChain chain) throws IOException, ServletException {
		HttpServletResponse response = (HttpServletResponse) res;
		response.setHeader("Access-Control-Allow-Origin", "*");
		response.setHeader("Access-Control-Allow-Credentials", "true"); 
		response.setHeader("Access-Control-Allow-Origin", "http://localhost:8080"); 
		response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, PUT, DELETE");
		response.setHeader("Access-Control-Max-Age", "3600");
		//		    response.setHeader("Access-Control-Allow-Headers", "x-requested-with");
		response.addHeader("Access-Control-Allow-Headers", "Content-Type,token,X-Mx-ReqToken,Keep-Alive,User-Agent,"
				+ "X-Requested-With,If-Modified-Since,Cache-Control,Content-Type,Accept-Language,"
				+ "Origin,Accept-Encoding");
		chain.doFilter(req, res);
	}
	public void init(FilterConfig arg0) throws ServletException {
	}
}
