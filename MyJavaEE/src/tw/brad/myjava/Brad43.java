package tw.brad.myjava;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.servlet.AsyncContext;
import javax.servlet.ServletContext;
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
	ExecutorService executorService = Executors.newFixedThreadPool(10);
	//AsyncContext asContext;
	
	@Override
	public void init() throws ServletException {
		super.init();
		System.out.println("init");
		
		ServletContext servletContext =  getServletContext();
		List<AsyncContext> asyncContexts = new LinkedList<>();
		servletContext.setAttribute("asyncs", asyncContexts);
		
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		request.setCharacterEncoding("UTF-8");

		
		out.print("end");
	}

	private class AsyncRequest implements Runnable {
		private AsyncContext asyncContext;
		AsyncRequest(AsyncContext asyncContext){
			this.asyncContext = asyncContext;
		}
		@Override
		public void run() {
			try {
				Thread.sleep(10*1000);
				
				PrintWriter out = asyncContext.getResponse().getWriter();
				out.print("Lottery:" + (int)(Math.random()*49+1));
				asyncContext.complete();
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
