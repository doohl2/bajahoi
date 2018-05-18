<%@page import="com.bajahoi.jspweb.entity.Member"%>
<%@page import="com.bajahoi.jspweb.jdbc.JdbcMemberDao"%>
<%@page import="com.bajahoi.jspweb.dao.MemberDao"%>
<%@page import="com.bajahoi.jspweb.entity.Product"%>
<%@page import="com.bajahoi.jspweb.entity.ProductView"%>
<%@page import="java.util.List"%>
<%@page import="com.bajahoi.jspweb.dao.ProductDao"%>
<%@page import="com.bajahoi.jspweb.jdbc.JdbcProductDao"%>
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
			<h1 class="hidden">문의하기 페이지</h1>

		
		  <!-- Page Content -->
		      <div class="container">

      <!-- Page Heading -->
      <h1 class="footer-margin">문의
        <small>페이지</small>
      </h1>					
      							
      <div class="row">
 
     <div class="col">
          <div class="card bg-white">
          <div class="flex-row border-grey-light padding-lr">
           	<p class="text-grey text-normal text-highlight"> 주문번호 : ${order.id }</p>
          </div>
          
            <div class="card-body">
            <a class="hfsize" href="#"><img class="card-img-top margin-top" src="../../images/${productView.piName}.${productView.pieName }"></a>
              <div class="card-title">
	              	<div>
	                <a href="#">
	               <small>${productView.name }</small>
	                </a>
	                </div>
	                
	                <div class="flex-row">
	                <p class="text-bold">￦${productView.price }</p> 
					</div>              
              </div>
            </div>
           <div class="border-grey border-grey-smaller flex-row">
              <img class="rating-img" src="../../images/${member.memberRankName }star.png" alt="rating"> <button class="navbar-toggler text-grey"> 기업 </button> <button class="navbar-toggler text-grey">${member.nickname } </button>
          </div>
          </div>
      
        </div>
        
        
        
        <div class="col"><h2 class="footer-margin">
        <small>카테고리</small></h2>
 		<form method="post">
 			 <select class="select" name="titleName">
 			 	<option value="" selected>하나를 선택하세요...</option>
 			 	<option value="주문취소">주문취소</option>
 			 	<option value="교환신청">교환신청</option>
 			 	<option value="환불신청">환불신청</option>
 			 	<option value="상품문의">상품문의</option>
 			 	<option value="배송관련">배송관련</option>
 			 	<option value="결제관련">결제관련</option>	
 			 	<option value="주문관련">주문관련</option>
 			 </select>
  				 <h2 class="footer-margin">
      	 		 <small>메시지</small></h2>
				 <input type="text" class="card-body text-area card-body-longer" name="content">
      <div class="col">        
        <div class="text-center">
        <input type="submit" class="btn" value="제출" /> 
        </div>
       </div>
 		</form>
        </div>
        
        </div>
      <!-- /.row -->

    </div>
    </section>
