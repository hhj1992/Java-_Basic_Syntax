<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	:: 10ResponesSendredirectjsp 시작 <br/>
	
	<% request.setAttribute("aaa",new String("연결됨")); %>
	
	<% response.sendRedirect("09JSPActionForward.jsp"); %>
	
	<% response.sendRedirect("09JSPActionForward.jsp"); %>
	
	:: 10ResponesSendredirectjsp 끝 <br/>
</body>
</html>