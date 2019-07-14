<%@page import="java.util.*"%>
<%@page import="tw.brad.beans.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String[] var1 = {"value1","value2","value3","value4","value5","value6",};
	pageContext.setAttribute("usernames", var1);

	String[] names = {"brad", "kevin","peter","eric","andy","jeff"};
	request.setAttribute("usernames", names);
	
	LinkedList<String> list = new LinkedList<>();
	list.add("AAA"); list.add("BBB"); list.add("CCC");
	request.setAttribute("list", list);
	
	HashMap<String,String> map = new HashMap<>();
	map.put("key1", "value1");
	map.put("key2", "value2");
	map.put("key3", "value3");
	request.setAttribute("map", map);
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
Username1: ${usernames[0] }<br>
Username2: ${usernames[4] }<br>
List1: ${list[param.i] }<br>
Map1: ${map.key2 }<br>
Map2: ${map[param.key] }<br>
Username:page: ${pageScope.usernames[0] }<br>
Username:request: ${requestScope.usernames[0] }<br>
Lottery: <%= BradAPIsV2.createLottery() %><br>
Lottery: ${BradAPIs.createLottery() }<br>
${BradAPIs.sayYa(param.who) }<br>
${10 + 3 }<br>
${param.x } > ${param.y } => ${param.x > param.y }<br>
${(param.x == "10") ? "Yes" : "No" }





</body>
</html>