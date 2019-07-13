<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method="post">
	<input name="x" value="${param.x }">
	+
	<input name="y" value="${param.y}">
	<input type="submit" value="=">
	${param.x + param.y }
</form>
</body>
</html>