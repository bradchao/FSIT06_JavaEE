<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Brad Big Company</h1>
<%
	int test1 = (int)(Math.random()*49+1);
	out.print(test1 + "<br>");
	
	request.setAttribute("test1", test1);
	
	//response.sendRedirect("brad83.jsp");
	request.getRequestDispatcher("brad83.jsp").forward(request, response);
	//request.getRequestDispatcher("brad83.jsp").include(request, response);


%>


</body>
</html>