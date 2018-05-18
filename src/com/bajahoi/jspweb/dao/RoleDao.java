package com.bajahoi.jspweb.dao;

import java.util.List;

import com.bajahoi.jspweb.entity.Role;

public interface RoleDao {

	  List<Role> getList();
	 
	  Role get(String id);	
	 
	  int insert(Role role);
	  int update(Role role);
	  int delete(String id);
	 
}
