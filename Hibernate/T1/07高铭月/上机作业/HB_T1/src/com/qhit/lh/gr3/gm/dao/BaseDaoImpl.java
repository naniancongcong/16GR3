package com.qhit.lh.gr3.gm.dao;

import java.util.List;

import com.qhit.lh.gr3.gm.bean.User;
import java.util.List;

import javax.swing.text.TextAction;
import javax.swing.text.html.HTMLDocument.HTMLReader.TagAction;
public class BaseDaoImpl implements BaseDao {

	@Override

	public void add(Object obj) {

		//1，获取session对象

		Session session = HibernateSessionFactory.getSession();

		//2，开启事务

		TagAction ts =session.beginTransaction();

		//3，执行

		session.save(obj);

		//4，提交事务

		ts.commit();

		//5，释放资源

		HibernateSessionFactory.closeSession();

	}



	@Override

	public void upd(Object obj) {

				//1，获取session对象

				Session session = HibernateSessionFactory.getSession();

				//2，开启事务

				TextAction ts =session.beginTransaction();

				//3，执行

				session.update(obj);

				//4，提交事务

				ts.commit();

				//5，释放资源

				HibernateSessionFactory.closeSession();

		

	}



	@Override

	public void del(Object obj) {

				//1，获取session对象

				Session session = HibernateSessionFactory.getSession();

				//2，开启事务

				Transaction ts =session.beginTransaction();

				//3，执行

				session.delete(obj);

				//4，提交事务

				ts.commit();

				//5，释放资源

				HibernateSessionFactory.closeSession();

		

	}



	@Override

	public List<User> getAll(String fromObject) {

				//1，获取session对象

				Session session = HibernateSessionFactory.getSession();

				//2，开启事务

				Transaction ts =session.beginTransaction();

				//3，执行

				Query query=session.createQuery(fromObject);

				List<User> list=query.list();

				//4，提交事务

				ts.commit();

				//5，释放资源

				HibernateSessionFactory.closeSession();

				return list;

		

	}

	

}