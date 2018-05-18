<%@page import="com.bajahoi.jspweb.entity.Member"%>
<%@page import="com.bajahoi.jspweb.dao.MemberDao"%>
<%@page import="com.bajahoi.jspweb.jdbc.JdbcMemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<%@taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<meta name="viewport" content="width=device-width, initial-scale=1, minimum-scale=1 ,user-scalable=1">
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="${ctx}/css/styledh.css" type="text/css" rel="stylesheet" />
</head>
<body>
	<!-- --------------------------header--------------------------- -->
		
<tiles:insertAttribute name="header" /> 
			
		  <!-- Page Content -->
		
<tiles:insertAttribute name="main" />
         
		   <!-- Footer -->

<tiles:insertAttribute name="footer" />

</body>
</html>