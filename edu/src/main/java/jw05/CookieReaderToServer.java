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
 *	:: Client 에 필요정보를 저장하는 Cookie 사용
*/
//@WebServlet("/CookieWriterToClient")
public class CookieReaderToServer extends HttpServlet{

	public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
		
		req.setCharacterEncoding("EUC_KR");
		res.setContentType("text/html;charset=EUC_KR");
		PrintWriter out = res.getWriter();
		
		//Cookie 생성(name=value) :: 한글 인코딩 후 저장
		Cookie[] cookies = req.getCookies();
		
		String userName = null;
		
		if(cookies != null) {
			out.println("client에 전송된 쿠키가 있습니다. <br/>");
			
			for(int i =0; i <cookies.length;i++) {
				String name = cookies[i].getName();
				String value = cookies[i].getValue();
				
				System.out.println("client로 부터 전송된 cookie : "+name + " = " +value);
			
				if(name.equals("name")) {
					userName = value;
				}
			}
		}else {
			out.println("전송된 cookie가 없습니다 <br/>");
		}
		
        out.println("<html><body>");
		if(userName == null) {
			out.println("처음입니다.");	
		}else {
			out.println(userName+"님 환영");
		}
		out.println("</body></html>");
	}

}//end of class