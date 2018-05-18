package com.bajahoi.jspweb.entity;

public class City {

	private String id;
	private String memberId;
	
	public City() {
		// TODO Auto-generated constructor stub
	}
	
	public City(String id, String memberId) {
		this.id = id;
		this.memberId = memberId;
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
	
		
}
