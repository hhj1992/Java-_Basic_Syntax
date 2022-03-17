package jw05;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionUseCookieOne
 */
@WebServlet("/SessionUseCookieOne")
public class SessionUseCookieOne extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		
		// 새로만들어진 httpSession 이라면
		if(session.isNew()) {
			// name = value 형식
			session.setAttribute("name", new String("홍길동"));
		}
		
		request.setCharacterEncoding("euc_kr");
		response.setContentType("text/html;charset=euc_kr");
		PrintWriter out = response.getWriter();
		
		out.println("<html><head></head>");
		out.println("<body>");
		out.println("<center><h1>SessionUseCookieOne</h1></center>");
		
		System.out.println("\nUNIQUE한 JSESSIONID 는 : "+ session.getId());
		
		if(session.isNew()) {
			out.println("세션이 새로 생성됨 <br/>");
		}else {
			out.println("\nUNIQUE한 JSESSIONID 는 : " + session.getId()+ " 사용중");
		}
		out.println("<hr>");
		out.println("<a href = '/edu/SessionUseCookieTwo'>링크</a>");
		out.println("</body></html>");
	}

}
