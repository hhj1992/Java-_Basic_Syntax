import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

/*
 FileName  : PostData.java
	- Post방식 전송된 Client Form Data 처리
*/
public class PostData extends HttpServlet {

	// 1. Client Get 방식으로 Request :: doGet() method OverRiding
	// 2. service() OverRiding 가능
	
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
		
		//res.setCharacterEncoding("~~") (API 확인)
		// 16진수 인코딩된 client form data 한글 디코딩
		req.setCharacterEncoding("EUC_KR");

		// 아래의 두 실행문은 servlet에서 client로 html을 전송시 필수 코딩
		res.setContentType("text/html;charset=EUC_KR");
		PrintWriter out = res.getWriter();

		// client form data(QueryString :: name=value처리 (API 확인))
		String clientName = req.getParameter("name");
		String clientAddr = req.getParameter("addr");

		// client form data 출력 (출력은??)
		System.out.println(clientName + " : " + clientAddr);

		out.println("<html>");
		out.println("<head><title>PostData.java</title></head>");
		out.println("<body>");

		out.println("<h2>Post Test</h2>");
		out.println("<li> 이름: " + clientName);
		out.println("<li> 주소: " + clientAddr);

		out.println("<p><p><a href='/edu/postData.html'>뒤로</a>");

		out.println("</body>");
		out.println("</html>");
	
	}

}//end of class
