package com.bajahoi.jspweb.entity;

import java.util.Date;

public class Comment {

	private String id;
	private String content;
	private Date regdate;
	private String notice_Id;
	
	public Comment() {
		// TODO Auto-generated constructor stub
	}

	public Comment(String id, String content, Date regdate, String notice_Id) {
		this.id = id;
		this.content = content;
		this.regdate = regdate;
		this.notice_Id = notice_Id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getRegdate() {
		return regdate;
	}

	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}

	public String getNotice_Id() {
		return notice_Id;
	}

	public void setNotice_Id(String notice_Id) {
		this.notice_Id = notice_Id;
	}

		
}
