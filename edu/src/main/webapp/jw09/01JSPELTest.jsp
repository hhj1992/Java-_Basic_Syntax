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
	���� : ${"ȫ�浿"}<br/>
	���� : ${1234}<br/><br/>
	
	���� + ���� : ${1+2 }<br/>
	���� + ���� : ${"1"+2 }<br/><br/>
	
	10 == 10 : ${10==10}<br/>
	10 >= 1 : ${10>=1}<br/>
	!true : ${!true}<br/><br/>
	
	����? ture : false = ${10>100 ? "10�� 100���� ũ�� true" : "10�� 100���� �۴� false"}<br/><br/>
	
	emp null : ${empty null}<br/>
	emp " " : ${empty " "}<br/>
	emp "" : ${empty ""}<br/><br/>
	
	<%--����*���� : ${"ȫ"*3 } --%>
	
</body>
</html>