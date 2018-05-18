<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="../css/loginSearch.css" type="text/css" rel="stylesheet">

 </head>
 
 <body>
 
 <div class="topmenu">	
 	<a href=""><img class="topmenu-img" src="../images/menu-button.png"/></a>
 	<a href=""><img class="topmenu-img" src="../images/like.png"/></a>
 	<a href=""><img class="topmenu-img" src="../images/search.png"/></a>
 	<a href=""><img class="topmenu-logo" src="../images/logo-head.png"/></a>
 	<h1 class="title">BAJAHHOI</h1>			
 </div>
 
 <div class="form">
 	<div>
 		<h3>아이디 찾기</h3>
 		<form>
 			<input class="text-box" type="text" name="실명" placeholder="실명"/>
 		</form>
 		<form>
 			<input class="text-box" type="text" name="이메일" placeholder="이메일 주소"/>
 		</form>
 	</div>
 	<div class="form-btn">
 		<a href="/Prac/customer/loginSearch" class = "button">이메일로<br>아이디 보내기</a>
 		<a href="/Prac/customer/loginSearch" class = "button">핸대폰으로<br>아이디 보내기</a>
 	</div>	
 </div>
 
 <div class="form">
 	<div>
 		<h3>비밀번호 찾기</h3>
 		<form>
 			<input class="text-box" type="text" name="아이디" placeholder="아이디"/>
 		</form>
 		
 		<form>
 			<input class="text-box" type="text" name="이메일" placeholder="이메일 주소"/>
 		</form>
 	</div>	
 	<div class="form-btn">
 		<a href="/Prac/customer/loginSearch" class = "button">이메일로<br>비밀번호 보내기</a>
 		<a href="/Prac/customer/loginSearch" class = "button">핸대폰으로<br>비밀번호 보내기</a>
 	</div>	
 </div>
</body>
</html>

<script>
	window.addEventListener("load", function(){
		var sendByEmail = document.querySelector(".button");	
		var pageBack = document.querySelector();
		sendByEmail.onclick = function(){
			alert("입력하신 e-mail로 ID를 발송하였습니다.");
		};
		pageBack.dispatchEvent();
		
	});		
		
</script>