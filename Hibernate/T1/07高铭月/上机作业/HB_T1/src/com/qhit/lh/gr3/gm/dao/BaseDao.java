package com.qhit.lh.gr3.gm.dao;
import java.util.List;



import com.qhit.lh.gr3.gm.bean.User;
public interface BaseDao {

	//���

	public void add(Object obj);

	//�޸�

	public void upd(Object obj);

	//ɾ��

	public void del(Object obj);

	//��ѯ

	public List<User> getAll(String fromObject);

}
