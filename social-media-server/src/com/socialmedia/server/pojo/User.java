package com.socialmedia.server.pojo;

import java.util.ArrayList;
import javax.persistence.*;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

enum Gender{
	Male,Female
}

@Entity
@Table(name="Users")
public class User {

	private Integer uId;
	private String uFname;
	private String uLname;
	@Email
	@NotEmpty
	private String uEmail;
	@Pattern(regexp="((?=.*\\d)(?=.*[a-z])(?=.*[#@$*]).{5,20})")
	private String uPassword;
	private Gender gender;
	private String uCity;
	private String uState;
	private String uPic;
	private String uInterest;
	@NotEmpty
	private String securityQue;
	@NotEmpty
	private String securityAns;
	private ArrayList<Group> uGroups;
		
	public User(){
		
	}
	
	public User(String uFname, String uLname, String uEmail, String uPassword, Gender gender, String uCity,
			String uState, String uPic, String uInterest, String securityQue, String securityAns,
			ArrayList<Group> uGroups) {
		super();
		this.uFname = uFname;
		this.uLname = uLname;
		this.uEmail = uEmail;
		this.uPassword = uPassword;
		this.gender = gender;
		this.uCity = uCity;
		this.uState = uState;
		this.uPic = uPic;
		this.uInterest = uInterest;
		this.securityQue = securityQue;
		this.securityAns = securityAns;
		this.uGroups = uGroups;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="u_id")
	public Integer getuId() {
		return uId;
	}

	public void setuId(Integer uId) {
		this.uId = uId;
	}

	@Column(name="u_fname")
	public String getuFname() {
		return uFname;
	}

	public void setuFname(String uFname) {
		this.uFname = uFname;
	}

	@Column(name="u_lname")
	public String getuLname() {
		return uLname;
	}

	public void setuLname(String uLname) {
		this.uLname = uLname;
	}

	@Column(name="u_email",unique = true)
	public String getuEmail() {
		return uEmail;
	}

	public void setuEmail(String uEmail) {
		this.uEmail = uEmail;
	}

	@Column(name="u_password")
	public String getuPassword() {
		return uPassword;
	}

	public void setuPassword(String uPassword) {
		this.uPassword = uPassword;
	}

	@Column(name="gender")
	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	@Column(name="u_city")
	public String getuCity() {
		return uCity;
	}

	public void setuCity(String uCity) {
		this.uCity = uCity;
	}

	@Column(name="u_state")
	public String getuState() {
		return uState;
	}

	public void setuState(String uState) {
		this.uState = uState;
	}

	@Column(name="u_pic",unique=true)
	public String getuPic() {
		return uPic;
	}

	public void setuPic(String uPic) {
		this.uPic = uPic;
	}

	@Column(name="u_interest")
	public String getuInterest() {
		return uInterest;
	}

	public void setuInterest(String uInterest) {
		this.uInterest = uInterest;
	}

	@Column(name="security_que")
	public String getSecurityQue() {
		return securityQue;
	}

	public void setSecurityQue(String securityQue) {
		this.securityQue = securityQue;
	}

	@Column(name="security_ans")
	public String getSecurityAns() {
		return securityAns;
	}

	public void setSecurityAns(String securityAns) {
		this.securityAns = securityAns;
	}

	@ManyToMany(mappedBy="users")
	public ArrayList<Group> getuGroups() {
		return uGroups;
	}

	public void setuGroups(ArrayList<Group> uGroups) {
		this.uGroups = uGroups;
	}
}
