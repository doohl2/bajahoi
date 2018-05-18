<%@page import="com.bajahoi.jspweb.entity.ProductView"%>
<%@page import="java.util.List"%>
<%@page import="com.bajahoi.jspweb.jdbc.JdbcProductDao"%>
<%@page import="com.bajahoi.jspweb.dao.ProductDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<body>
	<!-- --------------------------header--------------------------- -->
			<h1 class="hidden">바자회</h1>
	<section>
			<h1 class="hidden">나의서비스 페이지</h1>
		
		
		  <!-- Page Content -->
		      <div class="container">

      <!-- Page Heading -->
      <h1 class="footer-margin ">나의
        <small>서비스</small>
      </h1>								
								
      <div class="row">
      
         <c:forEach var="ms" items="${list}">
         
     <div class="col">
          <div class="card bg-white card-service">
           <div class="card-body">
            <a class="hfsize" href="#"><img class="card-img-top img-no-margin" src="../../images/${ms.piName }.${ms.pieName}" alt=""></a>
              <div class="card-title margin-top">

	               <p class="id-num"># ${ms.id }</p>
 
	               <div class="padding-top">
	               <small>${ms.name }</small>
	                </div>
	                
	                <div class="flex-row">
	                <p class="text-right">￦${ms.price }</p>
					</div>              
           	 </div>
      	</div>
         <div class="flex-row border-grey padding-lr" style="height:2.5rem !important">
             <p class="text-grey text-normal">${ms.regDate }</p>
    		<p class="text-grey text-normal text-right"> ${ms.regStatusName} </p>
      	</div>

        </div>
 	 </div>
 	 
 	 <div class="col">
           <div class="flex-row card-below margin-lr-no">
             <a href=""> <button class="btn"> 수정 </button> </a> 
             <form method="post">
                   <input type="hidden" name="z" value="${ms.id}"> <a href=""> <button class="btn"> 삭제 </button> </a> 
          	</form>
          </div> 
     </div>
     
 	      	</c:forEach>
      	
        </div>
 	 </div>
 	 
		   <!-- Footer -->
	</section>