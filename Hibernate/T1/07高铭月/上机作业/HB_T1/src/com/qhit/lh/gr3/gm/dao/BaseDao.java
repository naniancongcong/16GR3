package com.qhit.lh.gr3.gm.dao;
import java.util.List;



import com.qhit.lh.gr3.gm.bean.User;
public interface BaseDao {

	//Ìí¼Ó

	public void add(Object obj);

	//ÐÞ¸Ä

	public void upd(Object obj);

	//É¾³ý

	public void del(Object obj);

	//²éÑ¯

	public List<User> getAll(String fromObject);

}
