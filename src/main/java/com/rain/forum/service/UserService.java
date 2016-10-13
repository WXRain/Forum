package com.rain.forum.service;

import com.rain.forum.entity.User;

public interface UserService {

	public User login(String name, String password) throws LoginException;
}
