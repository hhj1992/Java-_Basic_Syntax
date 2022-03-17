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
		System.out.println("session에 저장된 uesrVO 유무 확인 : " + userVO);
		
		if(!(id == null || id.equals(""))) {
			userVO = new UserVO();
			userVO.setId(id);
			userVO.setPwd(pwd);

			// db 접근 data 검색 비교 
			UserDataSourceDao userDataSourceDao = new UserDataSourceDao();
			userDataSourceDao.getUser(userVO);
		}

		out.println("<html>");
		out.println("<head></head>");
		out.println("<body>");
		out.println("<h2> Login 화면 </h2>");
		
		if(userVO!= null && userVO.isActive()) {
			out.println("<div>"+id+"님 환영 합니다~ ^0^ </div>");
			// 로그인이 정상적으로 이루어진 경우
			// session에 로그인 정보로 userVO instance 저장
			System.out.println("로그인 성공 session 생성.");
			session.setAttribute("userVO", userVO);
			System.out.println(userVO+ "\n" + session.getId());
		}else {
			out.println("<div> 실패!! Id , Pwd 를 확인해주세요~ </div>");
		}
		out.println("<p><a href = 'jw04/LoginBeanDataSourceSession.html'> 뒤로 </a></p>");
		out.println("</body>");
		out.println("</html>");
		
	}

}
