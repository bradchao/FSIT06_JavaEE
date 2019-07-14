<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="tw.brad.beans.BradAPIsV2" %>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<c:if test='${param.num == "100" }' var="result">
Hello, World<br>
</c:if>

${result }<hr>
<c:set var="score">${BradAPIsV2.toIntString(Math.random()*101) }</c:set>
Score: ${score }<br>
<c:choose>
	<c:when test='${score >= 90 }'>A</c:when>
	<c:when test='${score >= 80 }'>B</c:when>
	<c:when test='${score >= 70 }'>C</c:when>
	<c:when test='${score >= 60 }'>D</c:when>
	<c:otherwise>E</c:otherwise>
</c:choose>








</body>
</html>