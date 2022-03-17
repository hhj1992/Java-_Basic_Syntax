<%@page import="dao.UserDAO"%>
<%@page import="vo.UserVO"%>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
    
<%    
	request.setCharacterEncoding("utf-8");
	
	UserVO vo = new UserVO();
	UserDAO dao = new UserDAO();
	
	//UserVO - Setting
	vo.setName(request.getParameter("name"));
	vo.setSex(request.getParameter("sex"));
	vo.setYear(request.getParameter("year"));
	vo.setMonth(request.getParameter("month"));
	vo.setDay(request.getParameter("day"));
	vo.setEducation(request.getParameter("education"));
	vo.setJob(request.getParameter("job"));
	
	
	//UserDAO - Insert
	dao.addUser(vo);
%>  
    
    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>Add User JSP</title>
	</head>
	<body>
		<%if(vo.isActive()) {%>
			<div><h2><%= request.getParameter("name") %>님, 회원 가입을 축하두립니둥둥둥둥~😊😊</h2></div>
			<div>
				<button type="button" onclick="location.href='../find/findUser.html'">❗❗찾기</button>
				<button type="button" onclick="location.href='../find/findUser.jsp'">내정보👀</button>
			</div>
			<%
				session.setAttribute( "name", request.getParameter("name") );
				session.setAttribute("userVO", vo);
			%>
		<%}else {%>
			<h2>회원 가입이 불가능 합니다.</h2>
		<%}%>
	</body>
</html>