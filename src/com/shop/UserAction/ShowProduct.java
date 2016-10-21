package com.shop.UserAction;

import java.util.List;

import com.shop.dao.ProductDao;
import com.shop.pojos.Product;

public class ShowProduct {
	List<Product> list;
	public String execute(){
		list = new ProductDao().listPro();
		return "success";
	}
	public List<Product> getList() {
		return list;
	}
	public void setList(List<Product> list) {
		this.list = list;
	}
	
	

}
