package com.gmy.T6.action;

import java.lang.management.LockInfo;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	private LockInfo loginInfo;

	private String msg;

	@Override

	public void validate() {

		// TODO Auto-generated method stub

		if(loginInfo ==null) {

			super.addFieldError("loginInfo.info", "û����д��Ϣ");

		}else{

			if(loginInfo.getClassName()==null||loginInfo.getClassName().length()<3) {

				super.addFieldError("loginInfo.uname", "�˺ű���Һ��볤�Ȳ�������3λ");

			}

			if(loginInfo.getUpwd()==null||loginInfo.getUpwd().length()<6) {

				super.addFieldError("loginInfo.upwd", "���볤�Ȳ�������6λ");

			}

		}

		super.validate();

	}

	public String GoLogin() {

		return "login";

	}

	public String Login() {

		if(loginInfo.getClassName().equals("tom")&&loginInfo.getUpwd().equals("123456")) {

			msg="��ӭ��"+loginInfo.getClassName();

			return "success";

		}

		if(loginInfo.getClassName().equals("�����")&&loginInfo.getUpwd().equals("123456")) {

			msg="��ӭ��"+loginInfo.getClassName();

			return "success";

		}

		if(loginInfo.getClassName().equals("jack")&&loginInfo.getUpwd().equals("321654")) {

			msg="��ӭ��"+loginInfo.getClassName();

			return "success";

		}

		super.addActionError("��¼ʧ�ܣ�");

		return "input";

	}

	public LoginInfo getLoginInfo() {

		return loginInfo;

	}



	public void setLoginInfo(LoginInfo loginInfo) {

		this.loginInfo = loginInfo;

	}

	public String getMsg() {

		return msg;

	}

	public void setMsg(String msg) {

		this.msg = msg;

	}

}

