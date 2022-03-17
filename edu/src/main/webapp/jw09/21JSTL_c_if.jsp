<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

   <%request.setCharacterEncoding("euc-kr"); %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<h3>JSTL c:if�� ���</h3>

<c:if test="true" >
	if�� ����1 <br/>
</c:if>

<h3>Form data ó��</h3>
1. �̸� : <%=request.getParameter("name") %><br/>
<hr/>
2. �̸� : ${param.name}<br/>

<c:if test="${!empty param.name}">
	${param.name}�� ȯ���մϴ�<br/>
</c:if>

<c:set var="level" value="����" scope="session"/>

<c:if test="${param.age < 19}">
	<c:set var="level" value="û�ҳ�"/>
</c:if> 
<hr/>
5. ${param.name}���� ���̴� ${param.age} �� ${level}�Դϴ�.<br/>
session���� Ȯ�� : ${sessionScope.level }<br/>
pageScope���� Ȯ�� : ${pageScope.level }<br/>
default ������ Ȯ�� : ${level }<br/>
<hr/>
<c:if test="${!empty paramValues.sw[0] }">
	�����Ͻ� SW : ${paramValues.sw[0]}<br/>
</c:if>

<c:if test="${!empty paramValues.sw[1] }">
	�����Ͻ� SW : ${paramValues.sw[1]}<br/>
</c:if>


<c:if test="${!empty paramValues.sw[2] }">
	�����Ͻ� SW : ${paramValues.sw[2]}<br/>
</c:if>
<hr/>
<c:choose>
	 <c:when test="${param.age > 19}">
	 	7.${param.name}���� �������� ���� : ${param.age} 
	 </c:when>
	<c:when test="${param.age < 18}">
	 	7.${param.name}���� û�ҳ�����  ���� : ${param.age} 
	 </c:when>
	<c:otherwise>
		7.${param.name}���� û�ҳ�?,�?  ���� : ${param.age}
	</c:otherwise>
</c:choose>














