package com.rain.forum.dao;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rain.forum.entity.User;

public class TestUserdao {

	private UserDAO dao;
	private ApplicationContext ac;
	private ApplicationContext wac;
	final static int ID = 11;

	@Before
	public void init() {

		// ac = new ClassPathXmlApplicationContext("root-context.xml");
		ac = new ClassPathXmlApplicationContext("servlet-context.xml", "root-context.xml");
		dao = ac.getBean("userDAO", UserDAO.class);
	}

	@Test
	public void testFindAllUser() {
		List<User> users = dao.findAllUser();
		System.out.println(users);
	}

	@Test
	public void testFindUserById() {
		User user = dao.findUserById(ID);
		System.out.println(user);
	}

	@Test
	public void testSaveUser() {
		User user = new User();
		user.setUsername("this is test");
		user.setPassword("this is test");
		user.setExp(10000);
		user.setIsManager(1);
		user.setLevel(10000);
		user.setName("this is test");
		user.setSex(1);

		dao.saveUser(user);
	}

	@Test
	public void testDeleteUser() {
		dao.deleteUser(ID);
	}

	@Test
	public void testFindUserByName() {
		User user = dao.findUserByName("abc");
		System.out.println(user);
	}

}
