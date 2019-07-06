package tw.brad.myjava;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Brad09")
public class Brad09 extends HttpServlet {
	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		// ?name=xxx => doGet
		String name = request.getParameter("name");
		
		RequestDispatcher dispatcher1 = 
			request.getRequestDispatcher("Brad10?age=18");
		RequestDispatcher dispatcher2 = 
				request.getRequestDispatcher("brad11.html");
		
		
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();

		out.print("<h1>Brad Big Company</h1>");
		out.print("<hr>");
		out.print("I am " + name);
		out.print("<hr>");
		
		dispatcher1.include(request, response);
		out.print("<hr>");
		dispatcher2.include(request, response);
		
		
	
	}
}
