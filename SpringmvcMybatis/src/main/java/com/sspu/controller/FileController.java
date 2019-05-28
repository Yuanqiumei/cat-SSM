package com.sspu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.sspu.utils.FileOperateUtil;

@Controller
public class FileController {

	private static final String path = "D:/WEB-INF/upload"; 
	@RequestMapping("/uploadFile")
	public String uploadFile(MultipartFile file){
		
		String fileName = file.getOriginalFilename();
		FileOperateUtil.upload(file, fileName, path);
		return "ok";
	}
}
