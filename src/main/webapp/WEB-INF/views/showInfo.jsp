<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<style>
</style>
<title>Home</title>
<script type="text/javascript"
	src="http://code.jquery.com/jquery-latest.min.js"></script>
<script src="<c:url value="/resources/js/hello.js"/>"></script>
</head>
<body>

</body>
<table border="1">
	<tr>
		<th>이름</th>
		<th>주소</th>
		<th>전화번호</th>
		<th>메일주소</th>
	</tr>
	<tr>
		<td>${userName}</td>
		<td>${address}</td>
		<td>${phoneNumber}</td>
		<td>${eMail}</td>
	</tr>
</table>

</html>
