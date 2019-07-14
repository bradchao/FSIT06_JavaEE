<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<sql:setDataSource
	driver="com.mysql.cj.jdbc.Driver"
	url="jdbc:mysql://localhost:3307/cust?serverTimezone=Asia/Taipei"
	user="root"
	password="root"
	/>
<sql:query var="rs1">
select * from gift
</sql:query>
<c:set var="page" value="${param.page == null ? 1 : param.page }" />
<c:set var="start" value="${(page - 1) * 10 }" />
<sql:query var="result">
select * from gift order by id limit ${start },10
</sql:query>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
Count: ${result.rowCount }<hr>
<table border="1" width="100%">
	<tr>
		<th width="10%">id</th>
		<th width="10%">gid</th>
		<th width="20%">pname</th>
		<th width="40%">feature</th>
		<th>Image</th>
	</tr>
	<c:forEach items="${result.rows }" var="row">
		<tr>
			<td>${row.id }</td>
			<td>${row.gid }</td>
			<td>${row.pname }</td>
			<td>${row.feature }</td>
			<td><img src='${row.url }' width='128px' height="128px"/></td>
		</tr>
	</c:forEach>
	
	
</table>




</body>
</html>