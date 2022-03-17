package jw04;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginBean extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("EUC_KR");
		response.setContentType("text/html;charset=euc_kr");
		PrintWriter out = response.getWriter();
		
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		
		DataBaseBean dbBean = new DataBaseBean();
		dbBean.setId(id);
		dbBean.setPwd(pwd);
		
		boolean isLogin = dbBean.getUser();
		out.println("<html>");
		out.println("<head></head>");
		out.println("<body>");
		out.println("<h2> Login ȭ�� </h2>");
		
		if(isLogin) {
			
			out.println("<div>"+id+"�� ȯ�� �մϴ�~ ^0^ </div>");
		}else {
			out.println("<div> ��!! Id , Pwd �� Ȯ���ض� ���� </div>");
		}
		out.println("<p><a href = 'jw04/login.html'> �ڷ� </a></p>");
		out.println("</body>");
		out.println("</html>");
		
	}

}
