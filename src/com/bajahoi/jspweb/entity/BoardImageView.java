package com.bajahoi.jspweb.entity;

public class BoardImageView extends BoardImage{

	private String more;
	public BoardImageView() {
		// TODO Auto-generated constructor stub
	}
	public BoardImageView(
			String id, 
			String path, 
			String name, 
			String volume, 
			String boardId, 
			String size,
			String more) {
		super(id, path, name, volume, boardId, size);
		// TODO Auto-generated constructor stub
		this.more = more;
	}
	public String getMore() {
		return more;
	}
	public void setMore(String more) {
		this.more = more;
	}
	
}
