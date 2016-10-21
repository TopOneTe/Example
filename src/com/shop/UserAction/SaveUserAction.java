package com.shop.UserAction;

import com.shop.dao.UserDao;
import com.shop.pojos.User;

public class SaveUserAction {
	private User user;
	
	public String execute(){
		new UserDao().saveUser(user);
		return "success";
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	

}
