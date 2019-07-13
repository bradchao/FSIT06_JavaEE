package tw.brad.myjava;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Brad26")
public class Brad26 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		
		Cookie rememberMe = new Cookie("remember", "true");
		rememberMe.setMaxAge(1*60);
		response.addCookie(rememberMe);
		
		Cookie account = new Cookie("account", "brad");
		account.setMaxAge(1*60);
		response.addCookie(account);

		Cookie passwd = new Cookie("passwd", "123456");
		passwd.setMaxAge(1*60);
		response.addCookie(passwd);

	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
