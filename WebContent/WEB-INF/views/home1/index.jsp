<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<c:set var="ctx" value="${pageContext.request.servletContext.contextPath }" />

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<link href="${ctx }/css/index.css" rel="stylesheet"/>

</head>
<body>
<div class="topmenu">
	<div class="topmenu-img dropdown">
	  <img src="${ctx }/images/menu-button.png" onclick="myFunction()" class="dropbtn">
	  <div id="myDropdown" class="dropdown-content">
	    <a href="${ctx }/member/info/login">로그인</a>
	    <a href="${ctx }/member/info/join">회원가입</a>
	    <a href="${ctx }/home1/index">홈</a>
	    <a href="${ctx }/Category/home/AllCategory">카테고리</a>    
	  </div>
	</div>	
	<!-- <a href=""><img class="topmenu-img" src="../images/menu-button.png"/></a> -->
	<h1 class="title">BAJAHHOI</h1>
	<a href=""><img class="topmenu-img" src="${ctx }/images/like.png"/></a>
	<!-- <a href=""><img class="topmenu-img" src="../images/search.png"/></a> -->
	<!-- <a href="http://localhost/Bajahoi2/home/index"><img class="topmenu-logo" src="../images/logo-head.png"/></a> -->		
</div>

<!-- -----------------헤더------------------------------------- -->
<div id="search">
<form>		
	<input id="search-bar" type="search" placeholder="검색창" size="26px">
	
	<input class="btn btn-search" type="submit" value="검색"/>	
</form>
</div>
<!-- -----------------main 1-검색바------------------------------------- -->
<div id="adv">
	<img class="adv-img" src="${ctx }/images/adv.jpg"/>
	<form>
		<a href="/Category/Subcategory/1"><input class="btn btn-adv" type="button" value="리빙&인테리어" ></a>		
	</form>	
</div>

<!-- -----------------main 2-광고박스------------------------------------- -->
<div id="category">
	
	<nav class="category-nav">
		<ul>	
			<li>
			<a href="${ctx }/Category/Subcategory/1"><img src="../images/living.png" class="category-img"></a></li>
			<li><a href="${ctx }/Category/Subcategory/1" class="category-btn" style="font-size:9.5px">리빙&인테리어</a></li>
		</ul>
		<ul>	
			<li>
			<a href="${ctx }/Category/Subcategory/2"><img src="../images/food.png" class="category-img"></a></li>
			<li><a href="${ctx }/Category/Subcategory/2" class="category-btn">음식</a></li>
		</ul>
		<ul>	
			<li>
			<a href="${ctx }/Category/Subcategory/3"><img src="../images/fashion.png" class="category-img"></a></li>
			<li><a href="${ctx }/Category/Subcategory/3" class="category-btn">패션&뷰티</a></li>
		</ul>	
		<ul>	
			<li>
			<a href="${ctx }/Category/Subcategory/4"><img src="../images/kids.png" class="category-img"></a></li>
			<li><a href="${ctx }/Category/Subcategory/4" class="category-btn">육아&아동</a></li>
		</ul>					
	</nav>
	
	<nav class="category-nav">
		<ul>	
			<li>
			<a href="${ctx }/Category/Subcategory/5"><img src="../images/pet.png" class="category-img"></a></li>
			<li><a href="${ctx }/Category/Subcategory/5" class="category-btn">반려동물</a></li>
		</ul>
		<ul>	
			<li>
			<a href="${ctx }/Category/Subcategory/6"><img src="../images/handcraft.png" class="category-img"></a></li>
			<li><a href="${ctx }/Category/Subcategory/6" class="category-btn">아트&공예</a></li>
		</ul>	
		<ul>	
			<li>
			<a href="${ctx }/Category/Subcategory/7"><img src="../images/etc.png" class="category-img"></a></li>
			<li><a href="${ctx }/Category/Subcategory/7" class="category-btn">기타</a></li>
		</ul>	
		<ul>	
			<li>
			<a href="#"><img src="../images/community.png" style="height:60px" class="category-img"></a></li>
			<li><a href="#" class="category-btn">커뮤니티</a></li>
		</ul>	
	</nav>
</div>
<!-- -----------------main 3-카테고리------------------------------------- -->

