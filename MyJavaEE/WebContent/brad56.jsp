<%@page import="java.io.Serializable"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="tw.brad.beans.Member" %>

<jsp:useBean id="member" class="tw.brad.beans.Member"></jsp:useBean>
<jsp:setProperty property="id" value="007" name="member"/>
<jsp:setProperty property="name" value="Brad" name="member"/>

<jsp:useBean id="member2" class="tw.brad.beans.Member"></jsp:useBean>
<jsp:setProperty property="id" value="008" name="member2"/>
<jsp:setProperty property="name" value="Mary" name="member2"/>


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
<jsp:getProperty property="id" name="member2"/>
:
<jsp:getProperty property="name" name="member2"/>
<hr>
<%
	boolean isMember = member instanceof Member;
	out.println(isMember + ":" + member.getName());
	member.setName("Tony");
%>
<hr>
<jsp:getProperty property="id" name="member"/>
:
<jsp:getProperty property="name" name="member"/>
<hr>
<%
	boolean isSerial = member instanceof Serializable;
	out.print(isSerial);

%>


</body>
</html>