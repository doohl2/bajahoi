package com.bajahoi.jspweb.entity;

import java.util.Date;

public class OrderView extends Order{

	String name;
	String piName;
	String pieName;
	String nickname;
	String memberRankName;
	
	public OrderView() {
		// TODO Auto-generated constructor stub
	}

	public OrderView(String memberId, String productId, int quantity, Date estArrivalDate, int paymentAmount,
			String orderStatusName, String id, String name, String piName, String pieName, String nickname, String memberRankName) {
		super(memberId, productId, quantity, estArrivalDate, paymentAmount, orderStatusName, id);
		this.name = name;
		this.piName = piName;
		this.pieName = pieName;
		this.nickname = nickname;
		this.memberRankName = memberRankName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getMemberRankName() {
		return memberRankName;
	}

	public void setMemberRankName(String memberRankName) {
		this.memberRankName = memberRankName;
	}
	
}
