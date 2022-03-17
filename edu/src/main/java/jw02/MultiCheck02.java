package jw02;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * FileName : MultiCheck01.java
 */
//@WebServlet("/MultiCheck02")
public class MultiCheck02 extends HttpServlet{

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{

		req.setCharacterEncoding("EUC_KR");		
		res.setContentType("text/html;charset=KSC5601");
		PrintWriter out = res.getWriter();
		
		out.println("<html>");
		out.println("<head></head>");
		out.println("<boby><center><h2>Client���� ���۵� ����</h2></center><p>");

		// 1. QueryString(name=value) �� name �� return �ϴ� getParameterNames() 
		// 2. getParameter("name") �� name  �ϵ��ڵ� ����
		Enumeration<String> en = req.getParameterNames();
		
		while(en.hasMoreElements()){
			String name = en.nextElement();
			String value = req.getParameter(name);
			out.println("<li> "+name+" : "+value);
		}
        
		out.println("</body>");
		out.println("</html>");
	}

}//end of class