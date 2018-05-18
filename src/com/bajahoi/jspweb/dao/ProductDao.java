package com.bajahoi.jspweb.dao;

import java.util.List;

import com.bajahoi.jspweb.entity.Product;
import com.bajahoi.jspweb.entity.ProductView;

public interface ProductDao {
	 
	  Product get(String id);
	  ProductView get2(String id);	
	 
	  int insert(Product product);
	  int update(Product product);
	  int delete(String id);

	List<ProductView> getList(String regCMemberId);
	 
}