package com.socialmedia.server.pojo;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

enum Gender{
	Male,Female
}

@Entity
@Table(name="Users")
public class User {

	private Integer uid;
	private String ufname;
	private String ulname;
	private String uemail;
	private String upassword;
	private Gender gender;
	private String ucity;
	private String ustate;
	private String upic;
	private Integer urep;
	private String uinterest;
	
	public User(){
		
	}
	
	public User(String ufname, String ulname, String uemail, String upassword, Gender gender, String ucity,
			String ustate, String upic, Integer urep, String uinterest) {
		super();
		this.ufname = ufname;
		this.ulname = ulname;
		this.uemail = uemail;
		this.upassword = upassword;
		this.gender = gender;
		this.ucity = ucity;
		this.ustate = ustate;
		this.upic = upic;
		this.urep = urep;
		this.uinterest = uinterest;
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getUid() {
		return uid;
	}
	
	@Column(name="ufname")
	public String getUfname() {
		return ufname;
	}

	@Column(name="ulname")
	public String getUlname() {
		return ulname;
	}

	@Column(name="uemail")
	public String getUemail() {
		return uemail;
	}

	@Column(name="upassword")
	public String getUpassword() {
		return upassword;
	}

	@Column(name="gender")
	public Gender getGender() {
		return gender;
	}

	@Column(name="ucity")
	public String getUcity() {
		return ucity;
	}

	@Column(name="ustate")
	public String getUstate() {
		return ustate;
	}

	@Column(name="upic")
	public String getUpic() {
		return upic;
	}

	@Column(name="urep")
	public Integer getUrep() {
		return urep;
	}

	@Column(name="uinterest")
	public String getUinterest() {
		return uinterest;
	}
	
	
}
