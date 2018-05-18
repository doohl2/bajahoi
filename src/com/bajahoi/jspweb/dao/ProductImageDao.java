package com.bajahoi.jspweb.dao;

import java.util.List;

import com.bajahoi.jspweb.entity.ProductImage;

public interface ProductImageDao {

	 List<ProductImage> getList();
	 
	 ProductImage get(String id);	
	 
	 int insert(ProductImage productImage);
	 int update(ProductImage productImage);
	 int delete(String id);
	
}
