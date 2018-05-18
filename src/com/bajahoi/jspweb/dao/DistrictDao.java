package com.bajahoi.jspweb.dao;

import java.util.List;

import com.bajahoi.jspweb.entity.District;

public interface DistrictDao {
	 List<District> getList();
	 
	  District get(String id);	
	 
	  int insert(District district);
	  int update(District district);
	  int delete(String id);
}
