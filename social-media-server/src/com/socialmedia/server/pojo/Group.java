package com.socialmedia.server.pojo;

import java.util.ArrayList;
import java.util.Date;
import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="groups")
public class Group {

	private Integer groupId;
	private String groupName;
	private User admin;
	private String category;
	private Date createdDate;
	private ArrayList<User> users;
	
	public Group() {
		super();
	}

	public Group(String groupName, User admin, String category, Date createdDate,
			ArrayList<User> users) {
		super();
		this.groupName = groupName;
		this.admin = admin;
		this.category = category;
		this.createdDate = createdDate;
		this.users = users;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="group_id")
	public Integer getGroupId() {
		return groupId;
	}

	public void setGroupId(Integer groupId) {
		this.groupId = groupId;
	}

	@Column(name="group_name")
	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	@ManyToOne
	@JoinColumn(name="admin_id")
	public User getAdmin() {
		return admin;
	}

	public void setAdmin(User admin) {
		this.admin = admin;
	}

	@Column(name="category")
	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Temporal(TemporalType.TIME)
	@DateTimeFormat(pattern="dd-MM-yyyy")
	@Column(name="created_date")
	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	@ManyToMany
	@JoinTable(name="group_users",joinColumns=@JoinColumn(name="group_id"),inverseJoinColumns=@JoinColumn(name="user_id"))
	public ArrayList<User> getUsers() {
		return users;
	}

	public void setUsers(ArrayList<User> users) {
		this.users = users;
	}
	
	//method to add user to group
	public void addUser(User u) {
		this.getUsers().add(u);
		u.getuGroups().add(this);
	}
}
