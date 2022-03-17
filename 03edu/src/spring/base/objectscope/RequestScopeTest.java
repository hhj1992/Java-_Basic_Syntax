package spring.base.objectscope;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RequestScopeTest extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException {
		res.setContentType("text/html; charset=euc-kr");
		PrintWriter out = res.getWriter();
		
		Integer count = (Integer)req.getAttribute("count");
		
		if(count == null) {
			out.println(":: 1번째 Request ::");
			req.setAttribute("count",new Integer(1));
		}else {
			int changeCount = count.intValue()+1;
			out.println(":: "+changeCount+"번째 Request ::");
			
			req.setAttribute("count",new Integer(changeCount));
		}
	}

}
