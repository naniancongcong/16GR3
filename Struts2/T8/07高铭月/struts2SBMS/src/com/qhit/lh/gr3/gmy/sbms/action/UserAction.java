/**
 * 
 */
package com.qhit.lh.gr3.kyk.sbms.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.qhit.lh.gr3.kyk.sbms.bean.User;
import com.qhit.lh.gr3.kyk.sbms.service.UserService;
import com.qhit.lh.gr3.kyk.sbms.service.impl.UserServiceImpl;

/**
 * @author ������
 *TODO
 *2017��12��7������5:13:21
 */
public class UserAction extends ActionSupport {
	private User user;
	private UserService us = new UserServiceImpl();
	private List<User> users = new ArrayList<>();
	
	private File uploadfile;
	private String uploadfileFileName;
	private String uploadfileContentType;
	
	public String login(){
		user = us.doLogin(user.getUserName(), user.getUserPassword());
		if(user != null){
			//��½�ɹ�
			ServletActionContext.getRequest().getSession().setAttribute("user", user);
		}else{
			//��½ʧ��
			super.addFieldError("loginFail", "�˻������������");
		}
		return "loginSuccess";
	}
	
	public String uploading(){
		if(uploadfile != null){
			try {
				//��ȡ�ϴ��ļ�
				InputStream is = new FileInputStream(uploadfile);
				//�õ��ļ������·��
				String savePath = ServletActionContext.getServletContext().getRealPath("/")+"upload";
				File file = new File(savePath);
				//�ȴ����ļ���
				if(!file.exists()){
					file.mkdirs();
				}
				//���浽�����������ϴ�������д�뵽savePath���ļ���
				OutputStream os = new FileOutputStream(savePath+"/"+uploadfileFileName);
				//д������
				byte[] buffer = new byte[8096];
				int len = 0;
				while ((len=is.read(buffer)) != -1) {
					os.write(buffer, 0, len);
					
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
				super.addFieldError("uploadfile", "�ļ�δ�ҵ�");
			} catch (IOException e) {
				e.printStackTrace();
				super.addFieldError("uploadfile", "�ļ�����ʧ��");
			}
		}else{
			super.addFieldError("uploadfile", "�ϴ�ʧ��");
		}
		return "uploadSuccess";
	}
	
	public String add(){
		int row = us.addUser(user);
		if(row > 0){
			return "addSuccess";
		}else{
			super.addFieldError("addFile", "�û����ʧ��");
			return "addFile";
		}
	}
	
	public String getAll() throws Exception{
		users = us.getAll();
		return "listUser";
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public List<User> getUsers() {
		return users;
	}
	public void setUsers(List<User> users) {
		this.users = users;
	}
	public File getUploadfile() {
		return uploadfile;
	}
	public void setUploadfile(File uploadfile) {
		this.uploadfile = uploadfile;
	}
	public String getUploadfileFileName() {
		return uploadfileFileName;
	}
	public void setUploadfileFileName(String uploadfileFileName) {
		this.uploadfileFileName = uploadfileFileName;
	}
	public String getUploadfileContentType() {
		return uploadfileContentType;
	}
	public void setUploadfileContentType(String uploadfileContentType) {
		this.uploadfileContentType = uploadfileContentType;
	}
	public UserService getUs() {
		return us;
	}
	public void setUs(UserService us) {
		this.us = us;
	}
	

}
