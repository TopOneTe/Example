package com.shop.pojos;

public class Product {
	private int proId;
	private String proName;
	private int proPrice;
	private String proComplany;
	private String proDepart;
	private String image;
	private ProductSort sort;
	
	
	public Product() {
		super();
	}
	
	public Product(int proId, String proName, int proPrice,
			String proComplany, String proDepart, String image, ProductSort sort) {
		super();
		this.proId = proId;
		this.proName = proName;
		this.proPrice = proPrice;
		this.proComplany = proComplany;
		this.proDepart = proDepart;
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
	public String getProComplany() {
		return proComplany;
	}
	public void setProComplany(String proComplany) {
		this.proComplany = proComplany;
	}
	public String getProDepart() {
		return proDepart;
	}
	public void setProDepart(String proDepart) {
		this.proDepart = proDepart;
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
