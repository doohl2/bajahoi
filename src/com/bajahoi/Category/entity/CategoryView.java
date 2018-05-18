package com.bajahoi.Category.entity;

import java.util.Date;

public class CategoryView 
{
	private String imgEx;
	private String imgName;
	private int opprice;
	private Date rDate;
	private String memId;
	private String content;
	private int price;
	private String name;
	private String id;
	private String categoryName;
	private int cateId;
	
	public CategoryView() {
		
	}

	public CategoryView(String imgEx, String imgName, int opprice, Date rDate, String memId, String content, int price,
			String name, String id, String categoryName, int cateId) {
		super();
		this.imgEx = imgEx;
		this.imgName = imgName;
		this.opprice = opprice;
		this.rDate = rDate;
		this.memId = memId;
		this.content = content;
		this.price = price;
		this.name = name;
		this.id = id;
		this.categoryName = categoryName;
		this.cateId = cateId;
	}

	public String getImgEx() {
		return imgEx;
	}

	public void setImgEx(String imgEx) {
		this.imgEx = imgEx;
	}

	public String getImgName() {
		return imgName;
	}

	public void setImgName(String imgName) {
		this.imgName = imgName;
	}

	public int getOpprice() {
		return opprice;
	}

	public void setOpprice(int opprice) {
		this.opprice = opprice;
	}

	public Date getrDate() {
		return rDate;
	}

	public void setrDate(Date rDate) {
		this.rDate = rDate;
	}

	public String getMemId() {
		return memId;
	}

	public void setMemId(String memId) {
		this.memId = memId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public int getCateId() {
		return cateId;
	}

	public void setCateId(int cateId) {
		this.cateId = cateId;
	}

	

	
	
	
	
}
