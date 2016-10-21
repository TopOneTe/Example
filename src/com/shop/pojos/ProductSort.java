package com.shop.pojos;

import java.util.Set;

public class ProductSort {
	private int sortId;
	private String sortName;
	private String message;
	private Set<Product> pro;
	
	
	public ProductSort() {
		super();
	}
	
	public ProductSort(int sortId, String sortName, String message,
			Set<Product> pro) {
		super();
		this.sortId = sortId;
		this.sortName = sortName;
		this.message = message;
		this.pro = pro;
	}

	public int getSortId() {
		return sortId;
	}
	public void setSortId(int sortId) {
		this.sortId = sortId;
	}
	public String getSortName() {
		return sortName;
	}
	public void setSortName(String sortName) {
		this.sortName = sortName;
	}
	
	public Set<Product> getPro() {
		return pro;
	}
	public void setPro(Set<Product> pro) {
		this.pro = pro;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	

}
