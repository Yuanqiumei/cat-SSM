package com.sspu.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.sspu.model.Contact;




public interface ContactDao {

	
   
    public int insertContact(Contact contact);
    
   
  
}
