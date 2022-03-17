import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

/*
 FileName  : HelloServletService.java
	- Servlet Life Cycle  ���� �� Ȯ��
	- Servlet Hierachy / Sevlet API ����
*/
public class HelloServletService extends HttpServlet {

	///Field
	// init()
	
	///Method
	// service() method Overriding
	public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
		System.out.println("servlet Service() ����");
		System.out.println("Request Client IP : " + req.getRemoteAddr());
	
		// �ѱ� ó��
		//res.setContentType("text/html");
		res.setContentType("text/html;charset=EUC_KR");

		// 1. client Html Text �������� Stream�� ����
		//OutputStream outputStream = res.getOutputStream();
		//Writer writer = new OutputStreamWriter(outputStream);
		//PrintWriter out = new PrintWriter(writer);

		// 2. PrintWriter �ν��Ͻ� ������ Encapsulation�� API ��� Stream ����
		PrintWriter out = res.getWriter();

		out.println("<html>");
		out.println("<head><title>hello Servlet</title></head>");
		out.println("<body>");
		out.println("English : HelloServlet");
		out.println("<p>");
		out.println("Korea : ��� ����");
		out.println("</body>");
		out.println("</html>");
		out.flush();
		out.close();

		System.out.println(":: servlet service() ���� \n");
	
	}

	/// destroy()

}//end of class