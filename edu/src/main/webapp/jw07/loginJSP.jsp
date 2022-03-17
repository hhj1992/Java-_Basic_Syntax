<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<%@page import="java.sql.*" %>
<%
	request.setCharacterEncoding("EUC_KR");
	//response.setContentType("text/html;charset=euc_kr");
	//PrintWriter out = response.getWriter();
	
	String id = request.getParameter("id");
	String pwd = request.getParameter("pwd");
	
	//=========================JDBC start===========================
	
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
%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="EUC-KR">
		<title>Login</title>
	</head>
	<body>
		<h2> Login 화면 </h2>
		<%if(fromDbid != null && fromDbpwd != null && fromDbid.equals(id) && fromDbpwd.equals(pwd)) { %>
		
		<div> <%= id %>님 환영 합니다~ ^0^.</div>
		<%}else {%>
		<div> 마!! Id , Pwd 를 확인해라 ㅋㅋ </div>
		<%}%>
		<p><a href = '/edu/jw07/loginJSP.html'> 뒤로 </a></p>
	</body>
</html>