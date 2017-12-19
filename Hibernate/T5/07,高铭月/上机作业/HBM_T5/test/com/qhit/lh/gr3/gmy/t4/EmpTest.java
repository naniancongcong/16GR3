/**
 * 
 */
package com.qhit.lh.gr3.wj.t4;

import org.junit.Test;

import com.qhit.lh.gr3.wj.t4.bean.Dept;
import com.qhit.lh.gr3.wj.t4.bean.Emp;
import com.qhit.lh.gr3.wj.t4.bean.User;
import com.qhit.lh.gr3.wj.t4.servcie.BaseService;
import com.qhit.lh.gr3.wj.t4.servcie.impl.BaseServiceImpl;

/**
 * @author S01
 * 2017年12月14日
 */
public class EmpTest {
	private BaseService baseService = new BaseServiceImpl();

	@Test
	public void add() {
		Emp emp = new Emp();
		emp.setEname("董文俊");
		User user = new User();
		user.setUname("admin");
		user.setUpwd("123456");
		//部门
		Dept dept = (Dept) baseService.getObjectById(Dept.class, 1);
		
		//1-1
		emp.setUser(user);
		user.setEmp(emp);
		//n-1
		emp.setDept(dept);
		
		baseService.add(emp);
		
	}

}
