package com.logistics.service;

public interface CustomerService {
	
	/**
	 * 
	 * @return boolean���ͣ�trueʱ��˵���û���ϵͳ�û���falseʱ��˵���û�����ϵͳ�û�
	 */
	public boolean validateUser(String name,String pwd);

	public boolean validateRegister(String username, String password,
			String nickname, String email);
}
