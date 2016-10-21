package com.shop.UserAction;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Date;

import org.apache.struts2.ServletActionContext;

import com.shop.dao.ProductDao;
import com.shop.pojos.Product;

public class AddProductAction {
	private Product pro;
	private File img;
	private String imgFileName;
	public String execute() throws Exception{
		
		String imgName = new Date().getTime()+getImgFileName().substring(getImgFileName().indexOf("."));
		pro.setImage(imgName);
		new ProductDao().savePro(pro);
		
		String path = ServletActionContext.getServletContext().getRealPath("/images")+"/"+imgName;
		File file = new File(path);
		InputStream is = new FileInputStream(img);
		OutputStream os = new FileOutputStream(file);
		
		byte[] bs = new byte[1024];
		int i=-1;
		i=is.read(bs);
		while(i!= -1){
			os.write(bs, 0, i);
			i = is.read(bs);
		}
		os.close();
		is.close();
		return "success";
	}
	public Product getPro() {
		return pro;
	}
	public void setPro(Product pro) {
		this.pro = pro;
	}
	public File getImg() {
		return img;
	}
	public void setImg(File img) {
		this.img = img;
	}
	public String getImgFileName() {
		return imgFileName;
	}
	public void setImgFileName(String imgFileName) {
		this.imgFileName = imgFileName;
	}

}
