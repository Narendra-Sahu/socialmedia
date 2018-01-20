package com.socialmedia.server.dao;

import java.text.SimpleDateFormat;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.socialmedia.server.pojo.Group;
import com.socialmedia.server.pojo.Topic;
import com.socialmedia.server.pojo.User;

@Repository
public class GroupDao implements IGroupDao{
	@Autowired
	private SessionFactory sf;
	
	@Override
	public Group createGroup(User user, Group group) {
		
		String gjpql="insert into Group(groupName,admin,category,createdDate,users) "
				+ "values(group.groupName,user,group.admin,new Date(),user)";
		return sf.getCurrentSession().createQuery(gjpql, Group.class).getSingleResult();
	}

	@Override
	public Group viewGroup(int gid) {
		String jpql = "select g from Group g where groupId=:gid";
		return sf.getCurrentSession().createQuery(jpql, Group.class).setParameter("gid",gid).getSingleResult();
		
	}

	@Override
	public List<Topic> fetchTopics(int gid) {
		String jpql = "select t from Topic t where groupId=:gid";
		
		return sf.getCurrentSession().createQuery(jpql, Topic.class).setParameter("gid", gid).getResultList();
	}

}
