/**
 * 
 */
package com.qhit.lh.gr3.wj.t4.servcie.impl;

import java.util.List;

import com.qhit.lh.gr3.wj.t4.dao.BaseDao;
import com.qhit.lh.gr3.wj.t4.dao.impl.BaseDaoImpl;
import com.qhit.lh.gr3.wj.t4.servcie.BaseService;

/**
 * @author admin
 * 2017年12月11日
 */
public class BaseServiceImpl implements BaseService {
	private BaseDao baseDao = new BaseDaoImpl();

	@Override
	public void add(Object obj) {
		// TODO Auto-generated method stub
		baseDao.add(obj);
	}

	@Override
	public void delete(Object obj) {
		// TODO Auto-generated method stub
		baseDao.delete(obj);
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

	@Override
	public Object getObjectById(Class clazz, int id) {
		// TODO Auto-generated method stub
		return baseDao.getObjectById(clazz, id);
	}

}
