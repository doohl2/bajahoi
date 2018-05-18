package com.bajahoi.jspweb.dao;

import java.util.List;

import com.bajahoi.jspweb.entity.Qna;

public interface QnaDao {
	
	 List<Qna> getList();
	 
	 Qna get(String id);	
	 
	 int insert(Qna qna);
	 int update(Qna qna);
	 int delete(String id);
	
}
