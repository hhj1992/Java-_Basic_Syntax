<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<%
// 1. session Object Scope "count"ȣ��	
Integer count = (Integer)session.getAttribute("count");
	
// 2. ���ٸ�
if(count == null){
	out.println(":: �ζ���� �Ѱ� 1��° �湮 ::");
	session.setAttribute("count", new Integer(1));
}

// 3. �ִٸ�

else {
	int changeCount = count.intValue()+1;
	out.println(":: �ζ���� �Ѱ� "+changeCount+"��° �湮 ::");
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