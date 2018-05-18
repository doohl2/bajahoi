package Category;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Category.entity.Category;
import Category.entity.CategoryView;

public class IndexDao implements Cate {

	@Override
	public List<CategoryView> getList() 
	{
		String sql = "SELECT*FROM CATEGORY_VIEW";
		
		List<CategoryView> list = new ArrayList<>();
		
		CategoryView category = null;
		 
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				
				String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
				Connection con = DriverManager.getConnection(url, "c##bajahoi","147258369");
				
				Statement st = con.createStatement();
				
				ResultSet rs = st.executeQuery(sql); 
				
				
				
				while(rs.next())
				{
					category = new CategoryView(
							rs.getString("imgEx"),
							rs.getString("imgName"),
							rs.getInt("opprice"),
							rs.getDate("rDate"),
							rs.getString("memId"),
							rs.getString("content"),
							rs.getInt("price"),
							rs.getString("name"),
							rs.getString("id"),
							rs.getString("category")
							);
					list.add(category);
				}
			
				
			
				rs.close();
				st.close();
				con.close(); 
				
			} catch (ClassNotFoundException e) 
			{
				e.printStackTrace();
			} catch (SQLException e) 
			{
				e.printStackTrace();
			} 
			
			
		
		return list;
	}

	@Override
	public CategoryView get(String categoryName) 
	{
		String sql = "SELECT * FROM CATEGORY_VIEW WHERE CATEGORY_NAME=?";
		CategoryView category = null;
		 
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				
				String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
				Connection con = DriverManager.getConnection(url, "c##bajahoi","147258369");
				
				PreparedStatement st = con.prepareStatement(sql);
				st.setString(1, categoryName);
				
				ResultSet rs = st.executeQuery(); 
				
				
				
				if(rs.next())
				{
					category = new CategoryView(
							rs.getString("imgEx"),
							rs.getString("imgName"),
							rs.getInt("opprice"),
							rs.getDate("rDate"),
							rs.getString("memId"),
							rs.getString("content"),
							rs.getInt("price"),
							rs.getString("name"),
							rs.getString("id"),
							rs.getString("category")
							);
				}
			
				
			
				rs.close();
				st.close();
				con.close(); 
				
			} catch (ClassNotFoundException e) 
			{
				e.printStackTrace();
			} catch (SQLException e) 
			{
				e.printStackTrace();
			} 
			
			
		
		return category;
	}

	@Override
	public List<Category> getList1(int cateId) {
String sql = "SELECT * FROM CATEGORY";
		
		List<Category> list1 = new ArrayList<>();
		
		Category category1 = null;
		 
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				
				String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
				Connection con = DriverManager.getConnection(url, "c##bajahoi","147258369");
				
				Statement st = con.createStatement();
				
				ResultSet rs = st.executeQuery(sql); 
				
				
				
				while(rs.next())
				{
					category1 = new Category(
							rs.getString("name")
							);
					list1.add(category1);
				}
			
				
			
				rs.close();
				st.close();
				con.close(); 
				
			} catch (ClassNotFoundException e) 
			{
				e.printStackTrace();
			} catch (SQLException e) 
			{
				e.printStackTrace();
			} 
			
			
		
		return list1;
	}

	

	

}
