package com.rain.forum.cotroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rain.forum.entity.Topic;
import com.rain.forum.entity.User;
import com.rain.forum.service.TopicService;
import com.rain.forum.service.UserService;

@Controller
@RequestMapping("/account")
public class AccountController {

	@Autowired
	private UserService userService;

	@Autowired
	private TopicService topicService;

	@RequestMapping("/login.do")
	@ResponseBody
	public JsonResult<User> login(String username, String password) {
		try {
			// System.out.println(username + " " + password);
			User user = userService.login(username, password);
			return new JsonResult<User>(user);
		} catch (Exception e) {
			e.printStackTrace();
			String message = e.getMessage();
			return new JsonResult<User>(message);
		}
	}

	@RequestMapping("/showUserTopics.do")
	@ResponseBody
	public JsonResult<List<Topic>> showUserTopics(int userId) {
		try {
			List<Topic> topics = topicService.showUserTopic(userId);
			return new JsonResult<List<Topic>>(topics);
		} catch (Exception e) {
			e.printStackTrace();
			String message = e.getMessage();
			return new JsonResult<List<Topic>>(message);
		}

	}
}
