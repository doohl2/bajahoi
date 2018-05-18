package com.bajahoi.jspweb.dao;

import java.util.List;

import com.bajahoi.jspweb.entity.ProductImageExtension;

public interface ProductImageExtensionDao {

	 List<ProductImageExtension> getList();
	 
	  ProductImageExtension get(String id);	
	 
	  int insert(ProductImageExtension productImageExtension);
	  int update(ProductImageExtension productImageExtension);
	  int delete(String id);
	
}
