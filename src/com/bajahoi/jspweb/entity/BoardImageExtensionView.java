package com.bajahoi.jspweb.entity;

public class BoardImageExtensionView extends BoardImageExtension {

	private String more;
	public BoardImageExtensionView() {
		// TODO Auto-generated constructor stub
	}
	public BoardImageExtensionView(
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
