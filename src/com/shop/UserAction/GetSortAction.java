package com.shop.UserAction;

import java.util.List;

import com.shop.dao.ProductSortDao;
import com.shop.pojos.ProductSort;

public class GetSortAction {
	private List<ProductSort> list;
	public String execute(){
		ProductSortDao psd = new ProductSortDao();
		list = psd.querySort();
		return "success";
	}
	public List<ProductSort> getList() {
		return list;
	}
	public void setList(List<ProductSort> list) {
		this.list = list;
	}
	
}
