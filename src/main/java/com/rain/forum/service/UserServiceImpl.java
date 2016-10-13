package com.rain.forum.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rain.forum.dao.UserDAO;
import com.rain.forum.entity.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO userDao;

	public User login(String username, String password) {
		User user;
		if (username == null || username.trim().isEmpty()) {
			throw new LoginException("用户名不能为空");
		}
		if (password == null || password.trim().isEmpty()) {
			throw new LoginException("密码不能为空");
		}
		// System.out.println(username + " " + password);
		user = userDao.findUserByName(username);
		if (user == null) {
			throw new LoginException("用户名不存在");
		}
		if (user.getPassword().equals(password)) {
			return user;
		} else
			throw new LoginException("密码错误");
	}

}
