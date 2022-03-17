<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<%
// 1. session Object Scope "count"호출	
Integer count = (Integer)session.getAttribute("count");
	
// 2. 없다면
if(count == null){
	out.println(":: 부라우저 켜고 1번째 방문 ::");
	session.setAttribute("count", new Integer(1));
}

// 3. 있다면

else {
	int changeCount = count.intValue()+1;
	out.println(":: 부라우저 켜고 "+changeCount+"번째 방문 ::");
	session.setAttribute("count",new Integer(changeCount));
}

%>
    
    
    
    
    
    
    
    
    
    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

</body>
</html>