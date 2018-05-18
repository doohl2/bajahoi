<%@page import="com.bajahoi.jspweb.entity.Member"%>
<%@page import="com.bajahoi.jspweb.jdbc.JdbcMemberDao"%>
<%@page import="com.bajahoi.jspweb.dao.MemberDao"%>
<%@page import="com.bajahoi.jspweb.jdbc.JdbcProductDao"%>
<%@page import="com.bajahoi.jspweb.entity.ProductView"%>
<%@page import="com.bajahoi.jspweb.dao.ProductDao"%>
<%@page import="com.bajahoi.jspweb.entity.Order"%>
<%@page import="com.bajahoi.jspweb.dao.OrderDao"%>
<%@page import="com.bajahoi.jspweb.jdbc.JdbcOrderDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctx" value="${pageContext.request.contextPath }"/>

	<!-- --------------------------header--------------------------- -->
			<h1 class="hidden">바자회</h1>
	<section>      
			<h1 class="hidden">내 주문</h1>
		
		
		  <!-- Page Content -->
		      <div class="container">

      <!-- Page Heading -->
      <h1 class="footer-margin">내 주문
        <small>페이지</small>
      </h1>								
								
      <div class="row">
      
          <c:forEach items="${lis}" var="li" >
     <div class="col">
          <div class="card bg-white">
          <div class="flex-row border-grey-light padding-lr">
          
           	<p class="text-grey text-normal text-highlight"> 주문번호 : ${li.id } </p>
          </div>
          
            <div class="card-body flex-column wh-reset" style="padding:1.25rem;">
            <a class="hfsize wh-reset" href="detail?&pid=${li.productId}"><img class="card-img-top margin-top" src="${ctx}/images/${li.piName }.${li.pieName}" alt=""></a>
              <div class="card-title wh-reset">
	              	<div class="list-content-text">
	               <small>${li.name } </small>
	                </div>
	                
					<div class="list-content-text">
	            	<small> 
	            	가격 : ${li.paymentAmount}<br>
	            	수량: ${li.quantity}<br>
	            	상태: ${li.orderStatusName}<br>
	            	배송예정일 : ${li.estArrivalDate}
	            	 </small>
         			</div>
              </div>
            </div>
           <div class="border-grey border-grey-smaller flex-row">
              <img class="rating-img" src="${ctx}/images/${li.memberRankName}star.png" alt="rating"> <button class="navbar-toggler text-grey"> 기업 </button> <button class="navbar-toggler text-grey">${li.nickname}</button>
          </div>
          </div>
        </div>
        </c:forEach>
     </div>
      <!-- /.row -->



      <!-- Pagination -->

       <ul class="pagination justify-content-center">
      
        <li class="bg-white">
        <c:if test="${startNum!=1 }">
          <a class="page-link" href="?id=${wishListView.id}&p=1" aria-label="Previous">
             <span aria-hidden="true">&laquo;</span>
            <span class="sr-only">Previous</span>
          </a>
          </c:if>
              <c:if test="${startNum==1 }">
         		<span class="page-link" onclick="alert('이전 페이지가 없습니다.');">&laquo;</span>
         </c:if>
        </li>
        
        <li class="bg-white">
        <c:if test="${startNum !=1 }">
          <a class="page-link" href="?id=${wishListView.id}&p=${startNum-3 }" aria-label="Previous">
            <span class="sr-only">Previous</span>
            <span aria-hidden="true">&lsaquo;</span>
          </a>
         </c:if>
         <c:if test="${startNum==1 }">
         		<span class="page-link" onclick="alert('이전 페이지가 없습니다.');">&lsaquo;</span>
         </c:if>
        </li>
        
        <c:forEach var="i" begin="0" end="2">
        	<c:if test="${startNum+i<=lastPage }">
        <li class="bg-white">
          <a class="page-link" href="?id=${wishListView.id}&p=${startNum+i }">${startNum+i }</a>
        </li>
     		</c:if>
		</c:forEach>

          <li class="bg-white">
          <c:if test="${startNum+3<=lastPage }">
          <a class="page-link" href="?id=${wishListView.id}&p=${startNum+3 }" aria-label="Next">
            <span aria-hidden="true">&rsaquo;</span>
            <span class="sr-only">Next</span>
          </a>
       </c:if> 
       <c:if test="${startNum+3>lastPage }">
       		<span class="page-link" onclick="alert('다음 페이지가 없습니다.');">&rsaquo;</span>
       </c:if>
       </li>
          
        <li class="bg-white">
          <c:if test="${param.p!=lastPage}">
          <a class="page-link" href="?id=${wishListView.id}&p=${lastPage}" aria-label="Next">
            <span aria-hidden="true">&raquo;</span>
            <span class="sr-only">Next</span>
          </a>
		</c:if> 
		
		<c:if test="${param.p==lastPage}">
       		<span class="page-link" onclick="alert('다음 페이지가 없습니다.');">&raquo;</span>
       </c:if>
        </li>
      </ul>
   
		   <!-- Footer -->

    </div>
	</section>