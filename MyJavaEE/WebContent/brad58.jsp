<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 
	JSTL jsp tag
	EL
	directive => @
-->
<jsp:directive.page import="tw.brad.beans.Member" />
<jsp:useBean id="member" class="tw.brad.beans.Member"></jsp:useBean>
<jsp:setProperty property="id" value="011" name="member"/>
<jsp:setProperty property="name" value="Brad" name="member"/>

<jsp:declaration>
	int a;
	String name;
</jsp:declaration>

<jsp:scriptlet>
	a = 10; name="III";
</jsp:scriptlet>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

Mmeber = <jsp:expression>member</jsp:expression><br>
Member = <%= member %><br>
a = <jsp:expression>a</jsp:expression><br>
name = <jsp:expression>name</jsp:expression><br>



</body>
</html>