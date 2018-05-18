package com.bajahoi.Category;

import java.util.List;

import com.bajahoi.Category.entity.CategoryView;

public interface Search 
{
	List<CategoryView> getList(String tag);

}
