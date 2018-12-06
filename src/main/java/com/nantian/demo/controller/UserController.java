package com.nantian.demo.controller;

import com.nantian.demo.domain.User;
import com.nantian.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;


	@ResponseBody
	@GetMapping("/findAllUser")
	public List<User> findAllUser() {
		return userService.findAllUser();
	}



}
