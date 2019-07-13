OK, I am brad49
<%

	String name = request.getParameter("name");
	if (name != null){
		out.print(name + "<br>");
	}
	
	String who = (String)request.getAttribute("who");
	out.println(who + "<br>");
	
	String var1 = (String)pageContext.getAttribute("var1");
	out.println(var1 + "<br>");

	

%>
