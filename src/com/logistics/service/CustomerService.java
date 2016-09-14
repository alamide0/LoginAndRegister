package com.logistics.service;

public interface CustomerService {
	
	/**
	 * 
	 * @return boolean类型，true时，说明用户是系统用户，false时，说明用户不是系统用户
	 */
	public boolean validateUser(String name,String pwd);

	public boolean validateRegister(String username, String password,
			String nickname, String email);
}
