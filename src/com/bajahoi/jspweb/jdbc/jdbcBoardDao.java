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

import com.bajahoi.jspweb.dao.BoardDao;
import com.bajahoi.jspweb.entity.Board;
import com.bajahoi.jspweb.entity.BoardView;

public class jdbcBoardDao implements BoardDao {
	
	@Override
	public int insert(Board board) {
		String sql = "INSERT INTO BOARD(id"
				+ ",title"
				+ ",content"
				+ ",categoryid"
				+ ",reg_member_id "
				+ ",att)"
				+ "VALUES((SELECT NVL(MAX(TO_NUMBER(ID)),0)+1 ID FROM BOARD),?,?,?,?,?)";
		 
		 int result = 0;
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				
				String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
				Connection con = DriverManager.getConnection(url, "c##bajahoi","147258369");
				PreparedStatement st = con.prepareStatement(sql);
				
				//st.setString(1, answeris.getId());
				st.setString(1, board.getTitle());
				st.setString(2, board.getContent());
				st.setString(3, board.getCategoryId());
				st.setString(4, board.getRegMemberId());
				st.setString(5, board.getAtt());
				//insert������ resultset �ʿ����
		
				result = st.executeUpdate();
				//con.commit();
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
	public int notattinsert(Board board) {
		String sql = "INSERT INTO BOARD(id"
				+ ",title"
				+ ",content"
				+ ",categoryid"
				+ ",reg_member_id)"
				+ "VALUES((SELECT NVL(MAX(TO_NUMBER(ID)),0)+1 ID FROM BOARD),?,?,?,?)";
		 
		 int result = 0;
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				
				String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
				Connection con = DriverManager.getConnection(url, "c##bajahoi","147258369");
				PreparedStatement st = con.prepareStatement(sql);
				
				//st.setString(1, answeris.getId());
				st.setString(1, board.getTitle());
				st.setString(2, board.getContent());
				st.setString(3, board.getCategoryId());
				st.setString(4, board.getRegMemberId());
				//insert������ resultset �ʿ����
		
				result = st.executeUpdate();
				//con.commit();
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
	public int update(Board board) {
		/*String sql = "UPDATE BOARD SET TITLE =?," + 
				"    content =? + ";*/
		String sql = "UPDATE BOARD SET HIT =(?)+1 WHERE ID = ?";
		 
	
		 int result = 0;
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				
				String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
				Connection con = DriverManager.getConnection(url, "c##bajahoi","147258369");
				PreparedStatement st = con.prepareStatement(sql);
				
				st.setInt(1, board.getHit());
				st.setString(2, board.getId());
				
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
	public int update_hit(Board board) {
		
		String sql = "UPDATE BOARD SET HIT =(?)+1 WHERE ID = ?";
		 
	
		 int result = 0;
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				
				String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
				Connection con = DriverManager.getConnection(url, "c##bajahoi","147258369");
				PreparedStatement st = con.prepareStatement(sql);
				
				st.setInt(1, board.getHit());
				st.setString(2, board.getId());
				
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
	public int update_recomm(Board board) {
		/*String sql = "UPDATE BOARD SET TITLE =?," + 
				"    content =? + ";*/
		String sql = "UPDATE BOARD SET RECOMMEND =(?)+1 WHERE ID = ?";
		
	
		 int result = 0;
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				
				String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
				Connection con = DriverManager.getConnection(url, "c##bajahoi","147258369");
				PreparedStatement st = con.prepareStatement(sql);
				
				st.setInt(1, board.getRecommend());
				st.setString(2, board.getId());
				
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
	public int delete(String id) {
		String sql = "DELETE FROM BOARD WHERE ID=?";
		 
		 int result = 0;
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				
				String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
				Connection con = DriverManager.getConnection(url, "c##bajahoi","147258369");
				PreparedStatement st = con.prepareStatement(sql);
				
				st.setString(1, id);
				
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
	public List<Board> getList(int page,String categortId) {
		int start = 1+(page-1)*10;
		int end = page*10;
		
		/*String sql = "SELECT * FROM BOARD WHERE CATEGORYID = 01 AND ID BETWEEN ? AND ? ORDER BY REG_DATE DESC";*/
				//+ "WHERE NUM BETWEEN ? AND ?";
		String sql = "select * from(select ROW_NUMBER() OVER(ORDER BY REG_DATE DESC)NUM,BOARD.* from BOARD where CATEGORYID = ?) where NUM BETWEEN ? AND ?";
		List<Board> list = new ArrayList<>();
		   
	      // ����̹� �ε�
	      try {
	         Class.forName("oracle.jdbc.driver.OracleDriver");
	         
	         String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
	         Connection con = DriverManager.getConnection(url, "c##bajahoi","147258369");
	         PreparedStatement st = con.prepareStatement(sql);
	         st.setString(1, categortId);
	         st.setInt(2, start);
	         st.setInt(3, end);
	         ResultSet rs = st.executeQuery();     
	           
	         Board board = null;
	         
	         while(rs.next()) { 
	        	 
	        	 board = new Board(
			            		rs.getString("ID"),
			            		rs.getString("TITLE"),
			            		rs.getString("CONTENT"),
			            		rs.getInt("HIT"),
			            		rs.getDate("REG_DATE"),
			            		rs.getString("CATEGORYID"),
			            		rs.getString("REG_MEMBER_ID"),
			            		rs.getInt("RECOMMEND")
	                     );
		            
	            list.add(board);
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
	
	public List<Board> bestgetList(int page,String categortId) {
		int start = 1+(page-1)*10;
		int end = page*10;
		
		/*String sql = "SELECT * FROM BOARD WHERE CATEGORYID = 01 AND ID BETWEEN ? AND ? ORDER BY REG_DATE DESC";*/
				//+ "WHERE NUM BETWEEN ? AND ?";
		String sql = "select * from(select ROW_NUMBER() OVER(ORDER BY REG_DATE DESC)NUM,BOARD.* from BOARD where RECOMMEND >= 10) where NUM BETWEEN ? AND ?";
		List<Board> list = new ArrayList<>();
		   
	      // ����̹� �ε�
	      try {
	         Class.forName("oracle.jdbc.driver.OracleDriver");
	         
	         String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
	         Connection con = DriverManager.getConnection(url, "c##bajahoi","147258369");
	         PreparedStatement st = con.prepareStatement(sql);
	         
	         st.setInt(1, start);
	         st.setInt(2, end);
	         ResultSet rs = st.executeQuery();     
	           
	         Board board = null;
	         
	         while(rs.next()) { 
	        	 
	        	 board = new Board(
			            		rs.getString("ID"),
			            		rs.getString("TITLE"),
			            		rs.getString("CONTENT"),
			            		rs.getInt("HIT"),
			            		rs.getDate("REG_DATE"),
			            		rs.getString("CATEGORYID"),
			            		rs.getString("REG_MEMBER_ID"),
			            		rs.getInt("RECOMMEND"),
			            		rs.getString("ATT")
	                     );
		            
	            list.add(board);
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
	public Board get(String id) {
		String sql = "SELECT * FROM BOARD WHERE CATEGORYID = 01 AND ID=?";
	      
	      Board board = null;
	      
	      // ����̹� �ε�
	      try {
	         Class.forName("oracle.jdbc.driver.OracleDriver");
	         
	         String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
	         Connection con = DriverManager.getConnection(url, "c##bajahoi","147258369");
	         PreparedStatement st = con.prepareStatement(sql);
	         st.setString(1, id);
	         
	         ResultSet rs = st.executeQuery();
	         
	         
	         if(rs.next()) {
	        	 board = new Board(
		            		rs.getString("ID"),
		            		rs.getString("TITLE"),
		            		rs.getString("CONTENT"),
		            		rs.getInt("HIT"),
		            		rs.getDate("REG_DATE"),
		            		rs.getString("CATEGORYID"),
		            		rs.getString("REG_MEMBER_ID"),
		            		rs.getInt("RECOMMEND"),
		            		rs.getString("ATT")
	                  );            
	            //System.out.printf("id : %s, name : %s\n", id, name);      
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
	      
	      return board;
	   }
	
	public int getCount(String categortId) {
	      String sql = "SELECT count(id) count FROM BOARD where CATEGORYID = ?";
	      
	      int count = 0;
	      
	      // ����̹� �ε�
	      try {
	         Class.forName("oracle.jdbc.driver.OracleDriver");
	         
	         String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
	         Connection con = DriverManager.getConnection(url, "c##bajahoi","147258369");
	         PreparedStatement st = con.prepareStatement(sql);
	         //Statement st = con.createStatement();
	         //PreparedStatement st = con.prepareStatement(sql);
	         st.setString(1, categortId);
	         ResultSet rs = st.executeQuery();         
	         
	         if(rs.next())
	            count = rs.getInt("count");         
	         
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
