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

			super.addFieldError("loginInfo.info", "没有填写信息");

		}else{

			if(loginInfo.getClassName()==null||loginInfo.getClassName().length()<3) {

				super.addFieldError("loginInfo.uname", "账号必填，且号码长度不能少于3位");

			}

			if(loginInfo.getUpwd()==null||loginInfo.getUpwd().length()<6) {

				super.addFieldError("loginInfo.upwd", "密码长度不能少于6位");

			}

		}

		super.validate();

	}

	public String GoLogin() {

		return "login";

	}

	public String Login() {

		if(loginInfo.getClassName().equals("tom")&&loginInfo.getUpwd().equals("123456")) {

			msg="欢迎你"+loginInfo.getClassName();

			return "success";

		}

		if(loginInfo.getClassName().equals("陈益辉")&&loginInfo.getUpwd().equals("123456")) {

			msg="欢迎你"+loginInfo.getClassName();

			return "success";

		}

		if(loginInfo.getClassName().equals("jack")&&loginInfo.getUpwd().equals("321654")) {

			msg="欢迎你"+loginInfo.getClassName();

			return "success";

		}

		super.addActionError("登录失败！");

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

