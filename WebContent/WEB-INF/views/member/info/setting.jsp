<%@page import="com.bajahoi.jspweb.entity.Member"%>
<%@page import="com.bajahoi.jspweb.dao.MemberDao"%>
<%@page import="com.bajahoi.jspweb.jdbc.JdbcMemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <c:set var="ctx" value="${pageContext.request.contextPath }" />   
<script src="http://dmaps.daum.net/map_js_init/postcode.v2.js"></script>
<script src="http://dmaps.daum.net/map_js_init/postcode.v2.js"></script>
<script>
    function sample6_execDaumPostcode() {
        new daum.Postcode({
            oncomplete: function(data) {
                // 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.

                // 각 주소의 노출 규칙에 따라 주소를 조합한다.
                // 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.
                var fullAddr = ''; // 최종 주소 변수
                var extraAddr = ''; // 조합형 주소 변수

                // 사용자가 선택한 주소 타입에 따라 해당 주소 값을 가져온다.
                if (data.userSelectedType === 'R') { // 사용자가 도로명 주소를 선택했을 경우
                    fullAddr = data.roadAddress;

                } else { // 사용자가 지번 주소를 선택했을 경우(J)
                    fullAddr = data.jibunAddress;
                }

                // 사용자가 선택한 주소가 도로명 타입일때 조합한다.
                if(data.userSelectedType === 'R'){
                    //법정동명이 있을 경우 추가한다.
                    if(data.bname !== ''){
                        extraAddr += data.bname;
                    }
                    // 건물명이 있을 경우 추가한다.
                    if(data.buildingName !== ''){
                        extraAddr += (extraAddr !== '' ? ', ' + data.buildingName : data.buildingName);
                    }
                    // 조합형주소의 유무에 따라 양쪽에 괄호를 추가하여 최종 주소를 만든다.
                    fullAddr += (extraAddr !== '' ? ' ('+ extraAddr +')' : '');
                }

                // 우편번호와 주소 정보를 해당 필드에 넣는다.
                document.getElementById('sample6_postcode').value = data.zonecode; //5자리 새우편번호 사용
                document.getElementById('sample6_address').value = fullAddr;

                // 커서를 상세주소 필드로 이동한다.
                document.getElementById('sample6_address2').focus();
            }
        }).open();
    }
</script>
<body>
	<!-- --------------------------header--------------------------- -->
			<h1 class="hidden">바자회</h1>
	<section>
			<h1 class="hidden">계정설정</h1>
	
		
		  <!-- Page Content -->
			<form name="form" method="post" enctype="multipart/form-data">
		      <div class="container">

      <!-- Page Heading -->
								
      <div class="row">
	      <div class="col">
			
	      <h1 class="footer-margin ">계정
	        <small>설정하기</small>
	      </h1>				
			<div class="padding-lr margin-top-small-space">
	  		<strong class="text-normal text-highlight">나의 계정</strong>
	  		</div>
	  		
	      	 	<div class="padding-lr margin-top-small-space text-center">
	  		 <div style="margin-bottom: -20px; margin-right: -40px;">
	  		 <label for="upload"> 
	  		 <img src="../../images/add.svg" alt="add" style="z-index: 1;">
	  		 </label> 
	  		 </div>
 				<label for="upload"> 
	  		 <img class="acc-img photo-button" src="../../images/acc.svg" alt="upload"> 
	  		 <input type="file" class="photo-file-button" id="upload" style="display:none;" name="profile"> 
	  		  	</label> 
	     	</div>
	     	
	     	<div class="padding-lr margin-top-small-space">
	  			<strong class="text-normal text-highlight"><label for="name">이름</label></strong>
	  		</div>
	     	<div class="padding-lr margin-top-small-space">
	     		<input type="text" disabled="disabled" class="acc-text-area" value="${member.name}" required>	
	     	</div>
	     	
	     	
	     	<div class="padding-lr margin-top-small-space">
	  			<strong class="text-normal text-highlight"><label for="nickname">닉네임&기업명</label></strong>
	  		</div>
	     	<div class="padding-lr margin-top-small-space">
		     	<div class="padding-lr margin-top-small-space">
		     		<label class="text-normal"><input type="radio" value="개인" name="memberType1" checked>개인</label>
	 				<label class="text-normal"><input type="radio" value="기업" name="memberType1"  >기업</label>
	 			 </div>
	     			<input type="text" class="acc-text-area"  name="nickname" required >
	     	</div>
	     	
 			 
	     	<div class="padding-lr margin-top-small-space">
	  			<strong class="text-normal text-highlight"><label for="email">이메일</label></strong>
	  		</div>
	     	<div id="email-area" class="padding-lr margin-top-small-space">
	     		<input type="text" class="acc-text-area"  style="width:6rem;" name="email1" required pattern="^[a-zA-Z0-9]*$"> @ <input type="text" class="acc-text-area" required style="padding-left:0 !important; width:6rem;" name="email2"> 
	     		<select  class="acc-text-area" required style="padding-left:0 !important; width:5rem;" name="email_select"  onchange="checkemailaddy();"> 
	     		<option value="0"> 직접입력  </option>
	     		<option value="naver.com"> naver.com </option>
	     		<option value="gmail.com"> gmail.com </option>
	     		<option value="yahoo.com"> yahoo.com </option>
	     		<option value="daum.net"> daum.net </option>	     		
  				<option value="nate.com"> nate.com </option>	     		
	     		</select>
	     	</div>
	     	
	     	<div class="padding-lr margin-top-small-space">
	  			<strong class="text-normal text-highlight"><label for="phone">연락가능번호</label></strong>
	  		</div>
	     	<div class="padding-lr margin-top-small-space">
	     		<input type="tel" class="acc-text-area" name="phone" required placeholder="'-' 제외하고 숫자만 입력하세요" pattern="^[0-9]{10,11}$">
	     	</div>	
	     	
	     	<div class="padding-lr margin-top-small-space">
	  			<strong class="text-normal text-highlight"><label for="name">주소</label></strong>
	  		</div>
	  		
