<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	System.out.println("debug1");
	if ( session.isNew() ||
			request.getParameter("account") == null ||
			request.getParameter("passwd") == null){
		System.out.println("debug2");
		response.sendRedirect("brad79.jsp");
		return;
	}

	String account = request.getParameter("account");
	String passwd = request.getParameter("passwd");
	
	System.out.println(account + ":" + passwd);
	
	if (account.equals("brad") && passwd.equals("123456")){
		session.setAttribute("account", account);
		response.sendRedirect("brad81.jsp");		
	}else{
		response.sendRedirect("brad79.jsp");
	}


%>