package com.bajahoi.Category.entity;

import java.util.Date;

public class WishList 
{
	private String memberId;
	private String productId;
	private int status;
	private Date regDate;
	
	
	public WishList() {
		// TODO Auto-generated constructor stub
	}
	
	public WishList(String memberId, String productId, int status, Date regDate) 
	{
		
		this.memberId = memberId;
		this.productId = productId;
		this.status = status;
		this.regDate = regDate;
	}
	
	

	public WishList(String memberId, String productId, int status) {
		super();
		this.memberId = memberId;
		this.productId = productId;
		this.status = status;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	
	
}
