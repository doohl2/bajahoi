package com.bajahoi.jspweb.dao;

import java.util.List;

import com.bajahoi.jspweb.entity.ProductReq;

public interface ProductReqDao {
	
	 List<ProductReq> getList();
	 
	 ProductReq get(String id);	
	 
	int insert(ProductReq productReq);
	int update(ProductReq productReq);
	int delete(String id);
	 
}
