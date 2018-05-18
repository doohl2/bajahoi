package com.bajahoi.jspweb.entity;

import java.util.Date;

public class BoardView extends Board{

	private String title; 
	private String content; 
	private int hit; 
	private Date regDate;
	private String regMemberId;
	private String categoryId;
	private int recommend;
	private String cmId;
	private String cmMId;
	private String cmcontent;
	private Date cmdate;
	private String cmbId;
	private String biId;
	private String biPath;
	private String Id;
	private String biName;
	private String bivolume;
	private String biBId;
	
	public BoardView() {
		// TODO Auto-generated constructor stub
	}

	
	
	
	public BoardView(String title, String content, int hit, Date regDate, String regMemberId, String categoryId,
			int recommend, String id) {
		super();
		this.title = title;
		this.content = content;
		this.hit = hit;
		this.regDate = regDate;
		this.regMemberId = regMemberId;
		this.categoryId = categoryId;
		this.recommend = recommend;
		Id = id;
	}




	public BoardView(String title, String content, int hit, Date regDate, String regMemberId, String categoryId,
			int recommend) {
		
		this.title = title;
		this.content = content;
		this.hit = hit;
		this.regDate = regDate;
		this.regMemberId = regMemberId;
		this.categoryId = categoryId;
		this.recommend = recommend;
	}

	public BoardView(String title, String content, String regMemberId, String categoryId, int recommend, String cmId,
			String cmMId, String cmcontent, String cmbId, String biId, String biPath, String id, String biName,
			String bivolume, String biBId) {
		
		this.title = title;
		this.content = content;
		this.regMemberId = regMemberId;
		this.categoryId = categoryId;
		this.recommend = recommend;
		this.cmId = cmId;
		this.cmMId = cmMId;
		this.cmcontent = cmcontent;
		this.cmbId = cmbId;
		this.biId = biId;
		this.biPath = biPath;
		Id = id;
		this.biName = biName;
		this.bivolume = bivolume;
		this.biBId = biBId;
	}


	public BoardView(String title, String content, int hit, Date regDate, String regMemberId, String categoryId,
			int recommend, String cmId, String cmMId, String cmcontent, Date cmdate, String cmbId, String biId,
			String biPath, String id, String biName, String bivolume, String biBId) {
		
		this.title = title;
		this.content = content;
		this.hit = hit;
		this.regDate = regDate;
		this.regMemberId = regMemberId;
		this.categoryId = categoryId;
		this.recommend = recommend;
		this.cmId = cmId;
		this.cmMId = cmMId;
		this.cmcontent = cmcontent;
		this.cmdate = cmdate;
		this.cmbId = cmbId;
		this.biId = biId;
		this.biPath = biPath;
		Id = id;
		this.biName = biName;
		this.bivolume = bivolume;
		this.biBId = biBId;
	}







	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getHit() {
		return hit;
	}

	public void setHit(int hit) {
		this.hit = hit;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public String getRegMemberId() {
		return regMemberId;
	}

	public void setRegMemberId(String regMemberId) {
		this.regMemberId = regMemberId;
	}

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public int getRecommend() {
		return recommend;
	}

	public void setRecommend(int recommend) {
		this.recommend = recommend;
	}

	public String getCmId() {
		return cmId;
	}

	public void setCmId(String cmId) {
		this.cmId = cmId;
	}

	public String getCmMId() {
		return cmMId;
	}

	public void setCmMId(String cmMId) {
		this.cmMId = cmMId;
	}

	public String getCmcontent() {
		return cmcontent;
	}

	public void setCmcontent(String cmcontent) {
		this.cmcontent = cmcontent;
	}

	public Date getCmdate() {
		return cmdate;
	}

	public void setCmdate(Date cmdate) {
		this.cmdate = cmdate;
	}

	public String getCmbId() {
		return cmbId;
	}

	public void setCmbId(String cmbId) {
		this.cmbId = cmbId;
	}

	public String getBiId() {
		return biId;
	}

	public void setBiId(String biId) {
		this.biId = biId;
	}

	public String getBiPath() {
		return biPath;
	}

	public void setBiPath(String biPath) {
		this.biPath = biPath;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getBiName() {
		return biName;
	}

	public void setBiName(String biName) {
		this.biName = biName;
	}

	public String getBivolume() {
		return bivolume;
	}

	public void setBivolume(String bivolume) {
		this.bivolume = bivolume;
	}

	public String getBiBId() {
		return biBId;
	}

	public void setBiBId(String biBId) {
		this.biBId = biBId;
	}
	
	

}
