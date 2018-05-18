package com.bajahoi.jspweb.entity;

import java.util.Date;

public class BOARD_Comment {

	private String memberId;
	private String boardId;
	private String content;
	private Date commentdate;
	private String id;
	
public BOARD_Comment() {
	// TODO Auto-generated constructor stub
}

public BOARD_Comment(
		String memberId, 
		String boardId, 
		String content, 
		Date commentdate,
		String id) {
	
	this.memberId = memberId;
	this.boardId = boardId;
	this.content = content;
	this.commentdate = commentdate;
	this.id = id;
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

public String getBoardId() {
	return boardId;
}

public void setBoardId(String boardId) {
	this.boardId = boardId;
}

public String getContent() {
	return content;
}

public void setContent(String content) {
	this.content = content;
}

public Date getCommentdate() {
	return commentdate;
}

public void setCommentdate(Date commentdate) {
	this.commentdate = commentdate;
}


}
