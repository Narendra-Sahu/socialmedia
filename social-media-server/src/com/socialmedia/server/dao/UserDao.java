package com.socialmedia.server.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.socialmedia.server.pojo.User;

@Repository
public class UserDao implements IUserDao{
	@Autowired
	private SessionFactory mSessionFactory;
	
	public UserDao(){
		
	}
	
	public User addNewUser(User newUser){
		User loadedUser=(User)mSessionFactory.getCurrentSession().merge(newUser);
		return loadedUser;
	}
	
	public User validateSecurityQuestion(String email,String question, String answer) {
		String jpql="select u from Users where uEmail=:useremail and securityQue=:que and securityAns=:ans";
		return mSessionFactory.getCurrentSession().createQuery(jpql, User.class).setParameter("useremail", email).setParameter("que", question).setParameter("ans", answer).getSingleResult();
				
	}
	
	public User getUser(String username, String Password) {
		
		String jpql="select u from Users where uId=:id and uPassword=:pass";
		return mSessionFactory.getCurrentSession().createQuery(jpql, User.class).setParameter("id", username).setParameter("pass", Password).getSingleResult();
	}
}
