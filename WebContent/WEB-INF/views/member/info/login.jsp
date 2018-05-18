<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<main>
<form method="post">
	<div class="head">
		<h1>로그인</h1>
	</div>
	<div class="login-checkbox" style="float:right; padding-bottom:10px;">

			<label><input type="checkbox" name="로그인 기억하기">로그인
				기억하기</label>
	</div>

	<div class="login-input">
		<div>
			<p class="text-normal text-highlight">ID</p>
			<input class="acc-text-area" type="text" name="id"
				placeholder="이메일을 입력해주세요." style="width:21rem !important;"/>
			<c:if test="${ not empty param.error}">
				<div style="color: red;">아이디 또는 패스워드가 올바르지 않습니다.</div>
			</c:if>
		</div>
		<div style="margin-top:10px;">	
			<p class="text-normal text-highlight">Password</p>
			<input class="acc-text-area" type="password" name="password"
				placeholder="비밀번호를 입력해주세요." style="width:21rem !important;"/>
			<c:if test="${ not empty param.error}">
				<div style="color: red;">아이디 또는 패스워드가 올바르지 않습니다.</div>
			</c:if>
		</div>
	</div>
<div style="text-align:center;">
	<input class="btn" type="submit" class="login-btn" type="submit" style="margin-top:30px;"
		value="로그인">
</div>
</form>
<div style="margin-bottom:20px;    
	margin-top: 20px;
    margin-left: auto;
    margin-right: auto;
    text-align: center;">
	<p class="text-normal text-highlight"> <a href="" style="color:black !important;"> 아이디/비밀번호 찾기</a>
	|
	<a style="color:black !important;" href="">무료회원가입</a>
	</p>
</div>

</main>