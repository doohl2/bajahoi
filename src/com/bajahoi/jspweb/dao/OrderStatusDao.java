package com.bajahoi.jspweb.dao;

import java.util.List;

import com.bajahoi.jspweb.entity.OrderStatus;

public interface OrderStatusDao {
	
	 List<OrderStatus> getList();
	 
	 OrderStatus get(String id);	
	 
	 int insert(OrderStatus orderStatus);
	 int update(OrderStatus orderStatus);
	 int delete(String id);
	 
}
