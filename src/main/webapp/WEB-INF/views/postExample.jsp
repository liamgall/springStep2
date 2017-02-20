<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<style>
	#label{
		margin-left:5px;
		
	}
</style>
<title>Home</title>
</head>
<body>

	<form action="postRequest" id="form" method="post">
		<p>(*)항목은 반드시 입력</p>
		<ul>
			<li>
				<label id="label">이름 (*)</label>
				<input id="userName" name="userName"/>
			</li>
			<li>
				<label id="label">주소 (*)</label>
				<input id="address" name="address"/>
			</li>
			<li>
				<label id="label">전화번호 (*)</label>
				<input id="phoneNumber" name="phoneNumber"/>
			</li>
			<li>
				<label id="label">이메일 (*)</label>
				<input id="eMail" name="eMail"/>
			</li>
		</ul>
		<br>
		<p>가입 경로</p>
		<select id="selectBox">
			<option value="1">검색</option>
			<option value="2">지인권유</option>
			<option value="3">기타</option>
		</select>
		<br>
		<p>개인 관심사항</p>
		<input type="checkbox" value="internet">인터넷<br>
		<input type="checkbox" value="game">게임<br>
		<input type="checkbox" value="exercise">운동<br>
		<input type="checkbox" value="other">기타<br>
		<input type="submit" value="Submit">
		
	</form>

</body>
<script type="text/javascript" src="http://code.jquery.com/jquery-latest.min.js"></script>
<script src="<c:url value="/resources/js/hello.js"/>"></script>
<script>

</script>
</html>