<!-- 	  	------------------- 주소 API ------------------------I -->
<div class="padding-lr margin-top-small-space">
<input required type="text" id="sample6_postcode" placeholder="우편번호" class="acc-text-area margin-top-small-space-space"  style="width:27.3%;" name="postcode">
<input required  type="button" onclick="sample6_execDaumPostcode()" value="우편번호 찾기" class="acc-text-area" style="width:50%;"><br>
<input required  type="text" id="sample6_address" class="acc-text-area margin-top-small-space-space" placeholder="기본주소"  name="address1">
<input required type="text" id="sample6_address2" class="acc-text-area margin-top-small-space-space" placeholder="상세주소" name="address2">
<span id="guide" style="color:#999"></span>
</div> 
<!-- 	  	------------------- 주소 API ------------------------I -->
	 	     	
	     	<div class="padding-lr margin-top-small-space">
	  			<strong class="text-normal text-highlight">비밀번호 변경</strong>
	  		</div>

	     	<div class="padding-lr margin-top-small-space">
	  			<strong class="text-normal text-highlight">&nbsp;&nbsp;<label for="curpasswd">기존 비밀번호</label></strong>
	  		</div>
			<div class="padding-lr margin-top-small-space">
	     		<input required type="password" class="acc-text-area"  placeholder="영문과 숫자, 특수문자 조합 6~15자리 이내" name="password" pattern="^(?=.*[a-zA-Z])(?=.*[!@#$%^*+=-])(?=.*[0-9]).{8,}$">
	     	</div>
	     	<div class="padding-lr margin-top-small-space">
	  			<strong class="text-normal text-highlight">&nbsp;&nbsp;<label for="newpasswd">변경할 비밀번호</label></strong>
	  		</div>
			<div class="padding-lr margin-top-small-space">
		     	<input required type="password" class="acc-text-area" name="npassword" pattern="^(?=.*[a-zA-Z])(?=.*[!@#$%^*+=-])(?=.*[0-9]).{8,}$">
		     	<input required type="password" class="acc-text-area margin-top-small-space-space" name="npassword2" pattern="^(?=.*[a-zA-Z])(?=.*[!@#$%^*+=-])(?=.*[0-9]).{8,}$">
			</div>
	     	<div class="padding-lr text-center flex-row margin-lr-no margin-top-space card-below">

	     			<input type="submit" class="btn" value="저장"> 
	     <a class="back">
		     		<input type="reset" class="btn" value="취소"> 
	     </a>
	     	</div>
	     	

		   </div>
       </div> 
 	 </div>
				 </form>

      <!-- /.row -->
         
		   <!-- Footer -->

	</section>
	
	<script>

	function checkemailaddy(){
        if (form.email_select.value == '0') {
            form.email2.readOnly = false;
            form.email2.value = '';
            form.email2.disabled =false;
            form.email2.focus();
        }
        else {
			form.email2.readOnly = true;
			form.email2.disabled = true;
            form.email2.value = form.email_select.value;
        }
    }
	
	window.addEventListener("load", function () {
		
		var back = document.querySelector(".back");
		var photoFileButton = document.querySelector(".photo-file-button");
		var photoButton = document.querySelector(".photo-button");
			
		  back.onclick = function (){
		  history.back();
		  }
		  
		  photoButton.onclick = function() {
				var event = new MouseEvent("click", {
					view : window,
					bubbles : true,
					ancelable : true
				});

			}

			photoFileButton.onchange = function(e) {
				var file = photoFileButton.files[0];

				var info = "name :" + file.name;
				info += ", size: " + file.size;
				info += ", type: " + file.type;

				var typeParts = file.type.split("/");
				if (typeParts[0] != "image"){
					alert("지원되는 이미지 파일의 형식이 아닙니다.");
					return;
				}
				
				var reader = new FileReader();
				
				reader.onload = function(ev){
					photoButton.src = ev.target.result;
				};
				reader.readAsDataURL(file);
			}
	});
	

	</script>