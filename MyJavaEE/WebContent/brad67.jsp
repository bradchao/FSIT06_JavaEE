<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>
<%
	String[] names = {"Brad","Amy","Peter","Tony","Kevic","AAA","BBB","CCC"};
	pageContext.setAttribute("names",names);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<table border="1" width="100%">
	<tr>
		<th>Index</th>
		<th>Name</th>
		<th>Count</th>
		<th>First</th>
		<th>Last</th>
	</tr>
	<c:forEach items="${names }" var="name" varStatus="status">
		<tr bgcolor="
		<c:choose>
			<c:when test="${status.count % 2 == 0}">yellow</c:when>
			<c:otherwise>pink</c:otherwise>
		</c:choose>
		">
			<td>${status.index }</td>
			<td>${name }</td>
			<td>${status.count }</td>
			<td>${status.first }</td>
			<td>${status.last }</td>
		</tr>
	</c:forEach>	

</table>


</body>
</html>

