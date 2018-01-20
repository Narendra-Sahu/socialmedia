package com.socialmedia.server.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.socialmedia.server.dao.IGroupDao;
import com.socialmedia.server.pojo.Group;
import com.socialmedia.server.pojo.Topic;
import com.socialmedia.server.pojo.User;

@Service
@Transactional
public class GroupService implements IGroupService {

	@Autowired
	private IGroupDao dao;
	@Override
	public Group createGroup(User user, Group group) {
		
		return dao.createGroup(user, group);
	}

	@Override
	public List<Topic> loadGroup(int gid) {
		return dao.fetchTopics(gid);		
	}

}
