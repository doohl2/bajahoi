package com.bajahoi.jspweb.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bajahoi.jspweb.dao.BOARD_CommentDao;
import com.bajahoi.jspweb.entity.BOARD_Comment;
import com.bajahoi.jspweb.entity.Board;

public class jdbcBOARDCommentDao implements BOARD_CommentDao {

	@Override
	public int insert(BOARD_Comment comment) {
		String sql = "INSERT INTO BOARD_COMMENT(ID"
				+ ",BOARD_ID"
				+ ",CONTENT"
				+ ",MEMBER_ID)"
				+ "VALUES((SELECT NVL(MAX(TO_NUMBER(ID)),0)+1 ID FROM BOARD_COMMENT),?,?,?)";
		 
		 int result = 0;
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				
				String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
				Connection con = DriverManager.getConnection(url, "c##bajahoi","147258369");
				PreparedStatement st = con.prepareStatement(sql);
				
				//st.setString(1, answeris.getId());
				st.setString(1, comment.getBoardId());
				st.setString(2, comment.getContent());
				st.setString(3, comment.getMemberId());
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
	public int update(BOARD_Comment comment) {
		String sql = "UPDATE BOARD_COMMENT SET HIT =(?)+1 WHERE ID = ?";
		 
		
		 int result = 0;
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				
				String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
				Connection con = DriverManager.getConnection(url, "c##bajahoi","147258369");
				PreparedStatement st = con.prepareStatement(sql);
				
				st.setString(1, comment.getBoardId());
				st.setString(2, comment.getContent());
				
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
		String sql = "DELETE FROM BOARD_COMMENT WHERE ID=?";
		 
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
	public List<BOARD_Comment> getList(String boardId) {

		/*String sql = "SELECT * FROM BOARD WHERE CATEGORYID = 01 AND ID BETWEEN ? AND ? ORDER BY REG_DATE DESC";*/
				//+ "WHERE NUM BETWEEN ? AND ?";
		String sql = "SELECT * FROM BOARD_COMMENT WHERE BOARD_ID=?";
		List<BOARD_Comment> list = new ArrayList<>();
		   
	      // ����̹� �ε�
	      try {
	         Class.forName("oracle.jdbc.driver.OracleDriver");
	         
	         String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
	         Connection con = DriverManager.getConnection(url, "c##bajahoi","147258369");
	         PreparedStatement st = con.prepareStatement(sql);
	         
	         st.setString(1, boardId);
	         ResultSet rs = st.executeQuery();     
	           
	         BOARD_Comment comment = null;
	         
	         while(rs.next()) { 
	        	 
	        	 comment = new BOARD_Comment(
	        			 rs.getString("MEMBER_ID"),
	        			 rs.getString("BOARD_ID"),
	        			 rs.getString("CONTENT"),
	        			 rs.getDate("COMMENT_DATE"),
		            	 rs.getString("ID")
	                  );      
		            
	            list.add(comment);
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
	public BOARD_Comment get(String id) {
		String sql = "SELECT * FROM BOARD_COMMENT WHERE BOARD_ID=?";
	      
		BOARD_Comment comment = null;
	      
	      // ����̹� �ε�
	      try {
	         Class.forName("oracle.jdbc.driver.OracleDriver");
	         
	         String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
	         Connection con = DriverManager.getConnection(url, "c##bajahoi","147258369");
	         PreparedStatement st = con.prepareStatement(sql);
	         st.setString(1, id);
	         
	         ResultSet rs = st.executeQuery();
	         
	         
	         if(rs.next()) {
	        	 comment = new BOARD_Comment(
	        			 rs.getString("MEMBER_ID"),
	        			 rs.getString("BOARD_ID"),
	        			 rs.getString("CONTENT"),
	        			 rs.getDate("COMMENT_DATE"),
		            	 rs.getString("ID")
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
	      
	      return comment;
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
