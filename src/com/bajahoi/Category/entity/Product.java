package com.bajahoi.Category.entity;

import java.util.Date;

public class Product {

	private String name;
	private int price;
	private String content;
	private Date deliveryExpecDate;
	private String deliveryReceiver;
	private String deliverySender;
	private String regCMemberId;
	private Date regDate;
	private String categoryName;
	private String id;
	private String regStatusName;
	private String contentDetail;
	private String optionName;
	private String as;
	private int optionPrice;
	private String wokringPeriod;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(String name, int price, String content, Date deliveryExpecDate, String deliveryReceiver,
			String deliverySender, String regCMemberId, Date regDate, String categoryName, String id,
			String regStatusName, String contentDetail, String optionName, String as, int optionPrice,
			String wokringPeriod) {
		super();
		this.name = name;
		this.price = price;
		this.content = content;
		this.deliveryExpecDate = deliveryExpecDate;
		this.deliveryReceiver = deliveryReceiver;
		this.deliverySender = deliverySender;
		this.regCMemberId = regCMemberId;
		this.regDate = regDate;
		this.categoryName = categoryName;
		this.id = id;
		this.regStatusName = regStatusName;
		this.contentDetail = contentDetail;
		this.optionName = optionName;
		this.as = as;
		this.optionPrice = optionPrice;
		this.wokringPeriod = wokringPeriod;
	}

	public Product(String name, int price, String content, String regCMemberId, Date regDate, String categoryName,
			String id, int optionPrice) {
		super();
		this.name = name;
		this.price = price;
		this.content = content;
		this.regCMemberId = regCMemberId;
		this.regDate = regDate;
		this.categoryName = categoryName;
		this.id = id;
		this.optionPrice = optionPrice;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getDeliveryExpecDate() {
		return deliveryExpecDate;
	}

	public void setDeliveryExpecDate(Date deliveryExpecDate) {
		this.deliveryExpecDate = deliveryExpecDate;
	}

	public String getDeliveryReceiver() {
		return deliveryReceiver;
	}

	public void setDeliveryReceiver(String deliveryReceiver) {
		this.deliveryReceiver = deliveryReceiver;
	}

	public String getDeliverySender() {
		return deliverySender;
	}

	public void setDeliverySender(String deliverySender) {
		this.deliverySender = deliverySender;
	}

	public String getRegCMemberId() {
		return regCMemberId;
	}

	public void setRegCMemberId(String regCMemberId) {
		this.regCMemberId = regCMemberId;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRegStatusName() {
		return regStatusName;
	}

	public void setRegStatusName(String regStatusName) {
		this.regStatusName = regStatusName;
	}

	public String getContentDetail() {
		return contentDetail;
	}

	public void setContentDetail(String contentDetail) {
		this.contentDetail = contentDetail;
	}

	public String getOptionName() {
		return optionName;
	}

	public void setOptionName(String optionName) {
		this.optionName = optionName;
	}

	public String getAs() {
		return as;
	}

	public void setAs(String as) {
		this.as = as;
	}

	public int getOptionPrice() {
		return optionPrice;
	}

	public void setOptionPrice(int optionPrice) {
		this.optionPrice = optionPrice;
	}

	public String getWokringPeriod() {
		return wokringPeriod;
	}

	public void setWokringPeriod(String wokringPeriod) {
		this.wokringPeriod = wokringPeriod;
	}
	
	

	

	
	

}
