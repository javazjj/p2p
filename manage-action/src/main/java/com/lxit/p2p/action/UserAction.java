package com.lxit.p2p.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lxit.p2p.bean.User;
import com.lxit.p2p.service.UserService;

@RestController
@EnableAutoConfiguration
@ComponentScan(basePackages = { "com.lxit.p2p.service" })
public class UserAction {

	@Resource
	UserService userService;

	@RequestMapping("/queryUser")
	public List<User> query() {
		List<User> userList = userService.query();
		return userList;
	}

}
