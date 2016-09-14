package com.logistics.dao;

import java.util.List;

import com.logistics.entity.User;

public interface UserDao {

	List<User> query(User user);

	boolean register(User user);

}
