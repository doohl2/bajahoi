<%@page import="com.bajahoi.jspweb.entity.Member"%>
<%@page import="com.bajahoi.jspweb.jdbc.JdbcMemberDao"%>
<%@page import="com.bajahoi.jspweb.dao.MemberDao"%>
<%@page import="com.bajahoi.jspweb.dao.ProductDao"%>
<%@page import="com.bajahoi.jspweb.jdbc.JdbcProductDao"%>
<%@page import="com.bajahoi.jspweb.entity.ProductView"%>
<%@page import="com.bajahoi.jspweb.entity.Order"%>
<%@page import="com.bajahoi.jspweb.jdbc.JdbcOrderDao"%>
<%@page import="com.bajahoi.jspweb.dao.OrderDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctx" value="${pageContext.request.contextPath }" />

	<!-- --------------------------header--------------------------- -->
			<h1 class="hidden">바자회</h1>
	<section>
			<h1 class="hidden">주문세부정보</h1>
	
		
		  <!-- Page Content -->
		      <div class="container">

      <!-- Page Heading -->
      <h1 class="footer-margin ">주문
        <small>세부정보</small>
      </h1>								
  <div class="row">
     <div class="col">
          <div class="card bg-white">
          <div class="flex-row border-grey-light padding-lr">
           	<p class="text-grey text-normal text-highlight"> 상태 : ${order.orderStatusName } </p>
          </div>
          
            <div class="card-body flex-column wh-reset" style="padding:1.25rem;">
            <a class="hfsize wh-reset" href="#"><img class="card-img-top margin-top" src="${ctx}/images/${product.piName}.${product.pieName}" alt=""></a>
              <div class="card-title wh-reset">
	              	<div class="list-content-text">
	               <small>${product.name}</small>
	                </div>
	                
					<div class="list-content-text">
	            	<small> 
	            	가격 : ￦${order.paymentAmount*order.quantity }<br>
	            	수량: ${order.quantity }<br>
	            	상태: ${order.orderStatusName }<br>
	            	배송예정일 : ${order.estArrivalDate }<br>
	            	  <button id="del-serv" class="btn margin-top-space font-m-size"> 배송조회 </button> 
	            	 </small>
         			</div>
              </div>
            </div>
          </div>
          
        
          
        </div>
        

 			
          <div class="col">
          <div class="card bg-white">
             <div class="flex-row border-grey-light padding-lr">
           	<p class="text-grey text-normal text-highlight"> 주문번호 : ${order.id } </p>
          	</div>
            <div class="card-body flex-column wh-reset" style="padding:1.25rem;">
            <div class="list-content-text" style="padding-top:0;">
	            	<small> 
			주문일 : ${order.paymentDate }	<br>
			총상품 : ${order.quantity }	<br>
			총비용 : ￦${order.paymentAmount*order.quantity }	<br>
	            	 </small>
         			</div>
            </div>
          </div>
          </div>
          
           <div class="col">
          <div class="card bg-white">
             <div class="flex-row border-grey-light padding-lr">
           	<p class="text-grey text-normal text-highlight"> 결제 세부사항 </p>
          	</div>
            <div class="card-body flex-column wh-reset" style="padding:1.25rem;">
            <div class="list-content-text" style="padding-top:0;">
	            	<small> 
			주문자 : ${member.name }<br>
			주소:  ${member.address1 }<br>
	            	 </small>
         			</div>
            </div>
          </div>
         </div>
          
           <div class="col">
          <div class="card bg-white">
             <div class="flex-row border-grey-light padding-lr">
           	<p class="text-grey text-normal text-highlight"> 배송 세부사항 </p>
          	</div>
            <div class="card-body flex-column wh-reset" style="padding:1.25rem;">
            <div class="list-content-text" style="padding-top:0;">
	            	<small> 
			결제방식 : ${order.paymentMethod }<br>
			이름 : ${ member.name}<br>
			카드번호 : ***********9373<br>
			만료 : 01/2033 <br>

	            	 </small>
         			</div>
            </div>
          </div>
          
            <div class="flex-row card-below margin-lr-no">
            <a href="../ask?mid=${member.id}&pid=${product.id}">
              <button class="btn margin-top-space font-m-size"> 주문 취소 </button>
            </a>
            <a href="../ask?mid=${member.id}&pid=${product.id}">
               <button class="btn margin-top-space font-m-size"> 교환 신청 </button>
             </a>
            <a href="../ask?mid=${member.id}&pid=${product.id}">
           <button class="btn margin-top-space font-m-size"> 환불 신청 </button>
           </a>
          </div> 
          
           <div class="flex-row card-below margin-lr-no">
             <a href=""><button class="btn margin-top-space font-m-size"> 바자회 홈 </button></a> 
             <a href="${ctx}/member/logout"><button class="btn margin-top-space font-m-size"> 로그 아웃 </button> </a>
         	 </div> 
          
          </div>

   		  </div>  
     
      <!-- /.row -->



   

   
		   <!-- Footer -->

    </div>
	</section>
	
	<script>
	window.addEventListener("load", function () {
		var delServ = document.querySelector("#del-serv");

		delServ.onclick = function	 () {

		            open("../../../sweetTrackerAPI.jsp","_blank","width=500px,height=500px");
		    }
	});
	</script>
