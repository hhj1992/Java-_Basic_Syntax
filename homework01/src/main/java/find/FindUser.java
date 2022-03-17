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
				System.out.println(code + " :: id가 저장되어있음");
				UserVO findVO = new UserDAO().findUser((String)session.getAttribute("name"));
				out.println("<div>");
				out.println("<h1>개인정보</h1>");
				out.println("<p>이름 : "+findVO.getName()+"</p>");
				out.println("<p>성별 : "+findVO.getSex()+"</p>");
				out.println("<p>생년월일 : "+findVO.getYear()+ "년 "+findVO.getMonth() + "월" +findVO.getDay()+"일" +"</p>");
				out.println("<p>최종학력 : "+findVO.getEducation()+"</p>");
				out.println("<p>직업 : "+findVO.getJob()+"</p>");
				out.println("</div>");
			}
		}else {
			out.println("<h1>잘못된 접근 방식 입니다.</h1>");
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
			out.println("<h1>개인정보</h1>");
			out.println("<p>이름 : "+findVO.getName()+"</p>");
			out.println("<p>성별 : "+findVO.getSex()+"</p>");
			out.println("<p>생년월일 : "+findVO.getYear()+ "년 "+findVO.getMonth() + "월" +findVO.getDay()+"일" +"</p>");
			out.println("<p>최종학력 : "+findVO.getEducation()+"</p>");
			out.println("<p>직업 : "+findVO.getJob()+"</p>");
			out.println("</div>");
			session.setAttribute("name", request.getParameter("name") );
			session.setAttribute("code", session.getId());
		}else {
			out.println("<h1>찾는 이름의 정보가 없습니다.</h1>");
		}
		
	}

}
