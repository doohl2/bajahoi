package com.bajahoi.jspweb.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.bajahoi.jspweb.dao.MemberDao;
import com.bajahoi.jspweb.entity.Member;

public class JdbcMemberDao implements MemberDao{

	@Override
	public List<Member> getList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Member get(String id) {
		String sql = "SELECT * FROM MEMBER WHERE ID=?";
		Member member = null;
		   
	    // 드라이버 로드
	    try {
	       Class.forName("oracle.jdbc.driver.OracleDriver");
	       
	       String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
	       Connection con = DriverManager.getConnection(url, "c##bajahoi", "147258369");
	       PreparedStatement st = con.prepareStatement(sql);

	       st.setString(1,id);
	       
	       ResultSet rs = st.executeQuery();
	           
	       
	       if(rs.next()) { 
	    	   member = new Member(
	    			rs.getString("ID"),
	    			rs.getString("PASSWORD"),
	    			rs.getString("NAME"),
	    			rs.getString("NICKNAME"),
	    			rs.getString("EMAIL"),
	    			rs.getString("PHONE"),
	    			rs.getString("PROFILE"),
	    			rs.getString("ADDRESS"),
					rs.getDate("REG_DATE"),
					rs.getString("MEMBER_TYPE_NAME"),
					rs.getString("MEMBER_RANK_NAME")
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
		return member;
	}

	@Override
	public int insert(Member member) {
		String sql = "INSERT INTO MEMBER (PASSWORD,NAME,NICKNAME,EMAIL,PHONE,PROFILE,ADDRESS,MEMBER_TYPE_NAME,ID) VALUES (?,?,?,?,?,?,?,?,?)";
		int result = 0;
		
		 try {
	        Class.forName("oracle.jdbc.driver.OracleDriver");
	        
	        String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			 Connection con = DriverManager.getConnection(url, "c##bajahoi", "147258369");
	        PreparedStatement st = con.prepareStatement(sql);
	      
	        st.setString(1, member.getPassword());
	        st.setString(2, member.getName());
	        st.setString(3, member.getNickname());
	        st.setString(4, member.getEmail1()+"@"+member.getEmail2());
	        st.setString(5, member.getPhone());
	        st.setString(6, member.getProfile());
	        st.setString(7, member.getPostcode()+" "+member.getAddress1()+" "+member.getAddress2());
	        st.setString(8, member.getMemberType1());
	        st.setString(9, member.getId());

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
	public int update(Member member) {
		String sql = "UPDATE MEMBER SET PASSWORD=?,NICKNAME=?,EMAIL=?,PHONE=?,PROFILE=?,ADDRESS=?,MEMBER_TYPE_NAME=? WHERE ID=?";
		int result = 0;
		
		 try {
	        Class.forName("oracle.jdbc.driver.OracleDriver");
	        
	        String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			 Connection con = DriverManager.getConnection(url, "c##bajahoi", "147258369");
	        PreparedStatement st = con.prepareStatement(sql);
	      
	        st.setString(1, member.getPassword());
	        st.setString(2, member.getNickname());
	        st.setString(3, member.getEmail1()+"@"+member.getEmail2());
	        st.setString(4, member.getPhone());
	        st.setString(5, member.getProfile());
	        st.setString(6, member.getPostcode()+" "+member.getAddress1()+" "+member.getAddress2());
	        st.setString(7, member.getMemberType1());
	        st.setString(8, member.getId());
	        
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
	public int delete(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

}
