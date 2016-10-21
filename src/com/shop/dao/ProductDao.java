package com.shop.dao;

import java.util.List;

import org.hibernate.Session;

import com.shop.pojos.Product;
import com.shop.sims.utils.HibernateSessionFactory;

public class ProductDao {
	public void savePro(Product product){
		Session session = HibernateSessionFactory.getSession();
		session.beginTransaction();
		session.save(product);
		session.getTransaction().commit();
	}
	public List<Product> listPro(){
		Session session = HibernateSessionFactory.getSession();
		List<Product> list = session.createQuery("from Product").list();
		return list;
	}

}
