<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
Hello, Brad
<hr>
<jsp:forward page="brad55.jsp">
	<jsp:param value="123" name="var1"/>
	<jsp:param value="456" name="var2"/>
</jsp:forward>
</body>
</html>