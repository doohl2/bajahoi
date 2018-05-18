package com.bajahoi.jspweb.entity;

public class MemberRank {
	private String name;
	private String memberId;
	
	public MemberRank() {
		// TODO Auto-generated constructor stub
	}
	
	public MemberRank(String name, String memberId) {
		this.name = name;
		this.memberId = memberId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	
		
}
