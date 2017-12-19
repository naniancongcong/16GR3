/**
 * 
 */
package com.qhit.lh.gr3.wj.t4;

import org.junit.Test;

import com.qhit.lh.gr3.wj.t4.bean.Dept;
import com.qhit.lh.gr3.wj.t4.bean.Emp;
import com.qhit.lh.gr3.wj.t4.servcie.BaseService;
import com.qhit.lh.gr3.wj.t4.servcie.impl.BaseServiceImpl;

/**
 * @author S01
 * 2017年12月14日
 */
public class DeptTest {
	private BaseService baseService = new BaseServiceImpl();

	@Test
	public void add(){
		Dept dept = new Dept();
		dept.setDname("外交部");

		Emp dwj = new Emp();
		dwj.setEname("刘银炮");
		//交给自己维护外检
		dept.getEmps().add(dwj);
		//交给关联表维护外检
		//dwj.setDept(dept);
		baseService.add(dept);
	}
	
	@Test
	public void delete(){
		Dept dept = (Dept) baseService.getObjectById(Dept.class, 1);
		
		baseService.delete(dept);
	}
	
	@Test
	public void update(){
		Dept dept = (Dept) baseService.getObjectById(Dept.class, 2);
		dept.setDname("驻美中国大使馆");
		
		baseService.update(dept);
	}
	
	@Test
	public void query(){
		Dept dept = (Dept) baseService.getObjectById(Dept.class, 1);
		
		for(Emp emp:dept.getEmps()){
			System.out.println(dept.getDname()+":"+emp.getEname());
		}
	}
}
