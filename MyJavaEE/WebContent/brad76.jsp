<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<c:set var="var1" value="Hello, World" />
<c:if test='${fn:contains(var1, "orl") }'>
OK
</c:if>
<hr>
<%
	String var1 = (String)pageContext.getAttribute("var1");
	if (var1.contains("orl")){
		out.println("OK");
	}

%>

</body>
</html>