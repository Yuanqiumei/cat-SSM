package com.sspu.service;

import java.util.List;

import com.sspu.model.User;
import com.sspu.vo.BaseResponse;
import com.sspu.vo.request.RegisterRequest;




public interface IUserService {
	
    public int queryUserCount();
    
    /**
     * 根据用户id查询用户
     * @param userid
     * @return
     */
    public User queryUserById(int userid);
    
    /**
     * 新增用户
     * @param user
     * @return
     */
    public int insertUser(User user);
    
    /**
     * 修改用户
     * @param user
     * @return
     */
    public int updateUser(User user);
    
    /**
     * 根据用户id删除用户
     * @param user_id
     * @return
     */
    public int deleteUserById(int user_id);
    
    /**
     * 删除多个用户
     * @param userIds
     * @return
     */
    public int deleteUsers(int[] userIds);
    
    /**
     * 
     *last_update:2019年4月14日@param user_email
     *last_update:2019年4月14日@param password
     *last_update:2019年4月14日@return
     * @param user_email
     * @param password
     * @return
     */
    public User getUserByNameAndPassword(String user_email,String password);
    
    /**
     * 注册
     *last_update:2019年4月14日@param request
     *last_update:2019年4月14日@return
     * @param request
     * @return
     * @throws Exception 
     */
    public BaseResponse register(RegisterRequest request);
}
