<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String x = request.getParameter("x");
	String y = request.getParameter("y");
	String strResult = "";
	String strX, strY; strX = strY = "";
	if (x != null && y != null){
		try{
			int intX = Integer.parseInt(x);
			int intY = Integer.parseInt(y);
			int result = intX + intY;
			strResult = result+"";
			strX = intX +"";
			strY = intY + "";
		}catch(Exception e){
			strResult = ".......";			
		}
	}
	
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="brad45.jsp" onsubmit="return true;">
	<input name="x" value="<%= strX %>">
	<select>
		<option>+</option>
		<option>-</option>
		<option>x</option>
		<option>/</option>
	</select>
	<input name="y" value="<%= strY %>">
	<input type="submit" value="=">
	<%= strResult %>
</form>

</body>
</html>