package jw05;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jw04.UserDataSourceDao;
import jw04.UserVO;

public class LoginBeanDataSourceSession extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("EUC_KR");
		response.setContentType("text/html;charset=euc_kr");
		PrintWriter out = response.getWriter();
		
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");

		HttpSession session = request.getSession();
		
		UserVO userVO = (UserVO) session.getAttribute("userVO");
		System.out.println("session�� ����� uesrVO ���� Ȯ�� : " + userVO);
		
		if(!(id == null || id.equals(""))) {
			userVO = new UserVO();
			userVO.setId(id);
			userVO.setPwd(pwd);

			// db ���� data �˻� �� 
			UserDataSourceDao userDataSourceDao = new UserDataSourceDao();
			userDataSourceDao.getUser(userVO);
		}

		out.println("<html>");
		out.println("<head></head>");
		out.println("<body>");
		out.println("<h2> Login ȭ�� </h2>");
		
		if(userVO!= null && userVO.isActive()) {
			out.println("<div>"+id+"�� ȯ�� �մϴ�~ ^0^ </div>");
			// �α����� ���������� �̷���� ���
			// session�� �α��� ������ userVO instance ����
			System.out.println("�α��� ���� session ����.");
			session.setAttribute("userVO", userVO);
			System.out.println(userVO+ "\n" + session.getId());
		}else {
			out.println("<div> ����!! Id , Pwd �� Ȯ�����ּ���~ </div>");
		}
		out.println("<p><a href = 'jw04/LoginBeanDataSourceSession.html'> �ڷ� </a></p>");
		out.println("</body>");
		out.println("</html>");
		
	}

}
