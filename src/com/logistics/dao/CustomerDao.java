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
	 * @param customer ����QBE��ʽ������ģ�����ʱ�����ṩ��ģ�����
	 * @return list<Customer> ���ϣ���ʾ��ģ�����Ƶ�ʵ���ļ���
	 */
	public List<Customer> queryCustomerByQBE(Customer customer);
}
