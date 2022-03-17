<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
    <%@page isELIgnored="false" %>
    
    <%@ page import= "java.util.*" %>
<%
   // 1. page ObjectScope 저장
   pageContext.setAttribute("abc",new String("page ObjectScope 저장된 문자열"));
   
   // 2. request ObjectScope 저장
   request.setAttribute("abc",new String("request ObjectScope 저장된 문자열"));
   
   //3.1 session ObjectScope  (size() ==0인)  ArrayList 저장
   session.setAttribute("abc",new ArrayList());
   
   // 3.2 session ObjectScope 값을 갖는 ArrayList 저장
   ArrayList arrayList =new ArrayList();
   arrayList.add( new String("ArrayList  저장된 문자열") );
   session.setAttribute("def",arrayList);
   
   // 4. Application ObjectScope 값을 갖는 HashMap 저장
   HashMap hashMap = new HashMap();
   hashMap.put("zzz",new String("HashMap 저장된 문자열"));
   application.setAttribute("abc",hashMap);
%>
    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h5>1 page ObjectScope 접근</h5>
	ㅇ ${pageScope.abc } = ${pageScope["abc"] }
	
	<h5>2 request ObjectScope 접근</h5>
	ㅇ ${requestScope.abc } = ${requestScope["abc"] }

	<h5>3 session ObjectScope 접근 : 저장된 ArrayList empty 유뮤</h5>
	ㅇ ${empty sessionScope.abc } = ${empty sessionScope["abc"] }
	
	<h5>4.1 session ObjectScope 접근 : 저장된 ArrayList empty 유무</h5>
	ㅇ ${empty sessionScope.def } = ${empty sessionScope["def"] }
	
	<h5>4.2 session ObjectScope 접근</h5>
	ㅇ ${sessionScope.def[0] } = ${sessionScope["def"][0] }
	
	<h5>5.1 application ObjectScope 접근 : 저장된 HashMap empty 유무</h5>
	ㅇ ${empty  applicationScope.abc } = ${empty applicationScope["abc"] }
	
	<h5>5.2 application ObjectScope 접근 </h5>
	ㅇ ${applicationScope.abc.zzz } = ${applicationScope["abc"].zzz }
	
	<h5>오브젝트스콥의 영역을 지정하지 않고 el을 사용하면서 abc 에 접근시? </h5>
	ㅇ ${abc}
	
	
</body>
</html>