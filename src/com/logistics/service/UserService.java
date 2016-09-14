package com.logistics.service;

import com.logistics.entity.User;

public interface UserService {

	public boolean login(User user);
	public boolean register(User user);
}
