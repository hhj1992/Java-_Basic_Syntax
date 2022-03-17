package jw05;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**	
 * Servlet implementation class SessionUseCookieOne
 */
@WebServlet("/SessionUseCookieOne")
public class SessionUseCookieTwo extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("euc_kr");
		response.setContentType("text/html;charset=euc_kr");
		PrintWriter out = response.getWriter();
		
		Cookie [] cookies = request.getCookies();
		if(cookies != null) {
			for(int i =0; i <cookies.length;i++) {
				System.out.println("cookie 에 저장된 정보  : "+cookies[i].getName() + " = " +cookies[i].getValue());
				System.out.println("\n");
			}
		}
		
		HttpSession session = request.getSession(false);
		
		if(session != null ) {
			out.println("\n JSESSIONID =  " + session.getId()+ "<hr>");
			String name = (String)session.getAttribute("name");
			out.println("이름 : " + name);
		}else {
			out.println("처음십니다ㅋ");	
		}
		
	}

}
