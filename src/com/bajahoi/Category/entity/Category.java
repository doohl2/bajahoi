package com.bajahoi.Category.entity;

import java.util.Date;

public class Category extends Product 
{

	private String cateName;
	private int cateId;
	
	public Category() 
	{
		
	}
	
	




	public Category(String cateName, int cateId) {
		super();
		this.cateName = cateName;
		this.cateId = cateId;
	}






	public String getCateName() {
		return cateName;
	}



	public void setCateName(String cateName) {
		this.cateName = cateName;
	}






	public int getCateId() {
		return cateId;
	}






	public void setCateId(int cateId) {
		this.cateId = cateId;
	}

	


	
	
	
	
}
