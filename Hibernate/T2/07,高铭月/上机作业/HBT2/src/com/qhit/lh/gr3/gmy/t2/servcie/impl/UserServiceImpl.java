package com.qhit.lh.gr3.gmy.t2.servcie.impl;

import java.util.List;

import com.qhit.lh.gr3.gmy.t2.dao.BaseDao;
import com.qhit.lh.gr3.gmy.t2.dao.impl.BaseDaoImpl;
import com.qhit.lh.gr3.gmy.t2.servcie.UserService;

public class UserServiceImpl implements UserService {
	private BaseDao baseDao = new BaseDaoImpl();

	@Override
	public void add(Object obj) {
		// TODO Auto-generated method stub
		baseDao.add(obj);
	}

	@Override
	public void delect(Object obj) {
		// TODO Auto-generated method stub
		baseDao.delect(obj);
	}

	@Override
	public void update(Object obj) {
		// TODO Auto-generated method stub
		baseDao.update(obj);
	}

	@Override
	public List<Object> getAll(String fromObject) {
		// TODO Auto-generated method stub
		return baseDao.getAll(fromObject);
	}

}
