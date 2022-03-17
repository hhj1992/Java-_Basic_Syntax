<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

   <%request.setCharacterEncoding("euc-kr"); %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<h3>JSTL c:if을 사용</h3>

<c:if test="true" >
	if문 내부1 <br/>
</c:if>

<h3>Form data 처리</h3>
1. 이름 : <%=request.getParameter("name") %><br/>
<hr/>
2. 이름 : ${param.name}<br/>

<c:if test="${!empty param.name}">
	${param.name}님 환영합니다<br/>
</c:if>

<c:set var="level" value="성인" scope="session"/>

<c:if test="${param.age < 19}">
	<c:set var="level" value="청소년"/>
</c:if> 
<hr/>
5. ${param.name}님의 나이는 ${param.age} 로 ${level}입니다.<br/>
session으로 확인 : ${sessionScope.level }<br/>
pageScope으로 확인 : ${pageScope.level }<br/>
default 값으로 확인 : ${level }<br/>
<hr/>
<c:if test="${!empty paramValues.sw[0] }">
	선택하신 SW : ${paramValues.sw[0]}<br/>
</c:if>

<c:if test="${!empty paramValues.sw[1] }">
	선택하신 SW : ${paramValues.sw[1]}<br/>
</c:if>


<c:if test="${!empty paramValues.sw[2] }">
	선택하신 SW : ${paramValues.sw[2]}<br/>
</c:if>
<hr/>
<c:choose>
	 <c:when test="${param.age > 19}">
	 	7.${param.name}님은 성인으로 나이 : ${param.age} 
	 </c:when>
	<c:when test="${param.age < 18}">
	 	7.${param.name}님은 청소년으로  나이 : ${param.age} 
	 </c:when>
	<c:otherwise>
		7.${param.name}님은 청소년?,어른?  나이 : ${param.age}
	</c:otherwise>
</c:choose>














