package com.logistics.biz;

import java.util.List;

import com.logistics.dao.CustomerImpl;
import com.logistics.entity.Customer;
import com.logistics.service.CustomerService;

public class CustomerServiceImpl implements CustomerService {

	// ���CustomerDaoʵ���������Ϊ����
	
	private CustomerImpl customerImpl;

	public CustomerImpl getCustomerImpl() {
		return customerImpl;
	}

	public void setCustomerImpl(CustomerImpl customerImpl) {
		this.customerImpl = customerImpl;
	}

	
	public boolean validateUser(String name, String pwd) {
			Customer customerMoudel = new Customer(name, pwd);
		List<Customer> list = customerImpl.queryCustomerByQBE(customerMoudel);
		System.out.println(list.size()+"====");
		for(int i=0; i<list.size(); i++)
			System.out.println(list.get(i).getName());
		return list != null ? true:false;
	}

	@Override
	public boolean validateRegister(String username, String password,
			String nickname, String email) {
		
		//List<Customer> list = customerImpl.queryCustomerByQBE();
		//System.out.println(list.size()+"====");
		//for(int i=0; i<list.size(); i++)
			//System.out.println(list.get(i).getName());
		//return list != null ? true:false;
		return false;
	}
}
