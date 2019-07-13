<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>I am Title</title>
</head>
<body>
<h1>Brad Big Compnay</h1>
<hr>
<%
	int a = 10, b = 3;
	out.println(a / b + "<br>");
	
	int lottery = (int)(Math.random()*49+1);
	
	int year = Calendar.getInstance().get(Calendar.YEAR);
	int month = Calendar.getInstance().get(Calendar.MONTH)+1;
	int day = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
	String nowDate = year + "-" + month + "-" + day; 
	
%>
<%= nowDate %><br>
這期要出: <% out.print(lottery); %><br>
這期要出: <%= lottery %><br>


</body>
</html>