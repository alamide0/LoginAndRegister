package com.logistics.actions;
import com.logistics.entity.User;
import com.logistics.service.CustomerService;
import com.logistics.service.UserService;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport{

	private String name;  // 和视图中表单控件元素同名
	private String pwd;	  // 和视图中表单控件元素同名
	// 添加具体业务实现类
	private UserService service;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public UserService getService() {
		return service;
	}

	public void setService(UserService service) {
		this.service = service;
	}
	
	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	@Override
	public String execute() throws Exception {
		if(service==null)System.out.println("==========");
		User user = new User();
		user.setUsername(name);
		user.setPassword(pwd);
		boolean flag = service.login(user);
		System.out.println(flag);
		return flag == true ? "success":"error";
	}
}
