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
%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="EUC-KR">
		<title>Login</title>
	</head>
	<body>
		<h2> Login ȭ�� </h2>
		<%if(fromDbid != null && fromDbpwd != null && fromDbid.equals(id) && fromDbpwd.equals(pwd)) { %>
		
		<div> <%= id %>�� ȯ�� �մϴ�~ ^0^.</div>
		<%}else {%>
		<div> ��!! Id , Pwd �� Ȯ���ض� ���� </div>
		<%}%>
		<p><a href = '/edu/jw07/loginJSP.html'> �ڷ� </a></p>
	</body>
</html>