package com.bajahoi.jspweb.dao;

import java.util.List;

import com.bajahoi.jspweb.entity.Board;
import com.bajahoi.jspweb.entity.BOARD_Comment;

public interface BOARD_CommentDao {
	
	public int delete(String id);
	public int insert(BOARD_Comment comment);
	public int update(BOARD_Comment comment);
	
	public List<BOARD_Comment> getList(String boardId);
	public BOARD_Comment get(String boardId);
	int getCount(String categortId);

}
