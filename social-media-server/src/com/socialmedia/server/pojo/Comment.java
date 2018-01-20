package com.socialmedia.server.pojo;

import javax.persistence.*;

@Entity
@Table(name="Comments")
public class Comment {

	private Integer commId;
	private Topic topicId;
	private Integer posterId;
	private String content;
	
	public Comment(){
	}

	public Comment(Topic topicId, Integer posterId, String content) {
		super();
		this.topicId = topicId;
		this.posterId = posterId;
		this.content = content;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="comm_id")
	public Integer getCommId() {
		return commId;
	}

	public void setCommId(Integer commId) {
		this.commId = commId;
	}

	public Topic getTopicId() {
		return topicId;
	}

	public void setTopicId(Topic topicId) {
		this.topicId = topicId;
	}

	@Column(name="poster_id")
	public Integer getPosterId() {
		return posterId;
	}

	public void setPosterId(Integer posterId) {
		this.posterId = posterId;
	}

	@Column(name="content")
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}
