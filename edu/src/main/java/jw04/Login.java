package jw04;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("EUC_KR");
		response.setContentType("text/html;charset=euc_kr");
		PrintWriter out = response.getWriter();
		
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		
		//=========================JDBC===========================
		
		String fromDbid = null;
		String fromDbpwd = null;
		
		try {
			String dburl = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String dbuser= "scott";
			String dbpwd = "tiger";
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection(dburl, dbuser, dbpwd);
			
			PreparedStatement pStmt = con.prepareStatement("SELECT id ,pwd FROM users WHERE id = ?");
			pStmt.setString(1, id);
			
			ResultSet rs = pStmt.executeQuery();
			
			if(rs.next()) {
				fromDbid = rs.getString("id");
				fromDbpwd = rs.getString("pwd");
				
				System.out.println("DB에서 확인한 id, pwd ==> " +fromDbid+" : "+fromDbpwd);
			}else {
				System.out.println("DB에 Client에서 입력한 < " +id+" > 와 < "+pwd+"> 가 없습니다.");
			}
			
			rs.close();
			pStmt.close();
			con.close();
		} catch (Exception e) {
			System.out.println("====> JDBC 관련 Exception이 발생한 모양 <====");	
			e.printStackTrace();
		}
		//=========================JDBC 종료===========================
		
		out.println("<html>");
		out.println("<head></head>");
		out.println("<body>");
		out.println("<h2> Login 화면 </h2>");
		
		if(fromDbid != null && fromDbpwd != null && fromDbid.equals(id) && fromDbpwd.equals(pwd)) {
			
			out.println("<div>"+id+"님 환영 합니다~ ^0^ </div>");
		}else {
			out.println("<div> 마!! Id , Pwd 를 확인해라 ㅋㅋ </div>");
		}
		out.println("<p><a href = 'edu/jw04/login.html'> 뒤로 </a></p>");
		out.println("</body>");
		out.println("</html>");
		
	}

}
