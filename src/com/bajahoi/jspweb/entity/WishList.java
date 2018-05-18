package com.bajahoi.jspweb.entity;

import java.util.Date;

public class WishList {
	
	private String memberId;
	private String productId;
	private String status;
	private Date regDate;
	
	public WishList() {
		// TODO Auto-generated constructor stub
	}

	public WishList(String memberId, String productId, String status, Date regDate) {
		super();
		this.memberId = memberId;
		this.productId = productId;
		this.status = status;
		this.regDate = regDate;
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	
	
}
