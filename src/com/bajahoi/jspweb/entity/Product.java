package com.bajahoi.jspweb.entity;

import java.util.Date;

public class Product {

	private String name;
	private int price;	
	private String content;	
	private Date deliveryExpectDate;
	private String deliveryName;
	private String deliverySender;
	private String regCMemberId;
	private Date regDate;
	private String categoryName;
	private String id;
	private String regStatusName;
	private String optionName;
	private String as;
	private String optionPrice;
	private String workingPeriod;
	
	public Product() {
		
	}


	
	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}


	public Product(String id, String name, int price, Date regDate, String regStatusName) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.regDate = regDate;
		this.regStatusName = regStatusName;
	}

	public Product(String name, int price, String content, Date deliveryExpectDate, String deliveryName,
			String deliverySender, String regCMemberId, Date regDate, String categoryName, String id, String regStatusName) {
		this.name = name;
		this.price = price;
		this.content = content;
		this.deliveryExpectDate = deliveryExpectDate;
		this.deliveryName = deliveryName;
		this.deliverySender = deliverySender;
		this.regCMemberId = regCMemberId;
		this.regDate = regDate;
		this.categoryName = categoryName;
		this.id = id;
		this.regStatusName = regStatusName;
	}
	
	public Product(String id, String name, String content, int price, Date deliveryExpectDate,
			String deliveryReceiver, String deliverySender, String regCMemberId, String regStatusName,
			String categoryName, Date regDate, String optionName, String as, String optionPrice, String workingPeriod) {
		super();
		this.id = id;
		this.name = name;
		this.content = content;
		this.price = price;
		this.deliveryExpectDate = deliveryExpectDate;
		this.deliveryName = deliveryName;
		this.deliverySender = deliverySender;
		this.regCMemberId = regCMemberId;
		this.regStatusName = regStatusName;
		this.categoryName = categoryName;
		this.regDate = regDate;
		this.optionName = optionName;
		this.as = as;
		this.optionPrice = optionPrice;
		this.workingPeriod = workingPeriod;
	}
	
	public String getRegStatusName() {
		return regStatusName;
	}

	public void setRegStatusName(String regStatusName) {
		this.regStatusName = regStatusName;
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

	public Date getDeliveryExpectDate() {
		return deliveryExpectDate;
	}

	public void setDeliveryExpectDate(Date deliveryExpectDate) {
		this.deliveryExpectDate = deliveryExpectDate;
	}

	public String getDeliveryName() {
		return deliveryName;
	}

	public void setDeliveryName(String deliveryName) {
		this.deliveryName = deliveryName;
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



	public String getOptionPrice() {
		return optionPrice;
	}



	public void setOptionPrice(String optionPrice) {
		this.optionPrice = optionPrice;
	}



	public String getWorkingPeriod() {
		return workingPeriod;
	}



	public void setWorkingPeriod(String workingPeriod) {
		this.workingPeriod = workingPeriod;
	}



}
