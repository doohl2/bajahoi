<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <c:set var="ctx" value="${pageContext.request.contextPath }"/>
	<header>
			<!-- -----navigation-------- -->
			<nav class="navbar bg-dark fixed-top">
				<h1 class="hidden">헤더</h1>
				<div class="container">
					<a class="navbar-brand" href="${ctx}/member/info/setting?id=${id}">BAJAHOI</a>
       			 
       			 <div>
       			 	<h2 class="hidden">검색</h2>
	       			 <button class="navbar-toggler" type="button">
	        	 		<span> <img src="${ctx}/images/search.png"> </span>
	       			 </button>
	       			 
	       			 <h2 class="hidden">찜</h2>
	       			 <button class="navbar-toggler" type="button">
	        	 		<span> <img src="${ctx}/images/like.png" alt="찜"> </span>
	       			 </button>
	       			 <h2 class="hidden">메뉴</h2>
	       			 <c:if test="${empty sessionScope.id }">
					 <button class="navbar-toggler margin-right" type="button">
	        	 		<span> <img src="${ctx}/images/menu.png">로그인 </span>
	       			 </button>
	       			 </c:if>
	       			 <c:if test="${not empty sessionScope.id }">

						 <button class="navbar-toggler margin-right" type="button">
	        	 		<span> <img src="${ctx}/images/menu.png">로그아웃 </span>
	       			 </button>
			
					</c:if>
	       			 
       			 </div>
        		</div>
			</nav>
		</header>