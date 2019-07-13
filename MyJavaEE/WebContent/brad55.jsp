<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String var1 = request.getParameter("var1");
	String var2 = request.getParameter("var2");
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
I am brad55 Page
<hr>
<%= var1 %> | <%= var2 %>
</body>
</html>