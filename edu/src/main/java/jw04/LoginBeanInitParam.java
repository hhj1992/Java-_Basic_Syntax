package jw04;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginBeanInitParam extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private String jdbcDriver;
	private String jdbcURL;
	private String jdbcUser;
	private String jdbcPasswd;
	
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		
		jdbcDriver = config.getInitParameter("jdbcDriver");
		jdbcURL = config.getInitParameter("jdbcURL");
		jdbcUser = config.getInitParameter("jdbcUser");
		jdbcPasswd = config.getInitParameter("jdbcPasswd");
			
		//test
		System.out.println("jdbcDriver : "+ jdbcDriver);
		System.out.println("jdbcURL : "+ jdbcURL);
		System.out.println("jdbcUser : "+ jdbcUser);
		System.out.println("jdbcPasswd : "+ jdbcPasswd);
	}

	



	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("EUC_KR");
		response.setContentType("text/html;charset=euc_kr");
		PrintWriter out = response.getWriter();
		
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		
		UserVO userVO = new UserVO();
		userVO.setId(id);
		userVO.setPwd(pwd);
		
		
		UserInitParamDao dao = new UserInitParamDao();
		dao.setJdbcDriver(jdbcDriver);
		dao.setJdbcURL(jdbcURL);
		dao.setJdbcUser(jdbcUser);
		dao.setJdbcPasswd(jdbcPasswd);
		
		dao.getUser(userVO);

		
		out.println("<html>");
		out.println("<head></head>");
		out.println("<body>");
		out.println("<h2> Login 화면 </h2>");
		
		if(userVO.isActive()) {
			out.println("<div>"+id+"님 환영 합니다~ ^0^ </div>");
		}else {
			out.println("<div> 실패!! Id , Pwd 를 확인해주세요~ </div>");
		}
		out.println("<p><a href = 'jw04/loginBeanVODao.html'> 뒤로 </a></p>");
		out.println("</body>");
		out.println("</html>");
		
	}

}
