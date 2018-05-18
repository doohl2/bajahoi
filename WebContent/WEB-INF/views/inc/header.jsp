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
	        	 		<span> <img src="${ctx}/images/search.png" id="img-search"> </span>
	       			 </button>
	       			 
	       			 <h2 class="hidden">찜</h2>
	       			 <a href="${ctx}/member/purchase/wishlist">
	       			 <button class="navbar-toggler" type="button">
	        	 		<span> <img src="${ctx}/images/like.png" alt="찜"> </span>
	       			 </button>
	       			 </a>
	       			 <h2 class="hidden">메뉴</h2>
	       			 
	       			 <c:if test="${empty sessionScope.id }">
	       			 <a href="${ctx}/Menu/defaultMenu">
					 <button class="navbar-toggler margin-right" type="button">
	        	 		<span> <img src="${ctx}/images/menu.png"> </span>
	       			 </button>
	       			 </a>
	       			 </c:if>
	       			 <c:if test="${not empty sessionScope.id }">
						<a href="${ctx}/Menu/myMenu">
						 <button class="navbar-toggler margin-right" type="button">
	        	 		<span> <img src="${ctx}/images/menu.png"> </span>
	       			 </button>
	       			 </a>
			
					</c:if>
       			 </div>
        		</div>
			</nav>
		</header>
		
		<script>

			window.addEventListener("load", function(){
			
				var searchBox = document.querySelector("#text-search");
				var searchImg = document.querySelector("#img-search");
				//searchBox.setAttribute("class","hidden");
				searchBox.style.visibility = "hidden";
				var count = 0;
				searchImg.onclick = function(){
					count++;
			
					if(count % 2 == 1)
					{
						//searchBox.setAttribute("class","");
						searchBox.style.visibility = "visible";
						searchBox.style.transform = "translate(-8px,-5px)";
					}
					else
					{
						//searchBox.setAttribute("class","hidden");
						searchBox.style.visibility = "hidden";
					}
				};
			
			
			
			});
	
</script>