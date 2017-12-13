package com.qhit.lh.gr3.gm.dao;

import java.util.List;

import com.qhit.lh.gr3.gm.bean.User;
import java.util.List;

import javax.swing.text.TextAction;
import javax.swing.text.html.HTMLDocument.HTMLReader.TagAction;
public class BaseDaoImpl implements BaseDao {

	@Override

	public void add(Object obj) {

		//1����ȡsession����

		Session session = HibernateSessionFactory.getSession();

		//2����������

		TagAction ts =session.beginTransaction();

		//3��ִ��

		session.save(obj);

		//4���ύ����

		ts.commit();

		//5���ͷ���Դ

		HibernateSessionFactory.closeSession();

	}



	@Override

	public void upd(Object obj) {

				//1����ȡsession����

				Session session = HibernateSessionFactory.getSession();

				//2����������

				TextAction ts =session.beginTransaction();

				//3��ִ��

				session.update(obj);

				//4���ύ����

				ts.commit();

				//5���ͷ���Դ

				HibernateSessionFactory.closeSession();

		

	}



	@Override

	public void del(Object obj) {

				//1����ȡsession����

				Session session = HibernateSessionFactory.getSession();

				//2����������

				Transaction ts =session.beginTransaction();

				//3��ִ��

				session.delete(obj);

				//4���ύ����

				ts.commit();

				//5���ͷ���Դ

				HibernateSessionFactory.closeSession();

		

	}



	@Override

	public List<User> getAll(String fromObject) {

				//1����ȡsession����

				Session session = HibernateSessionFactory.getSession();

				//2����������

				Transaction ts =session.beginTransaction();

				//3��ִ��

				Query query=session.createQuery(fromObject);

				List<User> list=query.list();

				//4���ύ����

				ts.commit();

				//5���ͷ���Դ

				HibernateSessionFactory.closeSession();

				return list;

		

	}

	

}