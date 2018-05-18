<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="tilesHT" uri="http://tiles.apache.org/tags-tiles" %> 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<c:set var="ctx" value="${pageContext.request.servletContext.contextPath }" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>카테고리</title>
<link href="${ctx}/css/style00.css" type="text/css" rel="stylesheet"/> 
</head>
<body>
	
	
	<tilesHT:insertAttribute name="main"/>
</body>
</html>