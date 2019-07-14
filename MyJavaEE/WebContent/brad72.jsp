<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>

<c:if test="${!empty param.cname }">
<!-- Load Driver -->
<sql:setDataSource
	driver="com.mysql.cj.jdbc.Driver"
	url="jdbc:mysql://localhost:3307/iii?serverTimezone=Asia/Taipei"
	user="root"
	password="root"
	/>
<!-- Add to MySQL -->
<sql:update var="count">
	INSERT INTO cust (cname,tel,birthday) VALUES (?,?,?)
	<sql:param>${param.cname }</sql:param>
	<sql:param>${param.tel }</sql:param>
	<sql:param>${param.birthday }</sql:param>
</sql:update>	
	
</c:if>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add New</title>
</head>
<body>
<h2>Add new Customer</h2>
<hr>
<form action="brad72.jsp">
	Name: <input name="cname"><br>
	Phone: <input name="tel"><br>
	Birthday: <input name="birthday"><br>
	<input type="submit" value="Add" />
</form>
</body>
</html>