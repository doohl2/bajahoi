package com.bajahoi.jspweb.entity;

import java.util.Date;

public class BoardImage {

	private String id;
	private String path;
	private String name;
	private String volume;
	private String boardId;
	private String size;
	
	public BoardImage() {
		// TODO Auto-generated constructor stub
	}

	public BoardImage(
			String id, 
			String path, 
			String name, 
			String volume, 
			String boardId, 
			String size) {
		this.id = id;
		this.path = path;
		this.name = name;
		this.volume = volume;
		this.boardId = boardId;
		this.size = size;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVolume() {
		return volume;
	}

	public void setVolume(String volume) {
		this.volume = volume;
	}

	public String getBoardId() {
		return boardId;
	}

	public void setBoardId(String boardId) {
		this.boardId = boardId;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}
	
	
}
