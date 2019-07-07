package tw.brad.myjava;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Brad24")
public class Brad24 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("image/jpeg");
		
		String uploadPath = getServletContext().getInitParameter("uploadPath");
		
		BufferedImage bimg = ImageIO.read(new File(uploadPath, "Koala.jpg"));
		Graphics2D g2d = bimg.createGraphics();

		Font myfont = new Font(null, Font.BOLD + Font.ITALIC, 48);
		
		AffineTransform tran = new AffineTransform();
		tran.rotate(Math.toRadians(-45), 0, 0);
		Font font2 = myfont.deriveFont(tran);
		
		g2d.setFont(font2);
		g2d.setColor(Color.YELLOW);
		g2d.drawString("Hello, Brad", 120, 160);
		
		OutputStream out = response.getOutputStream();
		ImageIO.write(bimg, "jpeg", out);
		
		File outFile = new File(uploadPath, "brad.jpg");
		ImageIO.write(bimg, "jpeg", outFile);
		
		out.flush();
		out.close();
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
