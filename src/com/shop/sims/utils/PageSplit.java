package com.shop.sims.utils;

import java.util.ArrayList;

import com.softeem.java1607.DAO.StudentDAO;
import com.softeem.java1607.DTO.StudentDTO;

public class PageSplit {
	
	static int datanum = 10;
	//取出需要在页面上显示的数据
	public static ArrayList  split (ArrayList biglist,int pagenum ){
		ArrayList smalllist = new ArrayList();
		
		int start = (pagenum-1)*datanum;
		int end = pagenum*datanum-1;
		
		if(end>datacount()-1){
			end = datacount()-1;
		}
		for(int i =start;i<=end;i++){
			smalllist.add(biglist.get(i));
		}
		return smalllist;
	}
	public  static int datacount(){
		return StudentDAO.selectAll().size();
	}
	
	
	public static int pagecount(){
 return datacount()%datanum==0?datacount()/datanum:datacount()/datanum+1;
	}
	

}
