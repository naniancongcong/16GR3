package com.qhit.lh.gr3.kyk.sbms.service;

import java.util.List;

import com.qhit.lh.gr3.kyk.sbms.bean.User;


/**
 * @author ������
 *
 */
public interface UserService {
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
	 * ��½��ҵ��
	 */
	public User doLogin(String userName,String userPassword);
}
