package com.bajahoi.jspweb.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.bajahoi.jspweb.dao.ProductReqDao;
import com.bajahoi.jspweb.entity.ProductReq;

public class JdbcProductReqDao implements ProductReqDao {

	@Override
	public List<ProductReq> getList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProductReq get(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(ProductReq productReq) {
		String sql = "INSERT INTO PRODUCT_REQ(MEMBER_ID,PRODUCT_ID,TITLE_NAME,CONTENT,\"DATE\") VALUES(?,?,?,?,SYSDATE)";
		int result = 0;
		
		 try {
			 Class.forName("oracle.jdbc.driver.OracleDriver");
		        
		        String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
				 Connection con = DriverManager.getConnection(url, "c##bajahoi", "147258369");
		        PreparedStatement st = con.prepareStatement(sql);
	      
	        st.setString(1, productReq.getMemberId());
	        st.setString(2, productReq.getProductId());
	        st.setString(3, productReq.getTitleName());
	        st.setString(4, productReq.getContent());
	        
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

	@Override
	public int update(ProductReq productReq) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(String id) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
