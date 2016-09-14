package com.logistics.dao;

import java.io.Serializable;
import java.util.List;

import com.logistics.entity.Customer;

public interface CustomerDao {

	public boolean addCustomer(Customer customer);
	public List<Customer> queryCustomerById(Serializable cId);
	public Customer updateCustomerById(Serializable cId);
	public boolean deleteCustomerById(Serializable cId);
	/** 
	 * @param customer 采用QBE方式，进行模板检索时，所提供的模板对象
	 * @return list<Customer> 集合，表示和模板类似的实例的集合
	 */
	public List<Customer> queryCustomerByQBE(Customer customer);
}
