package spring.base.navigation;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import spring.service.domain.User;

public class ServletSendRedirect extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException {
		System.out.println("[servlet SendRediresct service() start...]");
		
		req.setAttribute("user01", new User("홍길동","1111"));
		
		HttpSession session = req.getSession(true);
		session.setAttribute("user02",new User ("이순신","2222"));
		
		ServletContext application = this.getServletContext();
		application.setAttribute("user03",new User ("장보고","3333"));
		
		res.sendRedirect("/003edu/02Navigation/view.jsp");
		
		System.out.println("[servlet SendRediresct service() end...]");
	}

}
