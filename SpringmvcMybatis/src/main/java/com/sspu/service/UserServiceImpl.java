package com.sspu.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.print.attribute.HashAttributeSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sspu.dao.IUserDao;
import com.sspu.enums.ResponseEnums;
import com.sspu.model.User;
import com.sspu.vo.BaseResponse;
import com.sspu.vo.request.RegisterRequest;



@Service
public class UserServiceImpl implements IUserService{
	//自动装配
	@Autowired
    private IUserDao userDao;
    
   
    /**
     * 查询用户总数
     */
    public int queryUserCount() {
        return userDao.queryUserCount();
    }
    
    /**
     * 根据用户id查询用户
     */
    public User queryUserById(int userid){
        return userDao.queryUserById(userid);
    }
    
    /**
     * 新增用户
     */
    public int insertUser(User user){
        return userDao.insertUser(user);
    }
    
    /**
     * 修改用户
     */
    public int updateUser(User user){
        return userDao.updateUser(user);
    }
    
    /**
     * 根据用户id删除用户
     */
    public int deleteUserById(int user_id){
        return userDao.deleteUserById(user_id);
    }
    
    /**
     * 删除多个用户
     */
    public int deleteUsers(int[] userIds){
        return userDao.deleteUsers(userIds);
    }

	public User getUserByNameAndPassword(String user_email, String password) {
		Map<String,String> map = new HashMap<String, String>();
		map.put("user_email", user_email);
		map.put("password", password);
		
		User user = this.userDao.getUserByLoginNamePassword(map);
		
		return user;
		
	}

	public BaseResponse register(RegisterRequest request) {
		BaseResponse response = new BaseResponse();
		
		User user = this.userDao.queryUserByName(request.getUser_email());
		
		if(user != null) {
			return new BaseResponse(ResponseEnums.LOGIN_REPEAT.getCode(), ResponseEnums.LOGIN_REPEAT.getMessage(), null);
		}
		
		try {
			User usernew = new User();
			usernew.setUser_email(request.getUser_email());
			usernew.setPassword(request.getPassword());
			
			
			this.userDao.insertUser(usernew);
		}catch(Exception e) {
			return new BaseResponse(ResponseEnums.FAIL.getCode(), ResponseEnums.FAIL.getMessage(), null);
		}
		
		return response;
	}
}
