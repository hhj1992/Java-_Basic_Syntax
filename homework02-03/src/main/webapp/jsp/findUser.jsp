<%@page import="dao.UserDAO"%>
<%@page import="vo.UserVO"%>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%    
    request.setCharacterEncoding("utf-8");

	UserVO vo = (UserVO)session.getAttribute("userVO");
		
	System.out.println("find User jsp  : "+vo);
		
	if(vo != null){
		vo = new UserDAO().findUser((String)session.getAttribute("name"));
	}else{
		vo = new UserDAO().findUser((request.getParameter("name")));
	}
		
    
%>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>정보 보기</title>
</head>
<body>

	<%if(vo != null){%>
		<div>
			<h1>개인정보 보기</h1>
			<p>아이디 : <%=vo.getId() %></p>
			<p>비밀번호 : <%=vo.getPassword() %></p>
			<p>이름 : <%=vo.getName() %></p>
			<p>성별 : <%= vo.getSex()%></p>
			<p>생년월일 : <%=vo.getYear()%> 년 <%=vo.getMonth()%>월 <%=vo.getDay()%>일</p>
			<p>최종학력 : <%=vo.getEducation()%></p>
			<p>직업 : <%=vo.getJob()%></p>
			<button type="button" onclick="location.href='../view/updateUserView.jsp'">정보 수정💦</button>
			<button type="button" onclick="location.href='../view/updateUserView.jsp?id=<%=vo.getId() %>>'">id로 수정💦</button>
		</div>
		<%session.setAttribute("userVO", vo); %>
	<%}else{%>
		<h1>입력하신 정보가 없습니다.</h1>
	<%}%>

</body>
</html>