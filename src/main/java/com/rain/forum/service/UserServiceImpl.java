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
			throw new LoginException("�û�������Ϊ��");
		}
		if (password == null || password.trim().isEmpty()) {
			throw new LoginException("���벻��Ϊ��");
		}
		// System.out.println(username + " " + password);
		user = userDao.findUserByName(username);
		if (user == null) {
			throw new LoginException("�û���������");
		}
		if (user.getPassword().equals(password)) {
			return user;
		} else
			throw new LoginException("�������");
	}

}
