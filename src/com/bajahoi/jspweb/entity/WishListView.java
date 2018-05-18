package com.bajahoi.jspweb.entity;

public class WishListView extends ProductView{

	private int status;
	private String id;
	private String nickname;
	private String rank;
	private String pid;
	
	public WishListView() {
		// TODO Auto-generated constructor stub
	}
	
	public WishListView(String pid, String name, int price, String piName, String pieName, String id, String nickname, String rank) {
		super(name, price, piName, pieName);
		this.id = id;
		this.nickname = nickname;
		this.rank = rank;
		this.pid=pid;
	}
	
//	public WishListView(String name, int price, String piName, String pieName, String id, String nickname, String rank) {
//		super(name, price, piName, pieName);
//		this.id = id;
//		this.nickname = nickname;
//		this.rank = rank;
//	}

	public int getStatus() {	
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}
	
	
	
}
