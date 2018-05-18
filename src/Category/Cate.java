package Category;

import java.util.List;

import Category.entity.Category;
import Category.entity.CategoryView;

public interface Cate {
	
	//int insert(WishList wishlist);
	
	CategoryView get(String categoryName);
	List<Category> getList1(int cateId);
	//List<Category> getList2();
	
	List<CategoryView> getList();

}
