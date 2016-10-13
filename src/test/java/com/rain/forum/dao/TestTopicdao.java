package com.rain.forum.dao;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rain.forum.entity.Topic;

public class TestTopicdao {

	private TopicDAO dao;
	private ApplicationContext ac;

	@Before
	public void init() {
		ac = new ClassPathXmlApplicationContext("root-context.xml", "servlet-context.xml");
		dao = ac.getBean("topicDAO", TopicDAO.class);
	}

	@Test
	public void testSaveTopic() {
		Topic topic = new Topic(20, 1, 1, 1, 1, "1", "1", 1, 1, 1, 1);
		dao.saveTopic(topic);
	}

	@Test
	public void testFindAllTopic() {
		List<Topic> topics = dao.findAllTopic();
		System.out.println(topics);
	}

	@Test
	public void testFindTopicById() {
		Topic topic = dao.findTopicById(6);
		System.out.println(topic);
	}

	@Test
	public void testUpdateTopic() {
		Topic topic = dao.findTopicById(20);
		topic.setUserId(topic.getUserId() * 2);
		dao.updateTopic(topic);
	}

	@Test
	public void testDeleteTopic() {
		dao.deleteTopic(20);
		testFindAllTopic();
	}

	@Test
	public void abc() {
		Topic topic = new Topic(20, 1, 1, 1, 1, "1", "1", 1, 1, 1, 1);
		System.out.println(topic);
	}

}
