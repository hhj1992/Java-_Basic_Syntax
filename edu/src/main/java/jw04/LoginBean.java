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
		out.println("<h2> Login 화면 </h2>");
		
		if(isLogin) {
			
			out.println("<div>"+id+"님 환영 합니다~ ^0^ </div>");
		}else {
			out.println("<div> 마!! Id , Pwd 를 확인해라 ㅋㅋ </div>");
		}
		out.println("<p><a href = 'jw04/login.html'> 뒤로 </a></p>");
		out.println("</body>");
		out.println("</html>");
		
	}

}
