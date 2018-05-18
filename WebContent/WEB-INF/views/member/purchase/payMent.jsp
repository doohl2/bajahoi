<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<link href="../../css/payMent.css" type=text/css rel="stylesheet"/>
</head>
<body>

<div class="amount">
	<h3>결제 금액</h3>
	<table>
		<tr>
			<td>총 결제금액(VAT 포함)</td>
			<td>24,000</td>
		</tr>
	</table>
</div>	


<div class="payment-option">	
	<h3>결제방법</h3>	
	<table>
		<tr>
			<td><label><input type="radio" name="결제옵션"/>신용카드</label></td>
		</tr>
		<tr>
			<td><label><input type="radio" name="결제옵션"/>무통장입금</label></td>
		</tr>
		<tr>
			<td><label><input type="radio" name="결제옵션"/>휴대폰</label></td>
		</tr>
		<tr>
			<td><label><input type="radio" name="결제옵션"/>카카오페이</label></td>
		</tr>
	</table>			
</div>

<div class="text">
	<p>* 개인 전문가 이므로 세금계산서 발행이 불가능 합니다.<br>
	* 현금 형수증은 세액공제용으로는 사용이 불가능 합니다.</p>
</div>

<div  class="text">
** 전문가의 약속 불이행 및 거래 사고 예방을 위해 거래            완료까지 결제 대금을 안전하게 보호하고 있습니다.
</div>

<div class="payment">
	<form>
		<input class="payment-btn" type="submit" value="결제하기"/>
	</form>
	<p>총 결제금액(VAT 포함)<br>		
	<p>24,000원</p>
</div>


</body>
</html>