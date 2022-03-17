<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<%request.setCharacterEncoding("euc-kr"); %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:forEach var ="i" items="${paramValues.sw }">
	ㅇ 선택하신 sw는 ${i }<br/>
</c:forEach>

<hr/>

<c:forEach var ="i" items="${param}">
	ㅇ key : ${i.key} // value : ${i.value}<br/>
</c:forEach>

<hr/>


<c:forEach var ="i" items="${param}">
	<c:if test ="${i.key == 'name'}" >
		ㅇ${param.name}님의 나이는 ${param.age}입니다.<br/>
	</c:if>
</c:forEach>
궁금한것 : _${name}_ <br/>
_${pageContext.request}_

<hr/>

