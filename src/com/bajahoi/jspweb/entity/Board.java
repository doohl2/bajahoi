	package com.bajahoi.jspweb.entity;

import java.util.Date;

public class Board {

	private String id;
	private String title;
	private String content;
	private int hit;
	private Date regDate;
	private String categoryId;
	private String regMemberId;
	private int recommend;
	private String att;
	
	public Board() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Board(String id, String title, String content, int hit, Date regDate, String categoryId, String regMemberId,
			int recommend, String att) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
		this.hit = hit;
		this.regDate = regDate;
		this.categoryId = categoryId;
		this.regMemberId = regMemberId;
		this.recommend = recommend;
		this.att = att;
	}



	public Board(String id, String title, String content, int hit, Date regDate,String category, String regMemberId, int recommend) {

		this.id = id;
		this.title = title;
		this.content = content;
		this.hit = hit;
		this.regDate = regDate;
		this.categoryId = categoryId;
		this.regMemberId = regMemberId;
		this.recommend = recommend;
	}
	
	
	
	
	
	public String getAtt() {
		return att;
	}



	public void setAtt(String att) {
		this.att = att;
	}



	public int getRecommend() {
		return recommend;
	}


	public void setRecommend(int recommend) {
		this.recommend = recommend;
	}


	public String getCategoryId() {
		return categoryId;
	}


	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}


	public String getId() {
		return id;
	}
	public String getContent() {
		return content;
	}
	public int getHit() {
		return hit;
	}
	public Date getRegDate() {
		return regDate;
	}
	public String getRegMemberId() {
		return regMemberId;
	}
	public String getTitle() {
		return title;
	}
	public void setId(String id) {
		this.id = id;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public void setHit(int hit) {
		this.hit = hit;
	}

	public void setRegMemberId(String regMemberId) {
		this.regMemberId = regMemberId;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	
}
