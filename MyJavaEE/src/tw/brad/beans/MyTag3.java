package tw.brad.beans;

import java.io.IOException;
import java.io.StringWriter;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class MyTag3 extends SimpleTagSupport {
	private String name;
	private String price;
	
	public void setName(String name) {this.name = name;}
	public void setPrice(String price) {this.price= price;}
	
	@Override
	public void doTag() throws JspException, IOException {
		super.doTag();
		
		JspWriter out = getJspContext().getOut();
		//out.print(name + ":" + price);
		
		// play body
		StringWriter sw = new StringWriter();
		getJspBody().invoke(sw);
		
		String stringBody = sw.toString();
		
		out.print(stringBody + ":" + name + " => " + price);
		
		
	}

}
