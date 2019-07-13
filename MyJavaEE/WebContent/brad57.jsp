<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="tw.brad.beans.Member" %>
<!-- 
param => request.getParamters()
 -->
<jsp:useBean id="member" class="tw.brad.beans.Member"></jsp:useBean>
<jsp:setProperty property="id" value="${param.id }" name="member"/>
<jsp:setProperty property="name" value="${param.name }" name="member"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

Hello, 
<jsp:getProperty property="id" name="member"/>
:
<jsp:getProperty property="name" name="member"/>
<hr>
Hello, ${member.id } : ${member.name }


</body>
</html>