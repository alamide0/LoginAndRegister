package com.logistics.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Example;

import com.logistics.entity.Customer;

public class CustomerImpl implements CustomerDao {
	
	// 添加操作数据库，进行持久化业务，sessionFactory作为属性，希望通过Spring框架整合时，将具体的sessionFactory对象注入
	
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	
	public boolean addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return false;
	}

	
	public List<Customer> queryCustomerById(Serializable cId) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public Customer updateCustomerById(Serializable cId) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public boolean deleteCustomerById(Serializable cId) {
		// TODO Auto-generated method stub
		return false;
	}
	

	public List<Customer> queryCustomerByQBE(Customer customer) {
		List<Customer> list = null;
		Session session = sessionFactory.openSession();
		//Transaction tran = session.beginTransaction();
		list = session.createQuery("from Customer").list();
		System.out.println(list.size()+"-------");
		//tran.commit();
		return list;
	}

}
