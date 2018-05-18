package com.bajahoi.jspweb.dao;

import java.util.List;

import com.bajahoi.jspweb.entity.CMember;

public interface CMemberDao {
	
	 List<CMember> getList();
	 
	 CMember get(String id);	
	 
	 int insert(CMember cMember);
	 int update(CMember cMember);
	 int delete(String id);
}
