package com.shop.UserAction;

import com.shop.dao.UserDao;
import com.shop.pojos.User;

public class UserLoginAction {
	private String userName;
	private String UserPwd;
	private String tips = null;
	public String execute(){
		User user = new UserDao().checkUser(userName, UserPwd);
		if(user == null){
			tips = "密码或用户名错误";
			return "fail";
		}else{
			return "success";
		}
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPwd() {
		return UserPwd;
	}
	public void setUserPwd(String userPwd) {
		UserPwd = userPwd;
	}
	public String getTips() {
		return tips;
	}
	public void setTips(String tips) {
		this.tips = tips;
	}
	

}
