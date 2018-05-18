package com.bajahoi.jspweb.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.bajahoi.jspweb.dao.WishListDao;
import com.bajahoi.jspweb.entity.WishList;
import com.bajahoi.jspweb.entity.WishListView;

public class JdbcWishListDao implements WishListDao{

	@Override
	public List<WishListView> getList(String id,int page) {
		int start = 1+(page-1)*3; // 1 4 7 11
		int end = page*3; // 3 6 9 12
		String sql = "	SELECT C.* FROM (SELECT ROWNUM NUM, W.* FROM WISH_LIST_VIEW W WHERE ID=?) C WHERE NUM BETWEEN ? AND ?";
		List<WishListView> list = new ArrayList<>();	
		
		// 드라이버 로드
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			Connection con = DriverManager.getConnection(url, "c##bajahoi", "147258369");
		    PreparedStatement st = con.prepareStatement(sql);
		    
		    st.setString(1,id);
		    st.setInt(2, start);
		    st.setInt(3, end);
		    
			ResultSet rs = st.executeQuery();
			
				
			while(rs.next()) { 
				WishListView wishlistview = new WishListView(
						rs.getString("PID"),
						rs.getString("NAME"),
						rs.getInt("PRICE"),
						rs.getString("PINAME"),
						rs.getString("PIENAME"),
						rs.getString("ID"),
						rs.getString("NICKNAME"),
						rs.getString("RANK")
						);
				list.add((WishListView) wishlistview);
			}
			
			rs.close();
			st.close();
			con.close();

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}

	@Override
	public WishListView get(String id) {
		String sql = "SELECT * FROM WISH_LIST_VIEW WHERE ID=?";
		WishListView wishlist = null;
		   
	      // 드라이버 로드
	      try {
	         Class.forName("oracle.jdbc.driver.OracleDriver");
		     String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			 Connection con = DriverManager.getConnection(url, "c##bajahoi", "147258369");
	         PreparedStatement st = con.prepareStatement(sql);

	         st.setString(1,id);
	         
	         ResultSet rs = st.executeQuery();
	             
	         
	         if(rs.next()) { 
	        	wishlist = new WishListView(
	        			rs.getString("PID"),
	        			rs.getString("NAME"),
						rs.getInt("PRICE"),
						rs.getString("PINAME"),
						rs.getString("PIENAME"),
						rs.getString("ID"),
						rs.getString("NICKNAME"),
						rs.getString("RANK")
	                     );
	         }
	         
	         rs.close();
	         st.close();
	         con.close();
	         
	      } catch (ClassNotFoundException e) {
	         // TODO Auto-generated catch block
	         e.printStackTrace();
	      } catch (SQLException e) {
	         // TODO Auto-generated catch block
	         e.printStackTrace();
	      }
		return wishlist;
	}

	@Override
	public int update(WishList wishList) {
		String sql = "UPDATE WISH_LIST SET STATUS=?";
		int result = 0;
		
		 try {
	         Class.forName("oracle.jdbc.driver.OracleDriver");
	         
	         String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			 Connection con = DriverManager.getConnection(url, "c##bajahoi", "147258369");
	         PreparedStatement st = con.prepareStatement(sql);
	       
	         st.setString(1, wishList.getStatus());
	         
	         result = st.executeUpdate();
	         
	         st.close();
	         con.close();
	         
	      } catch (ClassNotFoundException e) {
	         // TODO Auto-generated catch block
	         e.printStackTrace();
	      } catch (SQLException e) {
	         // TODO Auto-generated catch block
	         e.printStackTrace();
	      }
	      
		return result;
	}

	@Override
	public int getCount(String id) {
		String sql = "SELECT COUNT(MEMBER_ID) COUNT FROM WISH_LIST WHERE MEMBER_ID=?";
		int count=0;
	      try {
		         Class.forName("oracle.jdbc.driver.OracleDriver");
	         
	         String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			 Connection con = DriverManager.getConnection(url, "c##bajahoi", "147258369");
	        PreparedStatement st = con.prepareStatement(sql);
	        
	         st.setString(1, id);
	        
	        ResultSet rs = st.executeQuery();
	         
	         if(rs.next())
	        	 count = rs.getInt("COUNT");
	         
	         rs.close();
	         st.close();
	         con.close();
	         
	      } catch (ClassNotFoundException e) {
	         // TODO Auto-generated catch block
	         e.printStackTrace();
	      } catch (SQLException e) {
	         // TODO Auto-generated catch block
	         e.printStackTrace();
	      }
	      
		return count;
	}

	@Override
	public int delete(String mid, String pid) {
		String sql = "DELETE WISH_LIST WHERE MEMBER_ID=? AND PRODUCT_ID=?";
		int result = 0;
		
		 try {
	        Class.forName("oracle.jdbc.driver.OracleDriver");
	        
	        String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			 Connection con = DriverManager.getConnection(url, "c##bajahoi", "147258369");
	        PreparedStatement st = con.prepareStatement(sql);
	      
	        st.setString(1, mid);
	        st.setString(2, pid);
	        
	        result = st.executeUpdate();
	        
	        st.close();
	        con.close();
	        
	     } catch (ClassNotFoundException e) {
	        e.printStackTrace();
	     } catch (SQLException e) {
	        e.printStackTrace();
	     }
	     
		return result;
	}
}



