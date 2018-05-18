package com.bajahoi.jspweb.entity;



public class BoardCategory {

	private String name;
	private String boardId;
	
	
	public BoardCategory() {
		// TODO Auto-generated constructor stub
	}


	public BoardCategory(
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
