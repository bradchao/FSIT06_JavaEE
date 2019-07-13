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
<jsp:include page="brad51.jsp">
	<!-- request's param -->
	<jsp:param value="brad" name="name"/>
	<jsp:param value="18" name="age"/>
</jsp:include>
<hr>
</body>
</html>