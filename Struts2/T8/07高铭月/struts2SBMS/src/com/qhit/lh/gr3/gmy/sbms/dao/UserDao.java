package com.qhit.lh.gr3.kyk.sbms.dao;

import java.util.List;

import com.qhit.lh.gr3.kyk.sbms.bean.User;

/**
 * @author ������
 *
 */
public interface UserDao {
	
	/**
	 * @return
	 * ��ѯ�����û�
	 * @throws Exception 
	 */
	public List<User> getAll() throws Exception;
	/**
	 * @param user
	 * @return
	 * ����û�
	 */
	public int addUser(User user);
	/**
	 * @param userName
	 * @param userPassword
	 * @return
	 * ��½�����ݷ���
	 */
	public User doLogin(String userName,String userPassword);
}
