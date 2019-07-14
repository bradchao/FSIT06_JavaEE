<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>
<%
	//pageContext.setAttribute("x", 1234); ==> equal line 15
%>

<jsp:useBean id="member1" class="tw.brad.beans.Member"></jsp:useBean>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<c:set var="x" value="1234" scope="page" />

<c:out value="Hello, World" /><br>
<c:out value="${'Hello, World' }" /><br>
<c:out value="${x }" default="no value" /><br>
${x!=null ? x : "no value" }<hr>

<c:set var="var1" value="1" scope="page" />
<c:set var="var1" value="2" scope="request" />
${var1 }<br>
${requestScope.var1 }<br>
<c:set var="var2">3</c:set>
${var2 }<br>
${member1 }<br>
<c:set target="${member1 }" property="id">001</c:set>
<c:set target="${member1 }" property="name">Brad</c:set>
${member1.id } : ${member1.name }<br>

<c:remove var="member1"/>
${member1.id } : ${member1.name }<br>















</body>
</html>