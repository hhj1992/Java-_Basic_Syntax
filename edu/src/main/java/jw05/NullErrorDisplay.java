package jw05;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * FileName : NullErrorDisplay.java
 * :: java.lang.NullPointerException 발생시 처리하는 Servlet
 * :: web.xml /  <error-page> 에 등록
*/
//@WebServlet("/NullErrorDisplay")
public class  NullErrorDisplay extends HttpServlet{

	public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{

		res.setContentType("text/html;charset=EUC-KR");
		PrintWriter out = res.getWriter();

		//==> java.lang.NullPointerException이 발생한 page를 정보를 display하면
		Object errorStatusCode = req.getAttribute("javax.servlet.error.status_code");
		Object errorMessage = req.getAttribute("javax.servlet.error.message");
		Object errorExceptionType = req.getAttribute("javax.servlet.error.exception_type");
		Object errorException = req.getAttribute("javax.servlet.error.exception");
		Object errorURI = req.getAttribute("javax.servlet.error.request_uri");

		System.out.println("status_code : "+errorStatusCode);
		System.out.println("message : "+errorMessage);
		System.out.println("exception_type : "+errorExceptionType);
		System.out.println("exception : "+errorException);
		System.out.println("exception.toString() : "+ ((Exception)errorException).toString());
		System.out.println("exception.getMessage() : "+ ((Exception)errorException).getMessage());
		System.out.println("request_uri : "+errorURI);
		
		out.println("<html>");
		out.println("<body>");
		out.println("<h3>");
		out.println("=====================================================<br/>");
		out.println("요청하신 page에서 발생한 error  내용은 .......<br/> ");
		out.println("=====================================================<br/>");
		out.println("status_code : "+errorStatusCode+"<br/>");
		out.println("message : "+errorMessage+"<br/>");
		out.println("exception_type : "+errorExceptionType+"<br/>");
		out.println("exception : "+errorException+"<br/>");
		out.println("exception.toString() : "+ ((Exception)errorException).toString()+"<br/>");
		out.println("exception.getMessage() : "+ ((Exception)errorException).getMessage()+"<br/>");
		out.println("request_uri : "+errorURI+"<br/>");
		out.println("=====================================================<br/>");
		out.println("</h3>");
		out.println("</body>");
		out.println("</html>");

	}//end of service
}//end of class