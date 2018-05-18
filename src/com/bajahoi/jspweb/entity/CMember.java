package com.bajahoi.jspweb.entity;

public class CMember {
	private String licenseNumber;
	private String id;

	public CMember() {
		// TODO Auto-generated constructor stub
	}

	
	public CMember(String licenseNumber, String id) {
		this.licenseNumber = licenseNumber;
		this.id = id;
	}

	public String getLicenseNumber() {
		return licenseNumber;
	}

	public void setLicenseNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	
}
