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
public class CookieWriterToClient extends HttpServlet{

	public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
		
		req.setCharacterEncoding("EUC_KR");
		res.setContentType("text/html;charset=EUC_KR");
		PrintWriter out = res.getWriter();

		//Cookie 생성(name=value) :: 한글 인코딩 후 저장
		@SuppressWarnings("deprecation")
		Cookie cookie = new Cookie("name",URLEncoder.encode("홍길동" ,"utf-8"));

        cookie.setMaxAge(60*60);	//cookie 유효기간(초)
		//cookie.setMaxAge(-1);		//cookie memory 저장 :: ??	 ==> API확인 
		//cookie.setMaxAge(0);	 		//cookie 0초동안 유효		:: ??	 ==> API확인 
		res.addCookie(cookie);		//Client 로 response 인스턴스를 사용 cookie 전송
				
        out.println("<html><body>");
		out.println("Cookie 저장 완료");
		out.println("</body></html>");
	}

}//end of class