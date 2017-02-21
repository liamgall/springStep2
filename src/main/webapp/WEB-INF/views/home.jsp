<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<title>Home</title>
</head>
<body>
	<h1>Home</h1>
	<form action="/postExample" method="get">
		<button type="submit" name="subject" value="post">Post</button>
	</form>

	<form action="/getExample" method="get">
		<button type="submit" name="subject" value="get">Get</button>
		
	</form>
</body>
</html>
