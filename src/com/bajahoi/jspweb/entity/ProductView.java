package com.bajahoi.jspweb.entity;

import java.util.Date;

public class ProductView extends Product{
	
	private String piName;
	private String pieName;
	
	public ProductView() {
		// TODO Auto-generated constructor stub
	}
	
	public ProductView(String name, int price, String piName, String pieName) {
		super(name, price);
		this.piName = piName;
		this.pieName = pieName;
	}

	public ProductView(String id, String name, int price, Date regDate, String regStatusName, String piName, String pieName) {
		super(id, name, price, regDate, regStatusName);
		this.piName = piName;
		this.pieName = pieName;
	}

	public ProductView(String id, String name, String content, int price, Date deliveryExpectDate,
			String deliveryReceiver, String deliverySender, String regCMemberId, String regStatusName,
			String categoryName, Date regDate, String optionName, String as, String optionPrice, String workingPeriod) {
		super(id, name, content, price, deliveryExpectDate, deliveryReceiver, deliverySender, regCMemberId, regStatusName,
				categoryName, regDate, optionName, as, optionPrice, workingPeriod);
		this.piName = piName;
		this.pieName = pieName;
	}
	
	public String getPiName() {
		return piName;
	}

	public void setPiName(String piName) {
		this.piName = piName;
	}

	public String getPieName() {
		return pieName;
	}

	public void setPieName(String pieName) {
		this.pieName = pieName;
	}
	
	
	
}
