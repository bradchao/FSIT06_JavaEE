<%@page import="java.util.Properties"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%@ page import="com.berry.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<c:catch var="errMesg">
<%
	String passwd = BCrypt.hashpw("123456", BCrypt.gensalt());
	Class.forName("com.mysql.cj.jdbc.Driver");
	Properties prop = new Properties();
	prop.put("user", "root");
	prop.put("password", "root");
	prop.put("serverTimezone", "Asia/Taipei");

	Connection conn = DriverManager.getConnection(
		"jdbc:mysql://localhost:3307/iii",prop);
	String sql = 
			"INSERT INTO member (account,passwd,realname) VALUES (?,?,?)";
	PreparedStatement pstmt = conn.prepareStatement(sql);
	pstmt.setString(1, "Amy");
	pstmt.setString(2, passwd);
	pstmt.setString(3, "Brad Chao");
	pstmt.executeUpdate();
%>
</c:catch>
<c:if test="${errMesg != null }">${errMesg }</c:if>


</body>
</html>