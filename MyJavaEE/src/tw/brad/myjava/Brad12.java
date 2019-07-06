package tw.brad.myjava;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Brad12")
public class Brad12 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("Brad13");
		
		out.print("<h1>Brad Big Company</h1>");
		
		String name = request.getParameter("name");
		
		if (name == null) {
			out.print("null");
			dispatcher.forward(request, response);
		}else {
			out.println(name);
		}
		
		
		
		
	}

}
