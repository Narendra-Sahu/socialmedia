package com.socialmedia.server.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.socialmedia.server.pojo.User;

@Service
@Transactional
public class UserService implements IUserService {

	@Override
	public User authenticateUser(String username, String password) {
		
		return null;
	}

}
