<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

   <%request.setCharacterEncoding("euc-kr"); %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<h3>c:forEach 이용 구구단 출력</h3>

1. c:forEach 중첩 이용 <br/>

<c:forEach var="i" begin="2" end="9" step="2">
	[${i} 단 출력 합니다] <br/>
	<c:forEach var="j" begin="1" end="10" step="1">
		${i } * ${j } = ${j*i } <br/>
	</c:forEach>
</c:forEach>


<h3>3. index 관리 Collection 접근</h3>

<%
java.util.Vector vector = new java.util.Vector();
vector.add("A");
vector.add("B");
vector.add("C");
vector.add("D");

System.out.println("================");
for (int i = 0 ; i < vector.size() ; i++){
	System.out.println((String)vector.get(i));
}
System.out.println("================");
for (Object obj : vector){
	System.out.println((String)obj);
}
System.out.println("================");
%>

<c:forEach var="i" items="<%=vector%>" begin ="0" step ="1" end ="10">
	::Vector저장 정보 추출 : ${i} <br/>
</c:forEach>
<br/>
<c:forEach var="i" items="<%=vector%>" begin ="1" step ="1">
	::Vector저장 정보 추출 :  ${i} <br/>
</c:forEach>
<br/>
<c:forEach var="i" items="<%=vector%>" begin ="0" step ="2">
	::Vector 저장 정보 추출 : : ${i} <br/>
</c:forEach>
<br/>
<c:forEach var="i" items="<%=vector%>" begin ="0" step ="1" end ="1">
	::Vector 저장 정보 추출 :  ${i} <br/>
</c:forEach><hr/>


<h3>4. key = value형식의 map의 value접근</h3><br/>
<%
	java.util.HashMap hasMap = new java.util.HashMap();
	hasMap.put("a","A");
	hasMap.put("b","B");
	hasMap.put("c","C");
	hasMap.put("d","D");
%>

<c:forEach var="i" items="<%=hasMap%>">
	::HashMap에 저장된 내용은 ?${i.key} = ${i.value} <br/>
</c:forEach><br/><hr/>

<h3>5. EL/ c:set, c:if 를 동시에 사용</h3><br/>
<c:set var="aaa" value="<%=hasMap %>"/>

<c:forEach var="i" items="${aaa}">
	<c:if test="${i.key == 'a'}">
	::key a 의 value : ${i.value}
	</c:if>
</c:forEach>










