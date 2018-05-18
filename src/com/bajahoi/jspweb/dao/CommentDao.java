package com.bajahoi.jspweb.dao;

import java.util.List;

import com.bajahoi.jspweb.entity.Comment;

public interface CommentDao {
	
	 List<Comment> getList();
	 
	 Comment get(String id);	
	 
	 int insert(Comment comment);
	 int update(Comment comment);
	 int delete(String id);
}
