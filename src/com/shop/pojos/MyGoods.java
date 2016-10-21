package com.shop.pojos;

public class MyGoods {
	private int proId;
	private String proName;
	private int proPrice;
	private String image;
	private ProductSort sort;
	
	
	
	public MyGoods() {
		super();
	}
	public MyGoods(int proId, String proName, int proPrice, String image,
			ProductSort sort) {
		super();
		this.proId = proId;
		this.proName = proName;
		this.proPrice = proPrice;
		this.image = image;
		this.sort = sort;
	}
	public int getProId() {
		return proId;
	}
	public void setProId(int proId) {
		this.proId = proId;
	}
	public String getProName() {
		return proName;
	}
	public void setProName(String proName) {
		this.proName = proName;
	}
	public int getProPrice() {
		return proPrice;
	}
	public void setProPrice(int proPrice) {
		this.proPrice = proPrice;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public ProductSort getSort() {
		return sort;
	}
	public void setSort(ProductSort sort) {
		this.sort = sort;
	}
	
	

}
