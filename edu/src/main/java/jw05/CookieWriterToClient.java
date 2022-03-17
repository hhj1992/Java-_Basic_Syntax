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
public class CookieWriterToClient extends HttpServlet{

	public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
		
		req.setCharacterEncoding("EUC_KR");
		res.setContentType("text/html;charset=EUC_KR");
		PrintWriter out = res.getWriter();

		//Cookie ����(name=value) :: �ѱ� ���ڵ� �� ����
		@SuppressWarnings("deprecation")
		Cookie cookie = new Cookie("name",URLEncoder.encode("ȫ�浿" ,"utf-8"));

        cookie.setMaxAge(60*60);	//cookie ��ȿ�Ⱓ(��)
		//cookie.setMaxAge(-1);		//cookie memory ���� :: ??	 ==> APIȮ�� 
		//cookie.setMaxAge(0);	 		//cookie 0�ʵ��� ��ȿ		:: ??	 ==> APIȮ�� 
		res.addCookie(cookie);		//Client �� response �ν��Ͻ��� ��� cookie ����
				
        out.println("<html><body>");
		out.println("Cookie ���� �Ϸ�");
		out.println("</body></html>");
	}

}//end of class