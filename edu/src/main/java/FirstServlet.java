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
		out.println("client에서 요청하신");
		out.println("/examples/FirstServlet입니다.<br/>");
		out.println("저는 java class 입니다<br/>");
		out.println("물론 Java web programming 기술입니다.<br/>");
		out.println("</h1>");
		out.println("</body>");
		out.println("</html>");

	}//end of service
}//end of class

/* 
	1.   [TOMCAT_HONE]\webapps\examples\WEB-INF\classes  폴더에 copy
	2. compile
		- J2EE API  classpath 설정
		 - [TOMCAT_HONE]\lib\servlet-api.jar    ==> classpath설정

	3. browser 에서
	    - 표준화된 폴더구조의 환경설정 화일 web.xml 에  아래와 같이 등록(?)후..
		-  http://127.0.0.1:8080/examples/FirstServlet     로 호출
*/