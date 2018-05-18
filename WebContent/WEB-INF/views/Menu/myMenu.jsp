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

<section class="my-menu-header">
	<div class="profile-img">
		<img src="${ctx}/img/profile.jpg" alt=프로필이미지>
	</div>
	<div class="profile">
		<div class="name">
		<span>${id}</span>
		</div>
		<div class="img">
			<img src="${ctx}/img/icon/star1.png" alt=별점>
			<img src="${ctx}/img/icon/star1.png" alt=별점>
			<img src="${ctx}/img/icon/star1.png" alt=별점>
			<img src="${ctx}/img/icon/halfstar.png" alt=별점>
		</div>
		</div>
	</section>
	
<section class="menu my-menu padding-top-0">
	<div class="margin-15 margin-top-0">
	<a class="pad-left10">구매</a>
		<div class="border1p">
		<a href="${ctx}/member/purchase/home/wishlist" class="pad-left10">찜목록</a>
		<img src="${ctx}/img/icon/move1.png">
		</div>
		<div onclick="location.href='${ctx}/Category/home/AllCategory'" class="border1p">
		<a class="pad-left10">카테고리</a>
		<img src="${ctx}/img/icon/move1.png">
		</div>
	
	</div>
	
	<div class="margin-15">
	<a class="pad-left10">판매</a>	
		<div class="border1p">
		<a href="" class="pad-left10">판매시작하기</a>
		<img src="${ctx}/img/icon/move1.png">
		</div>
		<div class="border1p">
		<a href="${ctx}/member/sale/myservice" class="pad-left10">나의서비스</a>
		<img src="${ctx}/img/icon/move1.png">
		</div>
	</div>
	
	<div class="margin-15">
	<a class="pad-left10">전체</a>
		<div class="border1p">
		<a href="${ctx}/member/logout" class="pad-left10">로그아웃</a>
		<img src="${ctx}/img/icon/move1.png">
		</div>
	
	</div>
</section>

</body>
</html>