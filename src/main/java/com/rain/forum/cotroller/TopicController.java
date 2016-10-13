package com.rain.forum.cotroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rain.forum.entity.Topic;
import com.rain.forum.service.TopicService;

@Controller
@RequestMapping("/topic")
public class TopicController {
	@Autowired
	private TopicService topicService;

	@RequestMapping("/showTopic.do")
	@ResponseBody
	public JsonResult<Topic> showTopic(int topicId) {
		Topic topic = topicService.showTopic(topicId);
		return new JsonResult<Topic>(topic);
	}
}
