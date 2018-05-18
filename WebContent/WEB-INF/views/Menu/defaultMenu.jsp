<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<c:set var="ctx" value="${pageContext.request.servletContext.contextPath }" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>기본메뉴</title>
<link href="${ctx}/css/style00.css" type="text/css" rel="stylesheet"/> 
</head>
<body>

<section class="menu default-menu">
	<div class="margin-15">
		<div class="border1p">
		<a href="${ctx}/member/info/login" class="pad-left10">로그인</a>
		<img src="${ctx}/img/icon/move1.png">
		</div>
		<div class="border1p">
		<a href="${ctx}//member/info/join" class="pad-left10">회원가입</a>
		<img src="${ctx}/img/icon/move1.png">
		</div>
	</div>
	<div class="margin-15">
		<div class="border1p">
		<a href="${ctx}/Category/home/AllCategory" class="pad-left10">카테고리</a>
		<img src="${ctx}/img/icon/move1.png">
		</div>
		<div class="border1p">
		<a href="" class="pad-left10">판매시작하기</a>
		<img src="${ctx}/img/icon/move1.png">
		</div>
		<div class="border1p">
		<a href="${ctx}/home/index" class="pad-left10">나가기</a>
		<img src="${ctx}/img/icon/move1.png">
		</div>
	</div>
	<div class="mobilewebpadding">
	
	</div>
</section>


</body>
</html>