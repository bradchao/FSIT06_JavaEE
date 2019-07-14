<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="org.json.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<c:import var="data" url="http://data.coa.gov.tw/Service/OpenData/ODwsv/ODwsvTravelFood.aspx" />
<%
	//pageContext.setAttribute("data", value);
	String strData = (String)pageContext.getAttribute("data");
	//out.println(strData);
	
	//JSO
	
	
%>

</body>
</html>