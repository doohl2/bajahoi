package com.bajahoi.jspweb.entity;

import java.util.Date;

public class Order {

	private String memberId;
	private String productId;
	private Date date;
	private int quantity;
	private Date estArrivalDate;
	private String reviewName;
	private String reviewContent;
	private Date reviewDate;
	private String reviewLike;
	private int paymentAmount;
	private Date paymentDate;
	private String paymentMethod;
	private String orderStatusName;
	private String id;
	
	public Order() {
		// TODO Auto-generated constructor stub
	}

	
	
	public Order(String memberId, String productId, int quantity, Date estArrivalDate, int paymentAmount,
			String orderStatusName, String id) {
		this.memberId = memberId;
		this.productId = productId;
		this.quantity = quantity;
		this.estArrivalDate = estArrivalDate;
		this.paymentAmount = paymentAmount;
		this.orderStatusName = orderStatusName;
		this.id = id;
	}

	public Order(String memberId, String productId, Date date, int quantity, Date estArrivalDate, String reviewName,
			String reviewContent, Date reviewDate, String reviewLike, int paymentAmount, Date paymentDate,
			String paymentMethod, String orderStatusName, String id) {
		this.memberId = memberId;
		this.productId = productId;
		this.date = date;
		this.quantity = quantity;
		this.estArrivalDate = estArrivalDate;
		this.reviewName = reviewName;
		this.reviewContent = reviewContent;
		this.reviewDate = reviewDate;
		this.reviewLike = reviewLike;
		this.paymentAmount = paymentAmount;
		this.paymentDate = paymentDate;
		this.paymentMethod = paymentMethod;
		this.orderStatusName = orderStatusName;
		this.id = id;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Date getEstArrivalDate() {
		return estArrivalDate;
	}

	public void setEstArrivalDate(Date estArrivalDate) {
		this.estArrivalDate = estArrivalDate;
	}

	public String getReviewName() {
		return reviewName;
	}

	public void setReviewName(String reviewName) {
		this.reviewName = reviewName;
	}

	public String getReviewContent() {
		return reviewContent;
	}

	public void setReviewContent(String reviewContent) {
		this.reviewContent = reviewContent;
	}

	public Date getReviewDate() {
		return reviewDate;
	}

	public void setReviewDate(Date reviewDate) {
		this.reviewDate = reviewDate;
	}

	public String getReviewLike() {
		return reviewLike;
	}

	public void setReviewLike(String reviewLike) {
		this.reviewLike = reviewLike;
	}

	public int getPaymentAmount() {
		return paymentAmount;
	}

	public void setPaymentAmount(int paymentAmount) {
		this.paymentAmount = paymentAmount;
	}

	public Date getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public String getOrderStatusName() {
		return orderStatusName;
	}

	public void setOrderStatusName(String orderStatusName) {
		this.orderStatusName = orderStatusName;
	}
	
	
	
}
