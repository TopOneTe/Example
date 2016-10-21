package com.shop.dao;

import java.util.List;

import org.hibernate.Session;

import com.shop.pojos.ProductSort;
import com.shop.sims.utils.HibernateSessionFactory;

public class ProductSortDao {
	public void saveUser(ProductSort productsort){
		Session session = HibernateSessionFactory.getSession();
		session.beginTransaction();
		session.save(productsort);
		session.getTransaction().commit();
	}
	public List<ProductSort> querySort(){
		Session session = HibernateSessionFactory.getSession();
		List list = session.createQuery("from ProductSort").list();
		return list;
	}

}
