<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<style>
</style>
<title>Home</title>
</head>
<body>

</body>
<table border="1">
	<tr>
		<th>이름</th>
		<th>주소</th>
		<th>전화번호</th>
		<th>메일주소</th>
		<th>가입경로</th>
		<th>관심사항</th>
	</tr>
	<tr>
		<td>${userName}</td>
		<td>${address}</td>
		<td>${phoneNumber}</td>
		<td>${eMail}</td>
		<td>${registerPath}</td>
		<td>${checkList}</td>
	</tr>
</table>

</html>
