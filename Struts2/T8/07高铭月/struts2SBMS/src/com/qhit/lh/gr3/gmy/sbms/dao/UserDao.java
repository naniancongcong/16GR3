package com.qhit.lh.gr3.kyk.sbms.dao;

import java.util.List;

import com.qhit.lh.gr3.kyk.sbms.bean.User;

/**
 * @author 高铭月
 *
 */
public interface UserDao {
	
	/**
	 * @return
	 * 查询所有用户
	 * @throws Exception 
	 */
	public List<User> getAll() throws Exception;
	/**
	 * @param user
	 * @return
	 * 添加用户
	 */
	public int addUser(User user);
	/**
	 * @param userName
	 * @param userPassword
	 * @return
	 * 登陆的数据访问
	 */
	public User doLogin(String userName,String userPassword);
}
