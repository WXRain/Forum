package com.rain.forum.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.rain.forum.entity.User;

public interface UserDAO {

	public void saveUser(User user);
	public List<User> findAllUser();
	public User findUserById(int id);
	public void updateUser (User user);
	public void deleteUser(int id);
	public User findUserByName(String username);
}
