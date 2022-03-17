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
		
		// ���θ������ httpSession �̶��
		if(session.isNew()) {
			// name = value ����
			session.setAttribute("name", new String("ȫ�浿"));
		}
		
		request.setCharacterEncoding("euc_kr");
		response.setContentType("text/html;charset=euc_kr");
		PrintWriter out = response.getWriter();
		
		out.println("<html><head></head>");
		out.println("<body>");
		out.println("<center><h1>SessionUseCookieOne</h1></center>");
		
		System.out.println("\nUNIQUE�� JSESSIONID �� : "+ session.getId());
		
		if(session.isNew()) {
			out.println("������ ���� ������ <br/>");
		}else {
			out.println("\nUNIQUE�� JSESSIONID �� : " + session.getId()+ " �����");
		}
		out.println("<hr>");
		out.println("<a href = '/edu/SessionUseCookieTwo'>��ũ</a>");
		out.println("</body></html>");
	}

}
