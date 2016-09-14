package com.logistics.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.logistics.entity.User;

public class UserDaoImpl implements UserDao {
	
	private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}




	@Override
	public List<User> query(User user) {
		List<User> list = null;
		Session session = sessionFactory.openSession();
		Transaction tran = session.beginTransaction();
		Query query = session.createQuery("from User u where u.username= :username and u.password= :password");
		
		query.setParameter("username", user.getUsername());
		query.setParameter("password", user.getPassword());
		list = query.list();
		tran.commit();
		return list;
	}
	public List<User> queryUserName(User user) {
		List<User> list = null;
		Session session = sessionFactory.openSession();
		Transaction tran = session.beginTransaction();
		Query query = session.createQuery("from User u where u.username= :username ");
		
		query.setParameter("username", user.getUsername());
		//query.setParameter("password", user.getPassword());
		list = query.list();
		tran.commit();
		return list;
	}


	@Override
	public boolean register(User user) {
		List<User> list = queryUserName(user);
		System.out.println(list.size()+"--");
		if(list.size()>0)return false;
		Session session = sessionFactory.openSession();
		Transaction tran = session.beginTransaction();
		
		String sql = "insert into user values(?,?,?,?,?)";
		Query query = session.createSQLQuery(sql);
		System.out.println(user.getNickname());
		query.setInteger(0, user.getId())
			.setString(1, user.getUsername())
			.setString(2, user.getPassword())
			.setString(3, user.getNickname())
			.setString(4, user.getEmail()).executeUpdate();
		//int t = 1/0;
		tran.commit();
		return true;
	}

	
	

}
