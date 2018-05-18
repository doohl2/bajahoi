package com.bajahoi.jspweb.dao;

import java.util.List;

import com.bajahoi.jspweb.entity.Order;
import com.bajahoi.jspweb.entity.OrderView;

public interface OrderDao {
	

	
	 Order get(String memberId, String productId);
	 
	 int insert(Order order);
	 int update(Order order);
	 int delete(String id);
	int getCount(String id);

	List<OrderView> getList(String memberId, int page);
	
}
