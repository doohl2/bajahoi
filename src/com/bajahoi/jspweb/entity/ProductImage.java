package com.bajahoi.jspweb.entity;

public class ProductImage {
	
	private String productId;
	private String name;
	private String productImageExtensionName;
	
	public ProductImage() {
		// TODO Auto-generated constructor stub
	}

	public ProductImage(String productId, String name, String productImageExtensionName) {
		super();
		this.productId = productId;
		this.name = name;
		this.productImageExtensionName = productImageExtensionName;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProductImageExtensionName() {
		return productImageExtensionName;
	}

	public void setId(String productImageExtensionName) {
		this.productImageExtensionName = productImageExtensionName;
	}
}