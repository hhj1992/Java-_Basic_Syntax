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
	System.out.println("session�� ����� uesrVO ���� Ȯ�� : " + userVO);
	
	if(!(id == null || id.equals(""))) {
		userVO = new jw04.UserVO();
		userVO.setId(id);
		userVO.setPwd(pwd);

		// db ���� data �˻� �� 
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
		<h2> Login ȭ�� </h2>
		<%if(userVO!= null && userVO.isActive()) {%>
		<div><%=userVO.getId()%>�� ȯ�� �մϴ�~ ^0^ </div>
		<%
		// �α����� ���������� �̷���� ��� 
		// session�� �α��� ������ userVO instance ����
		session.setAttribute("userVO", userVO);
		 %>
		<%}else {%>
		 <div> ����!! Id , Pwd �� Ȯ�����ּ���~ </div>
		 <%}%>
		 <p><a href = '/edu/jw07/loginBeanDataSourceSessionJSP.html'> �ڷ� </a></p>
	</body>
</html>