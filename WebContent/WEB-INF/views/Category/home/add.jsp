<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<c:set var="ctx" value="${pageContext.request.servletContext.contextPath }" />
<main>
	
	<section class="allcate">
		<ul>
		<div onclick="location.href='${ctx}/Category/Subcategory/${list2[0].cateId}'" class="margin-20">
			<li  class="allcategory">
				<div class="icon">
				<img src="${ctx}/img/icon/living.png" alt=리빙&인테리어>
				</div>
				<div  class="flex-column">
					<div>
					<span class=" fsize-13em">리빙&인테리어</span>
					</div>
					<div>
					<span class=" fsize-03em">캔들, 디퓨저, 인테리어 소품, 식기, 가구/조명</span>
					</div>
				</div>
				<div class="move">
				<img src="${ctx}/img/icon/move.png" alt=이동 >
				</div>
				</li>
			</div>
			
			<div onclick="location.href='${ctx}/Category/Subcategory/${list2[1].cateId}'" class="margin-20">
				<li class="allcategory">
					<div class="icon">
					<img src="${ctx}/img/icon/food.png" alt=음식>
					</div>
					<div class="flex-column ">
						<div class="blcok align-left">
						<div>
						<span class=" fsize-13em">음식</span>
						</div>
						<div>
						<span class=" fsize-03em">수제간식, 수제청/잼, 수제즙, 음료</span>
						</div>
					</div>
					</div>
					<div class="move">
					<img src="${ctx}/img/icon/move.png" alt=이동 >
					</div>
				</li>
			</div>
				
			<div onclick="location.href='${ctx}/Category/Subcategory/${list2[2].cateId}'" class="margin-20">
				<li class="allcategory">
					<div class="icon">
					<img src="${ctx}/img/icon/fashion.png" alt=패션 >
					</div>
					<div class="flex-column">
						<div>
						<span class=" fsize-13em">패션 & 뷰티</span>
						</div>
						<div>
						<span class=" fsize-03em">의류, 패션잡화, 액세서리, 화장품/향수/천연비누</span>
						</div>
					</div>
					<div class="move">
					<img src="${ctx}/img/icon/move.png" alt=이동 >
					</div>
				</li>
			</div>
				
			<div onclick="location.href='${ctx}/Category/Subcategory/${list2[3].cateId}'" class="margin-20">
				<li class="allcategory">
					<div class="icon">
					<img src="${ctx}/img/icon/kids.png" alt=육아아동 >
					</div>
					<div class="flex-column">
						<div>
						<span class=" fsize-13em">육아 & 아동</span>
						</div>
						<div>
						<span class=" fsize-03em">인형, 장난감, 프라모델</span>
						</div>
					</div>
					<div class="move">
					<img src="${ctx}/img/icon/move.png" alt=이동 >
					</div>
				</li>
			</div>
				
			<div onclick="location.href='${ctx}/Category/Subcategory/${list2[4].cateId}'" class="margin-20">
				<li class="allcategory">
					<div class="icon">
					<img src="${ctx}/img/icon/pet.png" alt=반려동물 >
					</div>
					<div class="flex-column blocks">
						<div>
						<span class=" fsize-13em">반려동물</span>
						</div>
						<div>
						<span class=" fsize-03em">목줄, 강아지 집, 장난감</span>
						</div>
					</div>
					<div class="move">
					<img src="${ctx}/img/icon/move.png" alt=이동 >
					</div>
				</li>
			</div>
				
			<div onclick="location.href='${ctx}/Category/Subcategory/${list2[5].cateId}'" class="margin-20">
				<li class="allcategory">
					<div class="icon">
					<img src="${ctx}/img/icon/handcraft.png" alt=공예 >
					</div>
					<div class="flex-column">
						<div>
						<span class=" fsize-13em">아트 & 공예</span>
						</div>
						<div>
						<span class=" fsize-03em">비주얼아트, 십자수, 목자공예, 비즈공예, 금속공예</span>
						</div>
					</div>
					<div class="move">
					<img src="${ctx}/img/icon/move.png" alt=이동 >
					</div>
				</li>
			</div>
				
			<div onclick="location.href='${ctx}/Category/Subcategory/${list2[6].cateId}'" class="margin-20">
				<li class="allcategory">
						<div class="icon">
						<img src="${ctx}/img/icon/etc.png" alt=기타 >
						</div>
						<div class="flex-column ">
							<div>
							<span class=" fsize-13em">기타</span>
							</div>
						</div>
						<div class="move">
						<img src="${ctx}/img/icon/move.png" alt=이동 >
						</div>
				</li>
			</div>
		</ul>
	</section>
</main>