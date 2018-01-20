package com.socialmedia.server.dao;

import java.util.List;

import com.socialmedia.server.pojo.Group;
import com.socialmedia.server.pojo.Topic;
import com.socialmedia.server.pojo.User;

public interface IGroupDao {
	public Group createGroup(User user,Group group);
	public Group viewGroup(int gid);
	public List<Topic> fetchTopics(int gid);
}
