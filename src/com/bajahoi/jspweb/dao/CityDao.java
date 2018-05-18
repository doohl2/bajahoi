package com.bajahoi.jspweb.dao;

import java.util.List;

import com.bajahoi.jspweb.entity.City;

public interface CityDao {
	 List<City> getList();
	 
	 City get(String id);	
	 
	 int insert(City city);
	 int update(City city);
	 int delete(String id);
}
