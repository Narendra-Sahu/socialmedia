package com.socialmedia.server.pojo;

import java.util.ArrayList;
import javax.persistence.*;

@Entity
@Table(name="Topic")
public class Topic {

	private Integer topicId;
	private Group groupId;
	private String content;
	private User creatorId;
	private ArrayList<Comment> comments;
	
	public Topic(){
		
	}

	public Topic(Group groupId, String content, User creatorId, ArrayList<Comment> comments) {
		super();
		this.groupId = groupId;
		this.content = content;
		this.creatorId = creatorId;
		this.comments = comments;
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="topic_id")
	public Integer getTopicId() {
		return topicId;
	}

	public void setTopicId(Integer topicId) {
		this.topicId = topicId;
	}

	@ManyToOne
	@JoinColumn(name="group_id")
	public Group getGroupId() {
		return groupId;
	}

	public void setGroupId(Group groupId) {
		this.groupId = groupId;
	}

	@Column(name="content")
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Column(name="creator_id")
	public User getCreatorId() {
		return creatorId;
	}

	public void setCreatorId(User creatorId) {
		this.creatorId = creatorId;
	}

	@OneToMany
	@JoinColumn(name="comment_id")
	public ArrayList<Comment> getComments() {
		return comments;
	}

	public void setComments(ArrayList<Comment> comments) {
		this.comments = comments;
	}	
}
