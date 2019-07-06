package tw.brad.myjava;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Brad16")
public class Brad16 extends HttpServlet {
	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		
		
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		String x = request.getParameter("x");
		String y = request.getParameter("y");
		String result = request.getParameter("result");
		
		String html = loadView("myview2.html");
		String outHtml = String.format(html, x, y, result);
		out.print(outHtml);
	}
	
	private String loadView(String viewfile) throws IOException {
		ServletContext context = getServletContext();
		String viewPath = context.getInitParameter("viewPath");
		
		BufferedReader reader = 
			new BufferedReader(new FileReader(new File(viewPath, viewfile)));
		StringBuffer sb = new StringBuffer(); String line;
		while ((line = reader.readLine()) != null) {
			sb.append(line);
		}
		reader.close();
		return sb.toString();
	}
	

}
