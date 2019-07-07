package tw.brad.myjava;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Brad21")
public class Brad21 extends HttpServlet {
	private boolean isOK;
	private Connection conn;
	private String sql = "SELECT * FROM member WHERE account = ?";
	private PreparedStatement pstmt;
	
	public Brad21() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Properties prop = new Properties();
			prop.put("user", "root");
			prop.put("password", "root");
			prop.put("serverTimezone", "Asia/Taipei");
			conn = DriverManager.getConnection(
				"jdbc:mysql://localhost:3307/iii", prop);			
			pstmt = conn.prepareStatement(sql);
			isOK = true;
		}catch(Exception e) {
			isOK = false;
		}
		
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		String account = request.getParameter("account");
		String passwd = request.getParameter("passwd");
		
		if (account == null) return;
		boolean isMember = checkAccount(account, passwd);
		if (isMember) {
			out.println("OK");
		}else {
			out.println("XX");
		}
	}
	
	private boolean checkAccount(String account, String passwd) {
		boolean ret = false;
		try {
			pstmt.setString(1, account);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				//
				String hashPasswd = rs.getString("passwd");
				ret = BradAPIs.ckPasswd(passwd, hashPasswd);
			}
		}catch(Exception e) {
			//return false;
		}
		
		return ret;
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
