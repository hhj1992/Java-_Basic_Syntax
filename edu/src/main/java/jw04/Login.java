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
				
				System.out.println("DB���� Ȯ���� id, pwd ==> " +fromDbid+" : "+fromDbpwd);
			}else {
				System.out.println("DB�� Client���� �Է��� < " +id+" > �� < "+pwd+"> �� �����ϴ�.");
			}
			
			rs.close();
			pStmt.close();
			con.close();
		} catch (Exception e) {
			System.out.println("====> JDBC ���� Exception�� �߻��� ��� <====");	
			e.printStackTrace();
		}
		//=========================JDBC ����===========================
		
		out.println("<html>");
		out.println("<head></head>");
		out.println("<body>");
		out.println("<h2> Login ȭ�� </h2>");
		
		if(fromDbid != null && fromDbpwd != null && fromDbid.equals(id) && fromDbpwd.equals(pwd)) {
			
			out.println("<div>"+id+"�� ȯ�� �մϴ�~ ^0^ </div>");
		}else {
			out.println("<div> ��!! Id , Pwd �� Ȯ���ض� ���� </div>");
		}
		out.println("<p><a href = 'edu/jw04/login.html'> �ڷ� </a></p>");
		out.println("</body>");
		out.println("</html>");
		
	}

}
