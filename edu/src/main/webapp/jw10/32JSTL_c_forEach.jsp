<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<%request.setCharacterEncoding("euc-kr"); %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:forEach var ="i" items="${paramValues.sw }">
	�� �����Ͻ� sw�� ${i }<br/>
</c:forEach>

<hr/>

<c:forEach var ="i" items="${param}">
	�� key : ${i.key} // value : ${i.value}<br/>
</c:forEach>

<hr/>


<c:forEach var ="i" items="${param}">
	<c:if test ="${i.key == 'name'}" >
		��${param.name}���� ���̴� ${param.age}�Դϴ�.<br/>
	</c:if>
</c:forEach>
�ñ��Ѱ� : _${name}_ <br/>
_${pageContext.request}_

<hr/>

