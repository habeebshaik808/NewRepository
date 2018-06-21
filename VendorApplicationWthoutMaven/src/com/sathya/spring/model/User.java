package com.sathya.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="User_tab")
public class User 
{
	@Column(name="name",length=15)
	private String userName;
	@Id
	@Column(name="email")
	private String userEmail;
	@Column(name="mobile")
	private String userMobile;
	@Column(name="pwd")
	private String password;
	@Column(name="cpwd")
	private String confirmPassword;
	@Column(name="gender")
	private String gender;
	@Column(name="address")
	private String userAddress;
	
	public User() 
	{
		super();
	}
	public User(String userName, String userEmail, String userMobile, String password, String confirmPassword,
			String gender, String userAddress) {
		super();
		this.userName = userName;
		this.userEmail = userEmail;
		this.userMobile = userMobile;
		this.password = password;
		this.confirmPassword = confirmPassword;
		this.gender = gender;
		this.userAddress = userAddress;
	}

	public User(String userEmail) {
		super();
		this.userEmail = userEmail;
	}
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserMobile() {
		return userMobile;
	}

	public void setUserMobile(String userMobile) {
		this.userMobile = userMobile;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	@Override
	public String toString() {
		return "User [userName=" + userName + ", userEmail=" + userEmail + ", userMobile=" + userMobile + ", password="
				+ password + ", confirmPassword=" + confirmPassword + ", gender=" + gender + ", userAddress="
				+ userAddress + "]";
	}
	
}
