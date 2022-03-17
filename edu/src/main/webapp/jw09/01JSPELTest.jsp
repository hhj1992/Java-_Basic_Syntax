<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	문자 : ${"홍길동"}<br/>
	숫자 : ${1234}<br/><br/>
	
	숫자 + 숫자 : ${1+2 }<br/>
	문자 + 숫자 : ${"1"+2 }<br/><br/>
	
	10 == 10 : ${10==10}<br/>
	10 >= 1 : ${10>=1}<br/>
	!true : ${!true}<br/><br/>
	
	조건? ture : false = ${10>100 ? "10이 100보다 크다 true" : "10이 100보다 작다 false"}<br/><br/>
	
	emp null : ${empty null}<br/>
	emp " " : ${empty " "}<br/>
	emp "" : ${empty ""}<br/><br/>
	
	<%--문자*숫자 : ${"홍"*3 } --%>
	
</body>
</html>