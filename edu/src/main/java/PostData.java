import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

/*
 FileName  : PostData.java
	- Post��� ���۵� Client Form Data ó��
*/
public class PostData extends HttpServlet {

	// 1. Client Get ������� Request :: doGet() method OverRiding
	// 2. service() OverRiding ����
	
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
		
		//res.setCharacterEncoding("~~") (API Ȯ��)
		// 16���� ���ڵ��� client form data �ѱ� ���ڵ�
		req.setCharacterEncoding("EUC_KR");

		// �Ʒ��� �� ���๮�� servlet���� client�� html�� ���۽� �ʼ� �ڵ�
		res.setContentType("text/html;charset=EUC_KR");
		PrintWriter out = res.getWriter();

		// client form data(QueryString :: name=valueó�� (API Ȯ��))
		String clientName = req.getParameter("name");
		String clientAddr = req.getParameter("addr");

		// client form data ��� (�����??)
		System.out.println(clientName + " : " + clientAddr);

		out.println("<html>");
		out.println("<head><title>PostData.java</title></head>");
		out.println("<body>");

		out.println("<h2>Post Test</h2>");
		out.println("<li> �̸�: " + clientName);
		out.println("<li> �ּ�: " + clientAddr);

		out.println("<p><p><a href='/edu/postData.html'>�ڷ�</a>");

		out.println("</body>");
		out.println("</html>");
	
	}

}//end of class
