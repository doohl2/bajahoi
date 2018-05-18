package com.bajahoi.jspweb.entity;

import java.util.Date;

public class ProductReq {

	private String memberId;
	private String productId;
	private Date date;
	private String titleName;
	private String content;
	private String answerCMemberId;
	private Date answerDate;
	private String answerTitle;
	private String answerContent;
	
	public ProductReq() {
		// TODO Auto-generated constructor stub
	}
	
	public ProductReq(String memberId, String productId, Date date, String titleName, String content) {
		this.memberId = memberId;
		this.productId = productId;
		this.date = date;
		this.titleName = titleName;
		this.content = content;
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

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getTitleName() {
		return titleName;
	}

	public void setTitleName(String titleName) {
		this.titleName = titleName;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getAnswerCMemberId() {
		return answerCMemberId;
	}

	public void setAnswerCMemberId(String answerCMemberId) {
		this.answerCMemberId = answerCMemberId;
	}

	public Date getAnswerDate() {
		return answerDate;
	}

	public void setAnswerDate(Date answerDate) {
		this.answerDate = answerDate;
	}

	public String getAnswerTitle() {
		return answerTitle;
	}

	public void setAnswerTitle(String answerTitle) {
		this.answerTitle = answerTitle;
	}

	public String getAnswerContent() {
		return answerContent;
	}

	public void setAnswerContent(String answerContent) {
		this.answerContent = answerContent;
	}
	
	
}
