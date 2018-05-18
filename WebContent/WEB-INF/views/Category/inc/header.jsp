<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<c:set var="ctx" value="${pageContext.request.servletContext.contextPath }" />
    
<header>
	<div class="header">
		<div class="header logo">
			<a href="${ctx}/home/index" ><img src="${ctx}/img/icon/logo.JPG" alt=로고></a>
		</div>
		<div class="header logoimage">
			<a href="${ctx}/home/index" >BAJAHOI</a>
		</div>
		<form action="${ctx}/Search/SearchResult" method="get">
		<div class="header search">
			<input type="text" name="search" id="text-search">
			<img src="${ctx}/img/icon/search.png" id="img-search"  />
		</div>
		</form>
		
		<div class="header wishlist">
			<a href="${ctx}/member/purchase/wishlist.jsp" ><img src="${ctx}/img/icon/like.png" alt=찜목록></a>
		</div>
		<div onclick="location.href='${ctx}/Menu/defaultMenu'"class="header menu">
		</div>
	</div>
</header>

<script>

window.addEventListener("load", function(){

	var searchBox = document.querySelector("#text-search");
	var searchImg = document.querySelector("#img-search");
	searchBox.style.visibility = "hidden";
	var count = 0;
	searchImg.onclick = function(){
		count++;

		if(count % 2 == 1)
		{
			searchBox.style.visibility = "visible";
			searchBox.style.transform = "translate(-8px)";
		}
		else
		{
			searchBox.style.visibility = "hidden";
		}
	};



});
	
</script>