<%@page import="java.util.List"%>
<%@page import="jw.service.user.dao.UserDao"%>
<%@page import="jw.service.user.vo.UserVO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<%
UserVO userVO = (UserVO)session.getAttribute("userVO");

if(userVO == null ){
	userVO = new UserVO();
}
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
		<%if(! userVO.isActive()){%>
			<jsp:include page="../jw07/login.html"/>
			<br/><br/>
			<a href="addUser.html"> ȸ������...</a>			
		<%}else{ %>
		<center><h1>ȸ�� ������ ��ü ���</h1></center>
			<center>
				<table border = 1>
					<tr>
						<th>��ȣ</th>
						<th>���̵�</th>
						<th>��й�ȣ</th>
						
					</tr>
					<% UserDao dao = new UserDao(); %>
					<%List <UserVO> arrayList = dao.getUserList(); %>
					<%for (int i = 0 ; i < arrayList.size();i++){ %>
					<%UserVO user = arrayList.get(i); %>
						<tr>
							<th><%= user.getNo() %></th>
							<th><%= user.getId() %></th>
							<th><%= user.getPwd() %></th>
						</tr>	
					<%} %>
					
				</table>
			</center>
		<%} %>		
</body>
</html>