<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>



<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	:: 08JSPActionForward 시작 <br/>
	
	<% request.setAttribute("aaa",new String("연결됨")); %>
	
	<jsp:forward page="09JSPActionForward.jsp"></jsp:forward>
	<jsp:forward page="09JSPActionForward.jsp"></jsp:forward>
	
	:: 08JSPActionForward 끝 <br/>
</body>
</html>