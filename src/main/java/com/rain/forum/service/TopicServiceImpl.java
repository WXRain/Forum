package com.rain.forum.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rain.forum.dao.TopicDAO;
import com.rain.forum.entity.Topic;

@Service
public class TopicServiceImpl implements TopicService {

	@Autowired
	private TopicDAO dao;

	@Override
	public List<Topic> showUserTopic(int userId) {
		List<Topic> topics;
		try {
			topics = dao.findTopicByUserId(userId);
			for (int i = 0; i < topics.size(); i++) {
				topics.get(i).setrDate(topics.get(i).longToString(topics.get(i).getReleaseDate()));
				topics.get(i).setlDate(topics.get(i).longToString(topics.get(i).getLastReplyDate()));
			}
			return topics;
		} catch (Exception e) {
			topics = null;
			return topics;
		}
	}

	@Override
	public Topic showTopic(int topicId) {
		Topic topic;
		try {
			topic = dao.findTopicById(topicId);
			return topic;
		} catch (Exception e) {
			topic = null;
			return topic;
		}
	}

}
