<%@page import="jw.service.user.dao.UserDao"%>
<%@page import="jw.service.user.vo.UserVO"%>
<%@ page contentType="text/html; charset=EUC-KR"%>


<% if(request.getMethod().equals("GET")){%>
	<jsp:forward page = "login.html"/>
<%}%>  
    
<%
    request.setCharacterEncoding("EUC_KR");

	String id = request.getParameter("id");
	String pwd = request.getParameter("pwd");

	UserVO userVO= new UserVO();
	userVO.setId(id);
	userVO.setPwd(pwd);

	UserDao userDAO = new UserDao();
	userDAO.getUser(userVO);
%>

    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="EUC-KR">
		<title>LoginBeanDataSourceSessionJSP</title>
	</head>
	<body>
		<h2> Login ȭ�� </h2>
		<%if(userVO.isActive()) {%>
		<div><%=userVO.getId()%>�� ȯ�� �մϴ�~ ^0^ </div>
		<%session.setAttribute("userVO", userVO);%>
		<%}else {%>
		 <div> ����!! Id , Pwd �� Ȯ�����ּ���~ </div>
		 <%}%>
		 <p><a href = '/edu/jw07/login.html'> �ڷ� </a></p>
	</body>
</html>