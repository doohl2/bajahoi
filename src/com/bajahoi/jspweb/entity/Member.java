package com.bajahoi.jspweb.entity;

import java.util.Date;

public class Member {
	
	//postcode,address1,address2 = address
	//memberType1,memberType2 = memberTypeName
	//phone1,phone2,phon3 = phone
	
	private String id;
	private String password;
	private String name;
	private String nickname;
	private String email1;
	private String email2;
	private String phone;
	private String profile;
	private String postcode;
	private String address1;
	private String address2;
	private Date regDate;
	private String memberType1;
	private String memberType2;
	private String memberRankName;
		
	public Member() {
		// TODO Auto-generated constructor stub
	}

	public Member(String id, String password, String name, String nickname, String email1, String phone, String profile,
			String address1, Date regDate, String memberType1, String memberRankName) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
		this.nickname = nickname;
		this.email1 = email1+getEmail2();
		this.phone = phone;
		this.profile = profile;
		this.address1 = address1;
		this.regDate = regDate;
		this.memberType1 = memberType1;
		this.memberRankName = memberRankName;
	}

	public Member(String id, String password, String name, String nickname, String email1,
			String email2, String phone, String profile, String postcode, String address1,
			String address2, Date regDate, String memberType1, String memberType2, String memberRankName) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
		this.nickname = nickname;
		this.email1 = email1;
		this.email2 = email2;
		this.phone = phone;
		this.profile = profile;
		this.postcode = postcode;
		this.address1 = address1;
		this.address2 = address2;
		this.regDate = regDate;
		this.memberType1 = memberType1;
		this.memberType2 = memberType2;
		this.memberRankName = memberRankName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getProfile() {
		return profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}
	
	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public String getMemberRankName() {
		return memberRankName;
	}

	public void setMemberRankName(String memberRankName) {
		this.memberRankName = memberRankName;
	}

	public String getEmail1() {
		return email1;
	}

	public void setEmail1(String email1) {
		this.email1 = email1;
	}

	public String getEmail2() {
		return email2;
	}

	public void setEmail2(String email2) {
		this.email2 = email2;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public String getAddress1() {
		if(address1==null) 
			address1="";
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		if(address2==null) 
			address2="";
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getMemberType1() {
		if(memberType1==null) {
			memberType1 = "";}
		return memberType1;
	}

	public void setMemberType1(String memberType1) {
		this.memberType1 = memberType1;
	}

	public String getMemberType2() {
		return memberType2;
	}

	public void setMemberType2(String memberType2) {
		this.memberType2 = memberType2;
	}
		
}
	