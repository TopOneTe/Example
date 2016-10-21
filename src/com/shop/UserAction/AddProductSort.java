package com.shop.UserAction;

import com.shop.dao.ProductSortDao;
import com.shop.pojos.ProductSort;

public class AddProductSort {
	private ProductSort ps;
	private String tips = null;
	public String execute(){
		new ProductSortDao().saveUser(ps);
		return "success";
	}
	public ProductSort getPs() {
		return ps;
	}
	public void setPs(ProductSort ps) {
		this.ps = ps;
	}
	public String getTips() {
		return tips;
	}
	public void setTips(String tips) {
		this.tips = tips;
	}
	

}
