package com.logistics.actions;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.logistics.entity.User;
import com.logistics.service.CustomerService;
import com.logistics.service.UserService;
import com.opensymphony.xwork2.ActionSupport;

public class RegisterAction extends ActionSupport{

	private String username;
	private String password;
	private String password2;
	private String nickname;
	private String email;
	
	private UserService service;
	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getPassword2() {
		return password2;
	}


	public void setPassword2(String password2) {
		this.password2 = password2;
	}


	public String getNickname() {
		return nickname;
	}


	public void setNickname(String nickname) {
		this.nickname = nickname;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}

	public UserService getService() {
		return service;
	}

	public void setService(UserService service) {
		this.service = service;
	}
	
	

	@Override
	public String execute() throws Exception {
		//if(service==null)System.out.println("==========");
		if(!password.equals(password2)){
			return ERROR;
		}
		User user = new User(username,password,nickname,email);
		boolean flag = service.register(user);
		System.out.println(flag);
		return flag == true ? "success":"error";
		//return SUCCESS;
	}
}
