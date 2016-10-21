package com.shop.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.shop.pojos.User;
import com.shop.sims.utils.HibernateSessionFactory;

public class UserDao {
	
	public void saveUser(User u){
		Session session = HibernateSessionFactory.getSession();
		session.beginTransaction();
		session.save(u);
		session.getTransaction().commit();
	}
	public void DeleteUers(User u){
		Session session = HibernateSessionFactory.getSession();
		session.beginTransaction();
		session.delete(u);
		session.getTransaction().commit();
	}
	public User checkUser(String userName,String UserPwd){
		User u=null;
		Session session = HibernateSessionFactory.getSession();
		Query query = session.createQuery("from User where userName = ? and userPwd = ?");
		query.setString(0, userName);
		query.setString(1, UserPwd);
		List list = query.list();
		if(list.size()>0){
			u = (User) list.get(0);
		}
		return u;
	}

}
