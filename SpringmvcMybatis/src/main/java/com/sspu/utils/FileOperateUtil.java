package com.sspu.utils;
import java.io.BufferedInputStream;  
import java.io.BufferedOutputStream;  
import java.io.File;  
import java.io.FileInputStream;  
import java.text.SimpleDateFormat;  
import java.util.Date;  

import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.multipart.MultipartFile;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;



  

public class FileOperateUtil {  
 
    private static final String UPLOADDIR = "D:/WEB-INF/upload";  
 

    public static Log log = LogFactory.getLog(FileOperateUtil.class);
   public static int upload(MultipartFile file,String fileName,String path){
	  
		 System.out.println(fileName+"filename");
		 String type="";
		 if( fileName.indexOf(".")!=-1){
			 type = fileName.substring(fileName.lastIndexOf("."), fileName.length());
			 System.out.println(type+"TYPE");
		 }
		 else
			 type="";
		 type = type.toLowerCase();
		 if(type.equals(".jpg")||type.equals(".pdf")||type.equals(".docx")||type.equals(".doc")||type.equals(".png"))
			 // limit formats of files
		 {
        
//      String fileName = new Date().getTime()+".jpg";  
     
      File targetFile = new File(path, fileName);  
      if(!targetFile.exists()){  
          targetFile.mkdirs();  
      }  

     
      try {  
          file.transferTo(targetFile);  
         return 1; // success;
      } catch (Exception e) {  
          e.printStackTrace();  
          return 0;
      }  
   }
		 else
			 return 2;//failed
   }
 
  
  
    
}  