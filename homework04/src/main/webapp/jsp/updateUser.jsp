<%@page import="dao.UserDAO"%>
<%@page import="vo.UserVO"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%
    request.setCharacterEncoding("utf-8");
	// 세션이 폴스고 request 로 받았다.
	UserVO vo = (UserVO)session.getAttribute("userVO");
	
	vo.setPassword(request.getParameter("password"));
	vo.setSex(request.getParameter("sex"));
	vo.setYear(request.getParameter("year"));
	vo.setMonth(request.getParameter("month"));
	vo.setDay(request.getParameter("day"));
	vo.setEducation(request.getParameter("education"));
	vo.setJob(request.getParameter("job"));
	
	new UserDAO().updateUser(vo);
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>변경 확인</title>
</head>
<body>
	<%if(vo.isActive()){%>
		<h1>정보가 수정되었습니다.</h1>
		<button type="button" onclick="location.href='findUser.jsp'">내정보 보기👀</button>
		<%session.setAttribute("userVO", vo); %>
	<%}%>  
</body>
</html>