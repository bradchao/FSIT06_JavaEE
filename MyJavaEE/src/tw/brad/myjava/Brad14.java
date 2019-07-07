package tw.brad.myjava;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Brad14")
public class Brad14 extends HttpServlet {
	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		
		// 0 prepare
		String x = request.getParameter("x");
		String y = request.getParameter("y");
		String op = request.getParameter("op");
		if (x == null) x = "0";
		if (y == null) y = "0";
		if (op == null) op = "1";
		
		// 1. Model
		Brad15 model = new Brad15(x, y, op);
		double result = model.operation();
		
		// 2. View
		String pline = String.format("Brad16?x=%s&y=%s&op=%s&result=%s",
				x,y,op,result);
		RequestDispatcher rd = 
			request.getRequestDispatcher(
				pline);
		rd.forward(request, response);
		
	}

}
