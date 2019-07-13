<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String method = request.getMethod();
	out.println(method + "<hr>");
	
	HttpServletRequest req = 
		(HttpServletRequest)pageContext.getRequest();
	out.println(req == request);
	out.println("<hr>");
	
	String remoteAddr = request.getRemoteAddr();
	out.print(remoteAddr + "<hr>");
	
	String queryString = request.getQueryString();
	out.println(queryString + "<hr>");
%>
Method = ${pageContext.request.method }<br>
ur IP = ${pageContext.request.remoteAddr }<br>
play : ${pageContext.response.locale.displayCountry }


</body>
</html>