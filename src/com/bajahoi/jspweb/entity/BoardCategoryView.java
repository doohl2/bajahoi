package com.bajahoi.jspweb.entity;

public class BoardCategoryView extends BoardCategory{
	
	private String more;
	public BoardCategoryView() {
	// TODO Auto-generated constructor stub
}
	public BoardCategoryView(
			String name, 
			String boardId,
			String more) {
		super(name, boardId);
		this.more = more;
	}
	public String getMore() {
		return more;
	}
	public void setMore(String more) {
		this.more = more;
	}
	
}
