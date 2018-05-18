package com.bajahoi.Category;

import java.util.List;

import com.bajahoi.Category.entity.Category;
import com.bajahoi.Category.entity.CategoryView;
import com.bajahoi.Category.entity.WishList;

public interface Cate {
	
	int insert(WishList wishlist);
	List<CategoryView> getList(int page);
	CategoryView get(String categoryName);
	List<CategoryView> getList1(int cateId);
	List<Category> getList2();
	int getCount();

}
