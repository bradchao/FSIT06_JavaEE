Hello, World
<%
	String name = request.getParameter("name");
	String age = request.getParameter("age");
%>
<%= name %>:<%= age %>
