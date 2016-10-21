package com.shop.pojos;

public class User {
	
	private int userId;
	private String userName;
	private String userPwd;
	private String realName;
	private String userSex;
	private int userAge;
	
	public User() {
		super();
	}
	public User(int userId, String userName, String userPwd, String realName,
			String userSex, int userAge) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userPwd = userPwd;
		this.realName = realName;
		this.userSex = userSex;
		this.userAge = userAge;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	public String getUserSex() {
		return userSex;
	}
	public void setUserSex(String userSex) {
		this.userSex = userSex;
	}
	public int getUserAge() {
		return userAge;
	}
	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}
	
	

}
