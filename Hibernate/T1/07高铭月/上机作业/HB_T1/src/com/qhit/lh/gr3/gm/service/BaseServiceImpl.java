package com.qhit.lh.gr3.gm.service;



import java.util.List;

import com.qhit.lh.gr3.gm.bean.User;
import com.qhit.lh.gr3.gm.dao.BaseDao;
import com.qhit.lh.gr3.gm.dao.BaseDaoImpl;
import com.qhit.lh.gr3.gm.service.BaseService;


public class BaseServiceImpl implements BaseService {

	private BaseDao bd = new BaseDaoImpl();

	public void add(Object obj) {

		bd.add(obj);

		

	}



	public void upd(Object obj) {

		bd.upd(obj);

		

	}



	public void del(Object obj) {

		bd.del(obj);

		

	}



	public List<User> getAll(String fromObject) {

		List list=bd.getAll(fromObject);

		return list;

	}



}