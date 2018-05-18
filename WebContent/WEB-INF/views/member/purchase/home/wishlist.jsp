<%@page import="com.bajahoi.jspweb.entity.WishListView"%>
<%@page import="com.bajahoi.jspweb.jdbc.JdbcWishListDao"%>
<%@page import="com.bajahoi.jspweb.dao.WishListDao"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctx" value="${pageContext.request.contextPath }" />
	<!-- --------------------------header--------------------------- -->
			<h1 class="hidden">바자회</h1>
	<section>
			<h1 class="hidden">찜 페이지</h1>
		
		
		  <!-- Page Content -->
		      <div class="container">

      <!-- Page Heading -->
      <h1 class="footer-margin ">내 찜
        <small>구경하기</small>
      </h1>								
								
      <div class="row">
      
      <c:forEach var="wl" items="${list}">
     <div class="col">
          <div class="card bg-white">
            <div class="card-body">
            <a class="hfsize" href=""><img class="card-img-top img-no-margin" src="${ctx}/images/${wl.piName }.${wl.pieName}" alt=""></a>
              <div class="card-title">
	              	<div>
	                <a href="#">
	               <small>${wl.name } ${wl.pid }</small>
	                </a>
	                </div>
	                <form method="post">
	                <div class="flex-row">
	                <p class="text-bold">￦ ${wl.price }</p> 
	                <input type="hidden" value="${wl.pid }" name="pid"> 
	                <label> 
	                <img id="drop-wish" class="img-1rem" src="${ctx }/images/red-like.png" alt="찜" style="margin-top:20px;">
	                <input type=submit class="btn-reset" style="display:none" >
					</label> 
                  </div>              
                  </form>
                  
              </div>
            </div>
           <div class="border-grey border-grey-smaller flex-row">
              <img class="rating-img" src="${ctx }/images/${wl.rank }star.png" alt="rating"> <button class="navbar-toggler text-grey"> 기업 </button> <button class="navbar-toggler text-grey"> ${wl.id } </button>
          </div>
          </div>
        </div>
        </c:forEach>
        
 	 </div>
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

	</section>
</html>

<script>
window.addEventListener("load", function () {
	var dropWish = document.querySelector("#drop-wish");
	
	dropWish.onclick = function(){
	var dropWish	 = confirm("찜 해제 하시겠습니까?");
	if(dropWish == true)
		return true;
	else
		return false;
	
	}
});
</script>