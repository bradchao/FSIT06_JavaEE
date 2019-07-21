package tw.brad.myjava;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.AsyncContext;
import javax.servlet.AsyncEvent;
import javax.servlet.AsyncListener;

public class MyAsyncListener implements AsyncListener {
	@Override
	public void onComplete(AsyncEvent event) throws IOException {
		// TODO Auto-generated method stub
		AsyncContext asyncContext = event.getAsyncContext();
		PrintWriter out = asyncContext.getResponse().getWriter();
		
		
		
	}

	@Override
	public void onError(AsyncEvent event) throws IOException {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void onTimeout(AsyncEvent event) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Timeout");
		
		AsyncContext asyncContext = event.getAsyncContext();
		List<AsyncContext> asyncContexts = (List<AsyncContext>)
				asyncContext.getRequest()
					.getServletContext()
					.getAttribute("asyncs");
		asyncContexts.remove(asyncContext);
		
	}

	@Override
	public void onStartAsync(AsyncEvent event) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("start");
	}
}
