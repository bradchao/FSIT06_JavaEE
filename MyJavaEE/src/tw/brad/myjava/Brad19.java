package tw.brad.myjava;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.berry.BCrypt;

@WebServlet("/Brad19")
public class Brad19 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		String account = request.getParameter("account");
		String passwd = request.getParameter("passwd");
		String realname = request.getParameter("realname");
		
		if (account == null) return;

		String passwd2 = BCrypt.hashpw(passwd, BCrypt.gensalt());
		String ret = toMySQL(account, passwd2, realname);
		
		out.print(ret);
		out.flush();
	}
	
	private String toMySQL(String account, String passwd, String realname) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Properties prop = new Properties();
			prop.put("user", "root");
			prop.put("password", "root");
			prop.put("serverTimezone", "Asia/Taipei");
			Connection conn = DriverManager.getConnection(
				"jdbc:mysql://localhost:3307/iii", prop);
			String sql = 
				"INSERT INTO member (account,passwd,realname) VALUES (?,?,?)";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, account);
			pstmt.setString(2, passwd);
			pstmt.setString(3, realname);
			int count = pstmt.executeUpdate();
			return "Affected: " + count;
		}catch(Exception e) {
			//System.out.println(e.toString());
			return e.toString();
		}		
	}
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
}
