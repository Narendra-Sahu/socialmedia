package com.socialmedia.server.service;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.socialmedia.server.pojo.Group;
import com.socialmedia.server.pojo.Topic;
import com.socialmedia.server.pojo.User;

public interface IGroupService {
	Group createGroup(User user,Group group);
	List<Topic> loadGroup(int gid);
}
