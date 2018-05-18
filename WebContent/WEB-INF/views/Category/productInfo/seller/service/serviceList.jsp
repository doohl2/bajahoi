<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<c:set var="ctx" value="${pageContext.request.servletContext.contextPath }" />

<!-- -------------------------body---------------------------------- -->
			
	<!-- ------------------------------------body main 영역 시작------------------------------------------ -->
	<main id=top>

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
<div class="box service"><a href = "${ctx}/Category/productInfo/seller/service/serviceList?id=${product.regCMemberId}"><div>서비스</div></a></div>
<div class="box review"><a href = "${ctx}/Category/productInfo/seller/review/reviewList?id=${product.regCMemberId}"><div>서비스평가</div></a></div>
<div class="box community"><a href = "${ctx}/Board/messageboard/MessageBoard"><div>커뮤니티</div></a></div>
</div>

<div style="display:flex; flex-direction: column; align-items:center; width:100%; height:auto;">


<c:forEach var="p" items="${list}">	
		
<div class="box seller-service">
			<div class="box left">
				<div class="box img"></div>
				<div class="id">
					<div>${p.regCMemberId}</div>
				</div>
			</div>
			<div class="right">
				<div class="text">${p.name}
					<!-- 석고방향제 가성비 짱_고급스러움 을 한껏 담아 맞춤제작 해드립니다. -->
				</div>
				<div class="content">
					<div class="star-fee">
						<div class="box-star">
							<div class="star"></div>
							<div class="star"></div>
							<div class="star"></div>
							<div class="star"></div>
							<div class="star"></div>
						</div>
						<div class="fee">
							<div>${p.price}원</div>
						</div>
					</div>
					<div class="heart"></div>
				</div>
			</div>
		</div>
		
	</c:forEach> 

<%-- <div class="box seller-service">
<div class="box left"> <div class="box img"></div><div class="id"><div>${slist[0].regCMemberId}</div></div> </div>
<div class="right">
<div class="text">${slist[0].name}
</div>
<div class="content">
<div class="star-fee"> 
<div class="box-star"><div class="star"></div><div class="star"></div><div class="star"></div><div class="star"></div><div class="star"></div></div>
<div class="fee"><div>${slist[0].price}원</div></div>
</div>
<div class="heart"></div> </div> </div>
</div>

<div class="box seller-service">
<div class="box left"> <div class="box img"></div><div class="id"><div>${product.regCMemberId}</div></div> </div>
<div class="right">
<div class="text">${product.name}
</div>
<div class="content">
<div class="star-fee"> 
<div class="box-star"><div class="star"></div><div class="star"></div><div class="star"></div><div class="star"></div><div class="star"></div></div>
<div class="fee"><div>${product.price}원</div></div>
</div>
<div class="heart"></div> </div> </div>
</div>

<div class="box seller-service">
<div class="box left"> <div class="box img"></div><div class="id"><div>${product.regCMemberId}</div></div> </div>
<div class="right">
<div class="text">${product.name}
</div>
<div class="content">
<div class="star-fee"> 
<div class="box-star"><div class="star"></div><div class="star"></div><div class="star"></div><div class="star"></div><div class="star"></div></div>
<div class="fee"><div>${product.price}원</div></div>
</div>
<div class="heart"></div> </div> </div>
</div>

<div class="box seller-service">
<div class="box left"> <div class="box img"></div><div class="id"><div>${product.regCMemberId}</div></div> </div>
<div class="right">
<div class="text">${product.name}
</div>
<div class="content">
<div class="star-fee"> 
<div class="box-star"><div class="star"></div><div class="star"></div><div class="star"></div><div class="star"></div><div class="star"></div></div>
<div class="fee"><div>${product.price}원</div></div>
</div>
<div class="heart"></div> </div> </div>
</div> --%>

<div class="box btn-service-more">서비스 더보기</div>

</div>
</main>