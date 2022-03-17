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
		<h2> Login 화면 </h2>
		<%if(userVO.isActive()) {%>
		<div><%=userVO.getId()%>님 환영 합니다~ ^0^ </div>
		<%session.setAttribute("userVO", userVO);%>
		<%}else {%>
		 <div> 실패!! Id , Pwd 를 확인해주세요~ </div>
		 <%}%>
		 <p><a href = '/edu/jw07/login.html'> 뒤로 </a></p>
	</body>
</html>