package tw.brad.myjava;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/HelloWorld")
public class HelloWorld extends HttpServlet {
	private int a;
	private static int b;
    public HelloWorld() {
        super();
        System.out.println("HelloWorld()");
    }
	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response) 
					throws ServletException, IOException {
		a++; b++;
		System.out.println("doGet()" + a + ":" + b);
		response.setContentType("text/html; charset=UTF-8");
		response.getWriter().append("Served at: ")
					.append(request.getContextPath())
					.append("<h1>Hello, World</h1>");
	}

}
