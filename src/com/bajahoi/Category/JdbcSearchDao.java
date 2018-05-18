package com.bajahoi.Category;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bajahoi.Category.entity.CategoryView;

public class JdbcSearchDao implements Search 
{

	@Override
	public List<CategoryView> getList(String tag) 
	{
		String sql = "SELECT * FROM CATEGORY_VIEW WHERE NAME LIKE ?";
		
		List<CategoryView> list = new ArrayList<>();
		
		CategoryView category = null;
		 
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				
				String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
				Connection con = DriverManager.getConnection(url, "c##bajahoi","147258369");
				
				PreparedStatement st = con.prepareStatement(sql);
				
				st.setString(1, tag);
				
				
				ResultSet rs = st.executeQuery();
				
				
				
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
				System.out.println(sql);
				e.printStackTrace();
			} catch (SQLException e) 
			{
				System.out.println(sql);
				e.printStackTrace();
			} 
			
			
		
		return list;
	}

}
