package com.bajahoi.jspweb.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.bajahoi.jspweb.dao.OrderDao;
import com.bajahoi.jspweb.entity.Order;
import com.bajahoi.jspweb.entity.OrderView;

public class JdbcOrderDao implements OrderDao {
   
	
@Override
public List<OrderView> getList(String memberId,int page) {
	int start = 1+(page-1)*3; // 1 4 7 11
	int end = page*3; // 3 6 9 12
	String sql = "SELECT O.* FROM (SELECT ROWNUM NUM, OV.* FROM \"ORDER_VIEW\" OV WHERE MEMBER_ID=?) O WHERE NUM BETWEEN ? AND ?";
	List<OrderView> list = new ArrayList<>();
	
	// 드라이버 로드
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		 String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
	       Connection con = DriverManager.getConnection(url, "c##bajahoi", "147258369");
	       PreparedStatement st = con.prepareStatement(sql);
	       
	       st.setString(1, memberId);
		   st.setInt(2, start);
		   st.setInt(3, end);   
		   
		ResultSet rs = st.executeQuery();
		
		
		while(rs.next()) { 
			OrderView orderView = new OrderView(
					rs.getString("MEMBER_ID"),
					rs.getString("PRODUCT_ID"),
					rs.getInt("QUANTITY"),
					rs.getDate("EST_ARRIVAL_DATE"),
					rs.getInt("PAYMENT_AMOUNT"),
					rs.getString("ORDER_STATUS_NAME"),
					rs.getString("ID"),
					rs.getString("NAME"),
					rs.getString("PINAME"),
					rs.getString("PIENAME"),
					rs.getString("NICKNAME"),
					rs.getString("MEMBER_RANK_NAME")
					);
			list.add(orderView);
		}
		
		rs.close();
		st.close();
		con.close();
		
		return list;
		
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
public Order get(String memberId, String productId) {
	String sql = "SELECT * FROM \"ORDER\" WHERE MEMBER_ID=? AND PRODUCT_ID=?";
	/*Order order = null;*/
	Order order = null;
    // 드라이버 로드
   
	try {
       Class.forName("oracle.jdbc.driver.OracleDriver");
       
       String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
       Connection con = DriverManager.getConnection(url, "c##bajahoi", "147258369");
       PreparedStatement st = con.prepareStatement(sql);

       st.setString(1, memberId);
       st.setString(2, productId);
       
       ResultSet rs = st.executeQuery();
       
        if(rs.next()) 
        {
    	   order = new Order(
    			   rs.getString("MEMBER_ID"),
    			   rs.getString("PRODUCT_ID"),
    			   rs.getDate("DATE"),
    			   rs.getInt("QUANTITY"),
    			   rs.getDate("EST_ARRIVAL_DATE"),
    			   rs.getString("REVIEW_NAME"),
    			   rs.getString("REVIEW_CONTENT"),
    			   rs.getDate("REVIEW_DATE"),
    			   rs.getString("REVIEW_LIKE"),
    			   rs.getInt("PAYMENT_AMOUNT"),
    			   rs.getDate("PAYMENT_DATE"),
    			   rs.getString("PAYMENT_METHOD_NAME"),
    			   rs.getString("ORDER_STATUS_NAME"),
    			   rs.getString("ID")
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
	return order;
}

@Override
public int insert(Order order) {
	// TODO Auto-generated method stub
	return 0;
}

@Override
public int update(Order order) {
	// TODO Auto-generated method stub
	return 0;
}

@Override
public int delete(String id) {
	// TODO Auto-generated method stub
	return 0;
}

@Override
public int getCount(String id) {
	String sql = "SELECT COUNT(MEMBER_ID) COUNT FROM \"ORDER\" WHERE MEMBER_ID=?";
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



}