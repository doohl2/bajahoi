package com.bajahoi.jspweb.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.bajahoi.jspweb.dao.ProductDao;
import com.bajahoi.jspweb.entity.Product;
import com.bajahoi.jspweb.entity.ProductView;

public class JdbcProductDao implements ProductDao {
   
	
@Override
public List<ProductView> getList(String regCMemberId) {
	String sql = "SELECT * FROM PRODUCT_VIEW WHERE CID=?";
	List<ProductView> list = new ArrayList<>();
	
	// 드라이버 로드
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
		Connection con = DriverManager.getConnection(url, "c##bajahoi", "147258369");
		PreparedStatement st = con.prepareStatement(sql);
		
		st.setString(1, regCMemberId);
		
		ResultSet rs = st.executeQuery();
		
		while(rs.next()) { 
			Product productview = new ProductView(
					rs.getString("ID"),
					rs.getString("NAME"),
					rs.getInt("PRICE"),
					rs.getDate("REG_DATE"),
					rs.getString("RSNNAME"),
					rs.getString("PINAME"),
					rs.getString("PIENAME")
					);
			
			
			list.add((ProductView) productview);
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
public ProductView get2(String id) {
	String sql = "SELECT * FROM PRODUCT_VIEW WHERE ID=?";
	ProductView product = null;
	   
    // 드라이버 로드
    try {
       Class.forName("oracle.jdbc.driver.OracleDriver");
       
       String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
       Connection con = DriverManager.getConnection(url, "c##bajahoi", "147258369");
       PreparedStatement st = con.prepareStatement(sql);

       st.setString(1,id);
       
       ResultSet rs = st.executeQuery();
           
       
       if(rs.next()) { 
    	   product = new ProductView(
    			rs.getString("ID"),
    			rs.getString("NAME"),
				rs.getInt("PRICE"),
				rs.getDate("REG_DATE"),
				rs.getString("RSNNAME"),
				rs.getString("PINAME"),
				rs.getString("PIENAME")
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
	return product;
}

@Override
public int insert(Product product) {
	String sql = "INSERT INTO product (ID,NAME,PRICE,CONTENT,CATEGORY_NAME) VALUES ("
			+ "VALUES((SELECT NVL(MAX(TO_NUMBER(ID),0)+1,?,?,?,?)";
	int result = 0;
	
	 try {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        
        String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
		 Connection con = DriverManager.getConnection(url, "c##bajahoi", "147258369");
        PreparedStatement st = con.prepareStatement(sql);
      
        st.setString(1, product.getName());
        st.setInt(2, product.getPrice());
        st.setString(3, product.getContent());
        st.setString(4, product.getCategoryName());
        
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
public int update(Product product) {
	String sql = "INSERT INTO PRODUCT (NAME,PRICE,CONTENT,CATEGORY_NAME,REG_STATUS_NAME) VALUES (?,?,?,?,?)";
	int result = 0;
	
	 try {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        
        String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
		 Connection con = DriverManager.getConnection(url, "c##bajahoi", "147258369");
        PreparedStatement st = con.prepareStatement(sql);
      
        st.setString(1, product.getName());
        st.setInt(2, product.getPrice());
        st.setString(3, product.getContent());
        st.setString(4, product.getCategoryName());
        st.setString(5, product.getRegStatusName());
        
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
public int delete(String id) {
	String sql = "DELETE PRODUCT WHERE ID=?";

	int result = 0;
	
	 try {
	        Class.forName("oracle.jdbc.driver.OracleDriver");
	        
	        String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			 Connection con = DriverManager.getConnection(url, "c##bajahoi", "147258369");
	        PreparedStatement st = con.prepareStatement(sql);
	      
	        st.setString(1, id);
	        
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
public Product get(String id) {
	String sql = "SELECT * FROM PRODUCT WHERE ID=?";
    Product product = null;
    try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
        Connection con = DriverManager.getConnection(url, "c##bajahoi", "147258369");
        PreparedStatement st = con.prepareStatement(sql);//����ǥ�� �� ���̸� �������� �����ո�Ʈ�� ����ؾ� �Ѵ�.
        st.setString(1, id);//�ڷ����� ���� �ԷµǴ� ���°� �޶���
        
        ResultSet rs = st.executeQuery(); //()�� sql�� ������ �ȵȴ�.
       
        if(rs.next()) {
        	
        	product = new Product(
        			rs.getString("ID"),
			        rs.getString("NAME"),
			        rs.getString("CONTENT"),
			        rs.getInt("PRICE"),
			        rs.getDate("DELIVERY_EXPEC_DATE"),
			        rs.getString("DELIVERY_RECEIVER"),
			        rs.getString("DELIVERY_SENDER"),
			        rs.getString("REG_C_MEMBER_ID"),
			        rs.getString("REG_STATUS_NAME"),
			        rs.getString("CATEGORY_NAME"),
			        rs.getDate("REG_DATE"),
			        rs.getString("OPTION_NAME"),
			        rs.getString("AS"),
			        rs.getString("OPTION_PRICE"),
			        rs.getString("WORKING_PERIOD")
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
	return product;
}

}