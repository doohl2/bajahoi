<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<c:set var="ctx" value="${pageContext.request.servletContext.contextPath }" />
    
<main>


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

<div style=" width: 100%; height:auto; display: flex; flex-direction: row; justify-content: flex-end; align-items: flex-end;">
<div class="box" style="padding:1px; width:81px; height:22px; margin-top:5px;">평가 더보기</div></div>


	<div class="box review">
		<!-- 리뷰상자 -->

		<div class="time">
			<div>17.12.25 12:26 |</div>
			<div class="star"></div>
			<div class="star"></div>
			<div class="star"></div>
			<div class="star"></div>
			<div class="star"></div>
		</div>

		<div class="box-review-content">너무 예쁘고 어떤 향으로 해야 할지 몰라
			문의드렸는데....................</div>

		<div class="box profile">
			<div>
				<div class="box box-review"></div>
			</div>
			<div class="detail">
				<div>구매자 아이디</div>
			</div>

			<div class="detail2">
				<div class="delete"><div></div></div>
				<div class="delete"><div></div></div>
				<div class="box modify">
					<div>답변</div>
				</div>
			</div>
		</div>
	</div>
	
	<div class="box review" style="margin-top:10px;">
		<!-- 리뷰상자 -->

		<div class="time">
			<div>17.12.25 12:26 |</div>
			<div class="star"></div>
			<div class="star"></div>
			<div class="star"></div>
			<div class="star"></div>
			<div class="star"></div>
		</div>

		<div class="box-review-content">너무 예쁘고 어떤 향으로 해야 할지 몰라
			문의드렸는데....................</div>

		<div class="box profile">
			<div>
				<div class="box box-review"></div>
			</div>
			<div class="detail">
				<div>구매자 아이디</div>
			</div>

			<div class="detail2">
				<div class="delete"><div></div></div>
				<div class="delete"><div></div></div>
				<div class="box modify">
					<div>답변</div>
				</div>
			</div>
		</div>
	</div>
	
	<div class="box review" style="margin-top:10px;">
		<!-- 리뷰상자 -->

		<div class="time">
			<div>17.12.25 12:26 |</div>
			<div class="star"></div>
			<div class="star"></div>
			<div class="star"></div>
			<div class="star"></div>
			<div class="star"></div>
		</div>

		<div class="box-review-content">너무 예쁘고 어떤 향으로 해야 할지 몰라
			문의드렸는데....................</div>

		<div class="box profile">
			<div>
				<div class="box box-review"></div>
			</div>
			<div class="detail">
				<div>구매자 아이디</div>
			</div>

			<div class="detail2">
				<div class="delete"><div></div></div>
				<div class="delete"><div></div></div>
				<div class="box modify">
					<div>답변</div>
				</div>
			</div>
		</div>
	</div>
	
	<div class="box review" style="margin-top:10px;">
		<!-- 리뷰상자 -->

		<div class="time">
			<div>17.12.25 12:26 |</div>
			<div class="star"></div>
			<div class="star"></div>
			<div class="star"></div>
			<div class="star"></div>
			<div class="star"></div>
		</div>

		<div class="box-review-content">너무 예쁘고 어떤 향으로 해야 할지 몰라
			문의드렸는데....................</div>

		<div class="box profile">
			<div>
				<div class="box box-review"></div>
			</div>
			<div class="detail">
				<div>구매자 아이디</div>
			</div>

			<div class="detail2">
				<div class="delete"><div></div></div>
				<div class="delete"><div></div></div>
				<div class="box modify">
					<div>답변</div>
				</div>
			</div>
		</div>
	</div>
	
	<div class="box review" style="margin-top:10px;">
		<!-- 리뷰상자 -->

		<div class="time">
			<div>17.12.25 12:26 |</div>
			<div class="star"></div>
			<div class="star"></div>
			<div class="star"></div>
			<div class="star"></div>
			<div class="star"></div>
		</div>

		<div class="box-review-content">너무 예쁘고 어떤 향으로 해야 할지 몰라
			문의드렸는데....................</div>

		<div class="box profile">
			<div>
				<div class="box box-review"></div>
			</div>
			<div class="detail">
				<div>구매자 아이디</div>
			</div>

			<div class="detail2">
				<div class="delete"><div></div></div>
				<div class="delete"><div></div></div>
				<div class="box modify">
					<div>답변</div>
				</div>
			</div>
		</div>
	</div>
</main>