<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	:: 10ResponesSendredirectjsp ���� <br/>
	
	<% request.setAttribute("aaa",new String("�����")); %>
	
	<% response.sendRedirect("09JSPActionForward.jsp"); %>
	
	<% response.sendRedirect("09JSPActionForward.jsp"); %>
	
	:: 10ResponesSendredirectjsp �� <br/>
</body>
</html>