package com.bajahoi.jspweb.entity;

public class MemberType {

	private String Name;
	private String memberId;
	
	public MemberType() {
		// TODO Auto-generated constructor stub
	}
	
	public MemberType(String name, String memberId) {
		Name = name;
		this.memberId = memberId;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

}
