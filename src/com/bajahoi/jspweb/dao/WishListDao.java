package com.bajahoi.jspweb.dao;

import java.util.List;

import com.bajahoi.jspweb.entity.WishList;
import com.bajahoi.jspweb.entity.WishListView;

public interface WishListDao {
	 
	 List<WishListView> getList(String id, int page);
	 WishListView get(String id);	
	 int update(WishList wishList);
	 int getCount(String id);
	 int delete(String mid,String pid);
	 
}
