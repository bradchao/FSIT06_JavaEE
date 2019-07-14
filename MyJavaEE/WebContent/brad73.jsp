<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<!-- Load Driver -->
<sql:setDataSource
	driver="com.mysql.cj.jdbc.Driver"
	url="jdbc:mysql://localhost:3307/iii?serverTimezone=Asia/Taipei"
	user="root"
	password="root"
	/>

<c:if test="${!empty param.updateid }">
	<sql:update>
		UPDATE cust SET cname=?,tel=?,birthday=? WHERE id = ?
		<sql:param>${param.cname }</sql:param>
		<sql:param>${param.tel }</sql:param>
		<sql:param>${param.birthday }</sql:param>
		<sql:param>${param.updateid }</sql:param>	
	</sql:update>
	<c:redirect url="brad71.jsp" />
</c:if>	
<sql:query var="result">
	SELECT * FROM cust WHERE id = ?
	<sql:param>${param.editid }</sql:param>
</sql:query>
	
	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Customer</title>
</head>
<body>
<h2>Edit a Customer</h2>
<hr>
<form action="brad73.jsp">
	<input type="hidden" name="updateid" value="${result.rows[0].id }">
	Name: <input name="cname" value="${result.rows[0].cname }"><br>
	Phone: <input name="tel" value="${result.rows[0].tel }"><br>
	Birthday: <input name="birthday" value="${result.rows[0].birthday }"><br>
	<input type="submit" value="Update" />
</form>
</body>
</html>