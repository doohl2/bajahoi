<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<c:set var="ctx" value="${pageContext.request.servletContext.contextPath}"/>
    
<header>
	<section>
		<h1 class="hidden">BAJAHOI</h1>
		<div class="box header">
			<div class="left">
				<a href=""><div class="btn logo"></div></a>
				<a href=""><div class="name">
				<div class="box" style="font-size:10px; margin-left:21px; margin-right:6px; width:20px; height:13px; padding:3px;">기업</div><div style="font-size:17px;">${product.regCMemberId}</div></div>
				</a>
			</div>

			<div class="right">
				<a href=""><div class="btn search"></div></a>
				<a href=""><div class="btn heart"></div></a>
				<a href=""><div class="btn list"></div></a>
			</div>
		</div>
	</section>

<div class="box box-seller-profile">
						<div class="box-profile">
						   <div style="height:90%; width:30%;">
							<div class="box img"></div>
						   </div>	
							<div class="id">
								<div class="box flex"><div class="require-img"></div>
								<div style="font-size: 20px; margin-left: 10px; margin-right: 10px;">문의하기</div>
								</div>
							</div>
						</div>
					
						<div class="box box-profile-detail-seller">
							<div class="detailbox">
								<div class="flex">
									<div>총 작업개수</div>
								</div>
								<div class="flex">
									<div>14개</div>
								</div>
							</div>

							<div class="detailbox">
								<div class="flex">
									<div>만족도</div>
								</div>
								<div class="box-star flex">
									<div class="avg-star"></div>
									<div class="avg-star"></div>
									<div class="avg-star"></div>
									<div class="avg-star"></div>
									<div class="avg-star"></div>
								</div>
							</div>

							<div class="detailbox">
								<div class="flex">
									<div>평균응답시간</div>
								</div>
								<div class="flex">
									<div>18시간 이내</div>
								</div>
							</div>
						</div>
					</div>
<div class="box seller-menubar">
<div class="box service"><a href = "${ctx}/seller/service/serviceList"><div>서비스</div></a></div>
<div class="box review"><a href = "${ctx}/seller/review/reviewList"><div>서비스평가</div></a></div>
<div class="box community"><a href = "${ctx}/seller/community/communityList"><div>커뮤니티</div></a></div>
</div>
</header>