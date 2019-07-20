<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	if (session.getAttribute("account") == null){
		System.out.println("debug4");
		response.sendRedirect("brad79.jsp");
		return;
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
Welcome, ${account }<br>
<hr>
<a href='logout.jsp'>Logout</a>
</body>
</html>