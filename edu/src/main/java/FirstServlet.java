import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class FirstServlet extends HttpServlet{
	///Field
	///Method
	public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{

		res.setContentType("text/html;charset=EUC-KR");
		
		PrintWriter out = res.getWriter();
		
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>");
		out.println("client���� ��û�Ͻ�");
		out.println("/examples/FirstServlet�Դϴ�.<br/>");
		out.println("���� java class �Դϴ�<br/>");
		out.println("���� Java web programming ����Դϴ�.<br/>");
		out.println("</h1>");
		out.println("</body>");
		out.println("</html>");

	}//end of service
}//end of class

/* 
	1.   [TOMCAT_HONE]\webapps\examples\WEB-INF\classes  ������ copy
	2. compile
		- J2EE API  classpath ����
		 - [TOMCAT_HONE]\lib\servlet-api.jar    ==> classpath����

	3. browser ����
	    - ǥ��ȭ�� ���������� ȯ�漳�� ȭ�� web.xml ��  �Ʒ��� ���� ���(?)��..
		-  http://127.0.0.1:8080/examples/FirstServlet     �� ȣ��
*/