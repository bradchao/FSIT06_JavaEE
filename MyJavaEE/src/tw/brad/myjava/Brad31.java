package tw.brad.myjava;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Brad31")
public class Brad31 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		request.setCharacterEncoding("UTF-8");

		HttpSession session = request.getSession(false);
		if (session == null) {
			// get out here
			response.sendRedirect("Brad30");
		}else {
			// got it
			Member member = (Member)session.getAttribute("member");
			out.println("Account:" + member.getAccount() + "<br>");
			out.println("Realname:" + member.getRealname() + "<br>");
			out.println("age: " + member.getAge());
			
			
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
