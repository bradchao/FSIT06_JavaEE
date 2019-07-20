<%@page import="java.util.Locale"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>i18n</title>
</head>
<body>
<%
	Locale locale = request.getLocale();
%>
Country: <%= locale.getCountry() %><br>
Country: <%= locale.getDisplayCountry() %><br>
Language: <%= locale.getLanguage() %><br>
<hr>
<fmt:setLocale value="zh_TW"/>
<fmt:setBundle basename="res"/>
<h1><fmt:message key="companyName"/></h1>
<fmt:message key="hello"/>, <fmt:message key="world"/> 
<hr>
<fmt:setLocale value="en_US"/>
<fmt:setBundle basename="res"/>
<h1><fmt:message key="companyName"/></h1>
<fmt:message key="hello"/>, <fmt:message key="world"/> 



</body>
</html>