package com.rain.forum.dao;

import java.util.List;

import com.rain.forum.entity.Topic;

public interface TopicDAO {

	public void saveTopic(Topic topic);

	public List<Topic> findAllTopic();

	public Topic findTopicById(int id);

	public void updateTopic(Topic topic);

	public void deleteTopic(int id);

	public List<Topic> findTopicByUserId(int userId);
}
