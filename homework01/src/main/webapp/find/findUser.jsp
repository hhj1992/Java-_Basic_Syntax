<%@page import="dao.UserDAO"%>
<%@page import="vo.UserVO"%>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%    
    request.setCharacterEncoding("utf-8");
		//response.setContentType("text/html;charset=utf-8");
		//PrintWriter out = response.getWriter();
		
		//HttpSession session = request.getSession();
		//String code = (String)session.getAttribute("code");

		
//		System.out.println(request.getQueryString());
//		System.out.println(session.getId());
//		System.out.println(session.getAttribute("name"));
//		System.out.println(session.getAttribute("code"));
//		System.out.println(code);
//		System.out.println(session.isNew());
		//UserVO vo = (UserVO)session.getAttribute("code");
		UserVO vo = (UserVO)session.getAttribute("userVO");
		
		System.out.println(vo);
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
<title>Insert title here</title>
</head>
<body>

	<%if(vo != null){%>
		<div>
			<h1>개인정보</h1>
			<p>이름 : <%=vo.getName() %></p>
				<p>성별 : <%= vo.getSex()%></p>
				<p>생년월일 : <%=vo.getYear()%> 년 <%=vo.getMonth()%>월 <%=vo.getDay()%>일</p>
				<p>최종학력 : <%=vo.getEducation()%></p>
				<p>직업 : <%=vo.getJob()%></p>
		</div>
	<%}else{%>
		<h1>입력하신 정보가 없습니다.</h1>
	<%}%>

</body>
</html>