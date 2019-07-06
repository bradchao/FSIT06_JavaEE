package tw.brad.myjava;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Brad08")
public class Brad08 extends HttpServlet {
	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {

		ServletContext context = getServletContext();
		String uploadPath = context.getInitParameter("uploadPath");
		System.out.println(uploadPath);
		
	}
}
