package com.bajahoi.jspweb.entity;

public class District {

	private String id;
	private String cityId;
	
	public District() {
		// TODO Auto-generated constructor stub
	}
	
	public District(String id, String cityId) {
		this.id = id;
		this.cityId = cityId;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getcityId() {
		return cityId;
	}

	public void setcityId(String cityId) {
		this.cityId = cityId;
	}
	
		
}
