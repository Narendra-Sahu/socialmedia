package com.socialmedia.server.dao;

import com.socialmedia.server.pojo.User;

public interface IUserDao {
	public User addNewUser(User newUser);
	public User validateSecurityQuestion(String email,String question, String answer);
	public User getUser(String username, String Password);
}
