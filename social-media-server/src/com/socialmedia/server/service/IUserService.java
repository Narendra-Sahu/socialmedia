package com.socialmedia.server.service;

import com.socialmedia.server.pojo.User;

public interface IUserService {
	public User authenticateUser(String username, String password);
}
