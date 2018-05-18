package com.bajahoi.jspweb.dao;

import java.util.List;

import com.bajahoi.jspweb.entity.MemberRank;

public interface MemberRankDao {
	
	 List<MemberRank> getList();
	 
	 MemberRank get(String id);	
	 
	 int insert(MemberRank memberRank);
	 int update(MemberRank memberRank);
	 int delete(String id);
}
