package jw05;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * FileName : CookieWriterToClient.java
 *	:: Client �� �ʿ������� �����ϴ� Cookie ���
*/
//@WebServlet("/CookieWriterToClient")
public class CookieReaderToServer extends HttpServlet{

	public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
		
		req.setCharacterEncoding("EUC_KR");
		res.setContentType("text/html;charset=EUC_KR");
		PrintWriter out = res.getWriter();
		
		//Cookie ����(name=value) :: �ѱ� ���ڵ� �� ����
		Cookie[] cookies = req.getCookies();
		
		String userName = null;
		
		if(cookies != null) {
			out.println("client�� ���۵� ��Ű�� �ֽ��ϴ�. <br/>");
			
			for(int i =0; i <cookies.length;i++) {
				String name = cookies[i].getName();
				String value = cookies[i].getValue();
				
				System.out.println("client�� ���� ���۵� cookie : "+name + " = " +value);
			
				if(name.equals("name")) {
					userName = value;
				}
			}
		}else {
			out.println("���۵� cookie�� �����ϴ� <br/>");
		}
		
        out.println("<html><body>");
		if(userName == null) {
			out.println("ó���Դϴ�.");	
		}else {
			out.println(userName+"�� ȯ��");
		}
		out.println("</body></html>");
	}

}//end of class