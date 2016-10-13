package com.rain.forum.service;

import java.util.List;

import com.rain.forum.entity.Topic;

public interface TopicService {

	public List<Topic> showUserTopic(int userId);

	public Topic showTopic(int topicId);
}
