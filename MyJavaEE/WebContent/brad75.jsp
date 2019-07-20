<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="org.json.*, java.util.*" %>
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
	String strData = (String)pageContext.getAttribute("data");
	LinkedList<HashMap<String,String>> data = new LinkedList<>();
	
	JSONArray root = new JSONArray(strData);
	//out.println(root.length());

	for (int i=0; i<root.length(); i++){
		JSONObject row = root.getJSONObject(i);
		HashMap<String,String> map = new HashMap<>();
		map.put("name", row.getString("Name"));
		map.put("addr", row.getString("Address"));
		map.put("tel", row.getString("Tel"));
		data.add(map);
	}
	//out.println(data.size());
	pageContext.setAttribute("pdata", data);
%>
<table border="1" width="100%">
	<tr>
		<th>Name</th>
		<th>Address</th>
		<th>Tel</th>
	</tr>

	<c:forEach items="${pdata }" var="row">
		<tr>
			<td>${row.name }</td>
			<td>${row.addr }</td>
			<td>${row.tel }</td>
		</tr>
	</c:forEach>

</table>


</body>
</html>