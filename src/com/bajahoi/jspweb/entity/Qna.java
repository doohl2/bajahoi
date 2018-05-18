package com.bajahoi.jspweb.entity;

import java.util.Date;

public class Qna {

	String id;	
	String content;	
	String answerAdminId;	
	Date answerDate;
	String answerContent;
	String answerTitle;
	String reqMemberId;
	Date Date;
	
	public Qna() {
		// TODO Auto-generated constructor stub
	}
	

	public Qna(String id, String content, String answerAdminId, Date answerDate, String answerContent,
			String answerTitle, String reqMemberId, Date Date) {
		super();
		this.id = id;
		this.content = content;
		this.answerAdminId = answerAdminId;
		this.answerDate = answerDate;
		this.answerContent = answerContent;
		this.answerTitle = answerTitle;
		this.reqMemberId = reqMemberId;
		this.Date = Date;
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

	public String getAnswerAdminId() {
		return answerAdminId;
	}

	public void setAnswerAdminId(String answerAdminId) {
		this.answerAdminId = answerAdminId;
	}

	public Date getAnswerDate() {
		return answerDate;
	}

	public void setAnswerDate(Date answerDate) {
		this.answerDate = answerDate;
	}

	public String getAnswerContent() {
		return answerContent;
	}

	public void setAnswerContent(String answerContent) {
		this.answerContent = answerContent;
	}

	public String getAnswerTitle() {
		return answerTitle;
	}

	public void setAnswerTitle(String answerTitle) {
		this.answerTitle = answerTitle;
	}

	public String getReqMemberId() {
		return reqMemberId;
	}

	public void setReqMemberId(String reqMemberId) {
		this.reqMemberId = reqMemberId;
	}

	public Date getDate() {
		return Date;
	}

	public void setDate(Date Date) {
		this.Date = Date;
	}


	
}