<div id="lately">	
	<h1>최근 본 상품</h1>
	<nav class="lately-nav">
		<ul>	
			<li>
			<a href="Category/productInfo/infoList.jsp?id=${list[22].id}">
			<img src="${ctx }/images/category.png" class="lately-img"></a></li>
			<li><p class="lately-txt">${list[22].name}<br>
			<img src="${ctx }/images/south-korean-won.png">${list[22].price}<br>
			<img src="${ctx }/images/favorite.png"></p></li>			
		</ul>
		<ul>
		<li>
			<li>
			<a href="#">
			<img src="${ctx }/images/special1.jpg" class="lately-img"></a></li>
			<li><p class="lately-txt">${list[0].name}<br>
			<img src="${ctx }/images/south-korean-won.png">${list[0].price}<br>
			<img src="${ctx }/images/favorite.png"></p></li>
		</ul>
		<ul>	
			<li>
			<a href="#">
			<img src="../images/special2.jpg" class="lately-img"></a></li>
			<li><p class="lately-txt">${list[1].name}<br>
			<img src="../images/south-korean-won.png">${list[1].price}<br>
			<img src="../images/favorite.png"></p></li>
		</ul>	
		<ul>	
			<li>
			<a href="#">
			<img src="../images/special3.gif" class="lately-img"></a></li>
			<li><p class="lately-txt">${list[2].name}<br>
			<img src="../images/south-korean-won.png">${list[2].price}<br>
			<img src="../images/favorite.png"></p></li>
		</ul>		
	</nav>	
</div>
<!-- -----------------main 3-스페셜 상품------------------------------------- -->
<div id="special">	
	<h1>스페셜 상품</h1>
	
	<nav class="special-nav">
		<a href=""><img class="special-img" src="${ctx }/images/special1.jpg"/></a>
		<div>		
			<p>${list[0].name}</p>
			<img class="special-others" src="${ctx }/images/favorite.png">(12)<br>
			<img class="special-others" src="${ctx }/images/south-korean-won.png">${list[0].price}
			<img class="special-likeimg" src="${ctx }/images/like.png">
		</div>
	</nav>
	
	<nav class="special-nav">
		<a href=""><img class="special-img" src="${ctx }/images/special2.jpg"/></a>
		<div>		
			<p>${list[1].name}</p>
			<img class="special-others" src="${ctx }/images/favorite.png">(11)<br>
			<img class="special-others" src="${ctx }/images/south-korean-won.png">${list[1].price}
			<img class="special-likeimg" src="${ctx }/images/like.png">
		</div>
	</nav>
	
	<nav class="special-nav">
		<a href=""><img class="special-img" src="${ctx }/images/special3.gif"/></a>
		<div>		
			<p>${list[2].name}</p>
			<img class="special-others" src="${ctx }/images/favorite.png">(20)<br>
			<img class="special-others" src="${ctx }/images/south-korean-won.png">${list[2].price}
			<img class="special-likeimg" src="${ctx }/images/like.png">
		</div>
	</nav>
</div>

<footer>
<div id="footer">
	<nav id="footer-menu">
		<ul>
			<li><a href="" class="footer-link">바자회팀</a></li>
			<li class="footer-linkBar">|</li>
			<li><a href="" class="footer-link">이용약관</a></li>
			<li class="footer-linkBar">|</li>
			<li><a href="" class="footer-link">FAQ</a></li>
			<li class="footer-linkBar">|</li>
			<li><a href="" class="footer-link">개인정보취급</a></li>
		</ul>
	</nav>
	<div>	
	<p>
	고객센터 : 10:00~18:00(토요일 및 공휴일 휴무)<br>
	전화번호 / 이메일 / 주소 bajah@google.com/1577-080</p>
	</div>	
</div>
</footer>
</body>
</html>

<script>
/* When the user clicks on the button, 
toggle between hiding and showing the dropdown content */
function myFunction() {
    document.getElementById("myDropdown").classList.toggle("show");
}

// Close the dropdown menu if the user clicks outside of it
window.onclick = function(event) {
  if (!event.target.matches('.dropbtn')) {

    var dropdowns = document.getElementsByClassName("dropdown-content");
    var i;
    for (i = 0; i < dropdowns.length; i++) {
      var openDropdown = dropdowns[i];
      if (openDropdown.classList.contains('show')) {
        openDropdown.classList.remove('show');
      }
    }
  }
}
</script>