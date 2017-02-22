<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<link href="<c:url value="/resources/css/style.css" />" rel="stylesheet">

<title>Get Example</title>
</head>
<body>

	
	<form action="getRequest" id="form" method="get">
		<p>(*)항목은 반드시 입력</p>
		<ul>
			<li><label id="label">이름 (*)</label> <input id="userName" name="userName" /></li>
			<li><label id="label">주소 (*)</label> <input id="address" name="address" /></li>
			<li><label id="label">전화번호 (*)</label> <input id="phoneNumber" name="phoneNumber" /></li>
			<li><label id="label">이메일 (*)</label> <input id="eMail" name="eMail" /></li>
		</ul>
		<br>
		<p>가입 경로</p>
		<select id="registerPath" name="registerPath">
			<option value="" selected></option>
			<option value="검색">검색</option>
			<option value="지인권유">지인권유</option>
			<option value="기타">기타</option>
		</select> <br>
		<p>개인 관심사항</p>
		<input type="checkbox" name="인터넷" value="internet">인터넷<br>
		<input type="checkbox" name="게임" value="game">게임<br> <input
			type="checkbox" name="운동" value="exercise">운동<br> <input
			type="checkbox" name="기타" value="other">기타<br> <input
			type="hidden" name="checkList" id="checkList" /> <input type="submit"
			value="Submit">

	</form>

</body>
<script type="text/javascript"
	src="http://code.jquery.com/jquery-latest.min.js"></script>
<script src="<c:url value="/resources/js/app.js"/>"></script>
<script>

</script>
</html>

