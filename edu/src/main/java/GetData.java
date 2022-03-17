import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

/*
 FileName  : GetData.java
	- Get방식 전송된 Client Form Data 처리
*/
public class GetData extends HttpServlet {

	// 1. Client Get 방식으로 Request :: doGet() method OverRiding
	// 2. service() OverRiding 가능
	
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
		
		// 한글 처리
		//res.setContentType("text/html");
		res.setContentType("text/html;charset=EUC_KR");
		PrintWriter out = res.getWriter();

		// client form data(QueryString :: name=value처리 (API 확인))
		String clientName = req.getParameter("name");
		String clientAddr = req.getParameter("addr");

		// client form data 출력 (출력은??)
		System.out.println(clientName + " : " + clientAddr);

		out.println("<html>");
		out.println("<head><title>GetData.java</title></head>");
		out.println("<body>");

		out.println("<h2>Get Test</h2>");
		out.println("<li> 이름: " + clientName);
		out.println("<li> 주소: " + clientAddr);

		out.println("<p><p><a href='edu/getData.html'>뒤로</a>");

		out.println("</body>");
		out.println("</html>");
	
	}

}//end of class