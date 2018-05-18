package com.bajahoi.jspweb.dao;

import java.util.List;

import com.bajahoi.jspweb.entity.MemberRole;

public interface MemberRoleDao {
	
	 List<MemberRole> getList();
	 
	 MemberRole get(String id);	
	 
	 int insert(MemberRole memberRole);
	 int update(MemberRole memberRole);
	 int delete(String id);
}
