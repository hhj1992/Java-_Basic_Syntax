<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<%
    request.setCharacterEncoding("EUC_KR");
	//response.setContentType("text/html;charset=euc_kr");
	//PrintWriter out = response.getWriter();
	
	String id = request.getParameter("id");
	String pwd = request.getParameter("pwd");

	//HttpSession session = request.getSession();
	
	jw04.UserVO userVO = (jw04.UserVO) session.getAttribute("userVO");
	System.out.println("session에 저장된 uesrVO 유무 확인 : " + userVO);
	
	if(!(id == null || id.equals(""))) {
		userVO = new jw04.UserVO();
		userVO.setId(id);
		userVO.setPwd(pwd);

		// db 접근 data 검색 비교 
		jw04.UserDataSourceDao userDataSourceDao = new jw04.UserDataSourceDao();
		userDataSourceDao.getUser(userVO);
	}
%>

    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="EUC-KR">
		<title>LoginBeanDataSourceSessionJSP</title>
	</head>
	<body>
		<h2> Login 화면 </h2>
		<%if(userVO!= null && userVO.isActive()) {%>
		<div><%=userVO.getId()%>님 환영 합니다~ ^0^ </div>
		<%
		// 로그인이 정상적으로 이루어진 경우 
		// session에 로그인 정보로 userVO instance 저장
		session.setAttribute("userVO", userVO);
		 %>
		<%}else {%>
		 <div> 실패!! Id , Pwd 를 확인해주세요~ </div>
		 <%}%>
		 <p><a href = '/edu/jw07/loginBeanDataSourceSessionJSP.html'> 뒤로 </a></p>
	</body>
</html>