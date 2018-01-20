package com.socialmedia.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.socialmedia.server.service.IUserService;

@RestController

@RequestMapping("/u")
public class UserController {
	
	@Autowired
	private IUserService userService;
	
	@RequestMapping("/{userId}")
	public void getUserDetails() {
		/*
		 * fetch user info from table and return it in json
		 */
	}
}
