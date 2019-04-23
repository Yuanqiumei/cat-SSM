package com.sspu.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.sspu.model.User;
import com.sspu.model.UserExtend;



public interface IUserDao {

	 /**
     * 查询用户信息并分页
     * @param skip
     * @param size
     * @return
     */
    public List<UserExtend> queryUserPager(@Param("skip") int skip,@Param("size") int size);
    
    /**
     * 查询用户总数
     * @return
     */
    public int queryUserCount();
    
    /**
     * 根据用户id查询用户
     * @param userid
     * @return
     */
    public User queryUserById(int userid);
    
    public User queryUserByName(String user_email);
    
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
     * 根据用户名和密码查询用户
     *last_update:2019年4月11日@param loginName
     *last_update:2019年4月11日@param password
     *last_update:2019年4月11日@return
     * @param loginName
     * @param password
     * @return
     */
    public User getUserByLoginNamePassword(Map<String,String> map);
}
