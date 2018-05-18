package com.bajahoi.jspweb.entity;

public class MemberRole {
	private String memberID;
	private String roleName;
	
	public MemberRole() {
		// TODO Auto-generated constructor stub
	}	
	
	public MemberRole(String memberID, String roleName) {
		super();
		this.memberID = memberID;
		this.roleName = roleName;
	}

	public String getMemberID() {
		return memberID;
	}

	public void setMemberID(String memberID) {
		this.memberID = memberID;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	
	

}
