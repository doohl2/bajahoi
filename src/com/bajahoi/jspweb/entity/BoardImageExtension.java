package com.bajahoi.jspweb.entity;

import java.util.Date;

public class BoardImageExtension {

	private String name;
	private String boardId;
	
	public BoardImageExtension() {
		// TODO Auto-generated constructor stub
	}

	public BoardImageExtension(
			String name, 
			String boardId) {
		
		this.name = name;
		this.boardId = boardId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBoardId() {
		return boardId;
	}

	public void setBoardId(String boardId) {
		this.boardId = boardId;
	}
	
	
}
