package com.bajahoi.Category;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.bajahoi.Category.entity.Category;
import com.bajahoi.Category.entity.CategoryView;
import com.bajahoi.Category.entity.WishList;

public class JdbcCategoryDao implements Cate {

	
	@Override
	public int insert(WishList wishlist) 
	{
		
		
		String sql = "INSERT INTO WISH_LIST (" + 
		 		"    MEMBER_ID," + 
		 		"    PRODUCT_ID," + 
		 		"    STATUS" + 
		 		") VALUES (?,?,?)";
		 
		 int result = 0;
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				
				String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
				Connection con = DriverManager.getConnection(url, "c##bajahoi","147258369");
				
				PreparedStatement st = con.prepareStatement(sql);
				
				//st.setString(1, answeris.getId());
				st.setString(1, wishlist.getMemberId());
				st.setString(2, wishlist.getProductId());
				st.setInt(3, wishlist.getStatus());
				
				result = st.executeUpdate();
				
				st.close();
				con.close(); 
				
			} catch (ClassNotFoundException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			
			
		
		return result;
		
	}
	
	@Override
	public List<CategoryView> getList(int page) 
	{
		
		int start = 1+(page-1)*5;
		int end = 5*page;
		
		String sql = "SELECT * FROM CATEGORY_VIEW ";
		
		List<CategoryView> list = new ArrayList<>();
		
		//WHERE NUM BETWEEN ? AND ?
		 
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				
				String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
				Connection con = DriverManager.getConnection(url, "c##bajahoi","147258369");
				
				PreparedStatement st = con.prepareStatement(sql);
				/*st.setInt(1, start);
				st.setInt(2, end);*/
				
				ResultSet rs = st.executeQuery(); 
				
				CategoryView category = null;
				
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
							rs.getString("category"),
							rs.getInt("categoryid")
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
							rs.getString("category"),
							rs.getInt("categoryid")
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
	public List<CategoryView> getList1(int cateId) {
		String sql = "SELECT * FROM CATEGORY_VIEW WHERE CATEGORYID = ?";
		
		List<CategoryView> list1 = new ArrayList<>();
		
		CategoryView category1 = null;
		 
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				
				String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
				Connection con = DriverManager.getConnection(url, "c##bajahoi","147258369");
				
				PreparedStatement st = con.prepareStatement(sql);
				st.setInt(1, cateId);
				
				
				ResultSet rs = st.executeQuery();
				
				
				
				while(rs.next())
				{
					category1 = new CategoryView(
							rs.getString("imgEx"),
							rs.getString("imgName"),
							rs.getInt("opprice"),
							rs.getDate("rDate"),
							rs.getString("memId"),
							rs.getString("content"),
							rs.getInt("price"),
							rs.getString("name"),
							rs.getString("id"),
							rs.getString("category"),
							rs.getInt("categoryid")
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

	

	@Override
	public int getCount() 
	{
		String sql = "SELECT  COUNT(ID) COUNT FROM CATEGORY_VIEW";
		
		int count = 0;
		 
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				
				String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
				Connection con = DriverManager.getConnection(url, "c##bajahoi","147258369");
				
				PreparedStatement st = con.prepareStatement(sql);
				ResultSet rs = st.executeQuery(); 
				
				
				
				if(rs.next())
				{
					rs.getInt("count");
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
			
			
		
		return count;
	}

	@Override
	public List<Category> getList2() 
	{
		String sql = "SELECT * FROM CATEGORY ORDER BY ID";
		
		List<Category> list2 = new ArrayList<>();
		
		Category category2 = null;
		 
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				
				String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
				Connection con = DriverManager.getConnection(url, "c##bajahoi","147258369");
				
				PreparedStatement st = con.prepareStatement(sql);
				//st.setInt(1, cateId);
				
				
				ResultSet rs = st.executeQuery(); 
				
				
				
				while(rs.next())
				{
					category2 = new Category(
							rs.getString("name"),
							rs.getInt("id")
							);
					list2.add(category2);
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
			
			
		
		return list2;
	}

	
	

	

}
