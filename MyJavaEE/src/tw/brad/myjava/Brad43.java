package tw.brad.myjava;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.servlet.AsyncContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(
		urlPatterns = "/Brad43",
		asyncSupported = true
		)
public class Brad43 extends HttpServlet {
	ExecutorService executorService = Executors.newFixedThreadPool(1);
	AsyncContext asContext;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		request.setCharacterEncoding("UTF-8");

		asContext = request.startAsync();
		executorService.execute(new AsyncRequest());
		
		out.print("end");
	}

	private class AsyncRequest implements Runnable {
		@Override
		public void run() {
			try {
				Thread.sleep(10*1000);
				
				PrintWriter out = asContext.getResponse().getWriter();
				out.print("Lottery:" + (int)(Math.random()*49+1));
				asContext.complete();
			}catch(Exception e) {
				
			}
		}
	}
	
	@Override
	public void destroy() {
		System.out.println("die");
		executorService.shutdown();
		super.destroy();
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
