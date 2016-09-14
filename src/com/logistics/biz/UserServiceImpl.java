package com.logistics.biz;

import java.util.List;

import com.logistics.dao.UserDao;
import com.logistics.dao.UserDaoImpl;
import com.logistics.entity.User;
import com.logistics.service.UserService;

public class UserServiceImpl implements UserService {
	
	private UserDao userDao;
	

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public boolean login(User user) {
		// TODO Auto-generated method stub
		List<User> list = userDao.query(user);
		if(list.size()==0){
			return false;
		}
		return true;
	}

	@Override
	public boolean register(User user) {
		// TODO Auto-generated method stub
		return userDao.register(user);
		//return false;
	}

}
