package com.bajahoi.jspweb.dao;

import java.util.List;

import com.bajahoi.jspweb.entity.MemberType;

public interface MemberTypeDao {
	
	 List<MemberType> getList();
	 
	 MemberType get(String id);	
	 
	 int insert(MemberType memberType);
	 int update(MemberType memberType);
	 int delete(String id);
}
