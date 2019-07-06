package tw.brad.myjava;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Brad02")
public class Brad02 extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("service()");
		//super.service(req, resp);
		doTask(req, resp);
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		System.out.println("doPost");
	}
	
	private void doTask(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		System.out.println("doTask");
		
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter writer = response.getWriter();
		writer.append("Hello, World<br>");
		
		StringBuffer sb = request.getRequestURL();
		writer.append(sb + "<br>");
		// iso-8859-1
		Enumeration<String> names = request.getParameterNames();
		while (names.hasMoreElements()) {
			String name = names.nextElement();
			String value = request.getParameter(name);
			String nvalue = 
				new String(value.getBytes("ISO-8859-1"), "UTF-8");
			
			writer.append(name + " = " + nvalue + "<br>");
		}
		
		writer.flush();
		
		
		
		
		
		
		
		
		
		
	}
	

}
