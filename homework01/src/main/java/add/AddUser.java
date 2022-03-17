package add;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.UserDAO;
import vo.UserVO;

public class AddUser extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// System.out.println("연결");
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");

		HttpSession session = request.getSession();
		
		PrintWriter out = response.getWriter();
		
		UserVO vo = new UserVO();
		vo.setName(request.getParameter("name"));
		vo.setSex(request.getParameter("sex"));
		vo.setYear(request.getParameter("year"));
		vo.setMonth(request.getParameter("month"));
		vo.setDay(request.getParameter("day"));
		vo.setEducation(request.getParameter("education"));
		vo.setJob(request.getParameter("job"));
		
		
		
		UserDAO dao = new UserDAO();
		dao.addUser(vo);
		
		if(vo.isActive()) {
			out.println("<div><h2>"+request.getParameter("name")+"님, 회원 가입을 축하두립니둥</h2></div>");	
			out.println("<div><button type=\"button\" onclick=\"location.href='FindUser' \">내정보</button></div>");
			session.setAttribute("name", request.getParameter("name") );
			session.setAttribute("code", session.getId());
		}else {
			out.println("<h2>??????????????????????????????????????????</h2>");
			
		}
		
		
		// response
		
	}

}
