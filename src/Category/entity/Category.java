package Category.entity;

import java.util.Date;

public class Category extends Product 
{

	private String cateName;
	
	public Category() 
	{
		
	}
	
	

	public Category(String cateName) {
		super();
		this.cateName = cateName;
	}



	public String getCateName() {
		return cateName;
	}



	public void setCateName(String cateName) {
		this.cateName = cateName;
	}

	


	
	
	
	
}
