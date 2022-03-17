<%@ page contentType="text/html;charset=euc-kr" %>

<%@ page import="jw.service.user.vo.UserVO" %>
<%@ page import="jw.service.user.dao.UserDao" %>

<%
	
	// ����� �ڵ� /  WorkFlow Control
	if( request.getMethod().equals("GET") ){
		response.sendRedirect("addUser.html");
		return;
	 }

	request.setCharacterEncoding("euc-kr"); 
	
	// Client Form Data ó��
	String id = request.getParameter("id");
	String pwd = request.getParameter("pwd");
	int no = Integer.parseInt(request.getParameter("no"));
	
	// UserVO instance ���� �� Client Form Data ����(Binding)
	UserVO userVO = new UserVO();
	userVO.setId(id);
	userVO.setPwd(pwd);
	userVO.setNo(no);
	
	// DB  ���� ȸ������ Insert
	UserDao userDao = new UserDao();
%>

<%if(  userDao.addUser(userVO) ){%>
		<%= userVO.getId() %> ȸ�� ���� �����մϴ�.
<%} else {  %>
		�ٽ� ���Կ��<br/><hr/>
		<jsp:include page="/jw07/addUser.html" />
<%}%>