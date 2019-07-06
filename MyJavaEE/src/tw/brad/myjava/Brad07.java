package tw.brad.myjava;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collection;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@WebServlet("/Brad07")
@MultipartConfig
public class Brad07 extends HttpServlet {
	protected void doPost(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		ServletContext context = getServletContext();
		String uploadPath = context.getInitParameter("uploadPath");
		//System.out.println(uploadPath);
		
		Part upload = request.getPart("upload");
		Collection<String> headerNames = upload.getHeaderNames();
		for(String headerName : headerNames) {
			String value = upload.getHeader(headerName);
			System.out.println(headerName + ":" + value);
		}
		
		long size = upload.getSize();
		String name = upload.getName();
		String sname = upload.getSubmittedFileName();
		System.out.println(name + ":" + sname + ":" + size);
		
		BufferedInputStream bin = 
				new BufferedInputStream(upload.getInputStream());
		byte[] buf = new byte[(int)size];
		bin.read(buf);
		bin.close();
		
		File uploadFile = new File(uploadPath, sname);
		System.out.println(uploadFile.getAbsolutePath());
		FileOutputStream fout = 
				new FileOutputStream(uploadFile);
		fout.write(buf);
		fout.flush();
		fout.close();
		
		
		
		
		
	}
}
