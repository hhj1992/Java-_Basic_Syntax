package find;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.UserDAO;
import vo.UserVO;

public class FindUser extends HttpServlet {
	
	
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		HttpSession session = request.getSession();
		String code = (String)session.getAttribute("code");

		
//		System.out.println(request.getQueryString());
//		System.out.println(session.getId());
//		System.out.println(session.getAttribute("name"));
//		System.out.println(session.getAttribute("code"));
//		System.out.println(code);
//		System.out.println(session.isNew());
		
		if(code != null) {
			if(code.equals((String)session.getId())) {
				System.out.println(code + " :: id�� ����Ǿ�����");
				UserVO findVO = new UserDAO().findUser((String)session.getAttribute("name"));
				out.println("<div>");
				out.println("<h1>��������</h1>");
				out.println("<p>�̸� : "+findVO.getName()+"</p>");
				out.println("<p>���� : "+findVO.getSex()+"</p>");
				out.println("<p>������� : "+findVO.getYear()+ "�� "+findVO.getMonth() + "��" +findVO.getDay()+"��" +"</p>");
				out.println("<p>�����з� : "+findVO.getEducation()+"</p>");
				out.println("<p>���� : "+findVO.getJob()+"</p>");
				out.println("</div>");
			}
		}else {
			out.println("<h1>�߸��� ���� ��� �Դϴ�.</h1>");
		}
		
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
		
		System.out.println(request.getQueryString());
//		System.out.println(request.getParameter("name"));
		UserVO findVO = new UserDAO().findUser(request.getParameter("name"));
		
		
		 System.out.println(findVO);
		if(findVO.getName() != null) {
			out.println("<div>");
			out.println("<h1>��������</h1>");
			out.println("<p>�̸� : "+findVO.getName()+"</p>");
			out.println("<p>���� : "+findVO.getSex()+"</p>");
			out.println("<p>������� : "+findVO.getYear()+ "�� "+findVO.getMonth() + "��" +findVO.getDay()+"��" +"</p>");
			out.println("<p>�����з� : "+findVO.getEducation()+"</p>");
			out.println("<p>���� : "+findVO.getJob()+"</p>");
			out.println("</div>");
			session.setAttribute("name", request.getParameter("name") );
			session.setAttribute("code", session.getId());
		}else {
			out.println("<h1>ã�� �̸��� ������ �����ϴ�.</h1>");
		}
		
	}

}
