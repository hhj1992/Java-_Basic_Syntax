<%@ page contentType="text/html;charset=euc-kr" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<h3> :: c:import / include 지시자 /  jsp:include 비교</h3><br/>
<!--  include 지시자 /  jsp:include 	:  동일Context 만 가능  
       c:import  									:  다른 Context 가능. 	-->

<%	request.setAttribute("data",new String("reqeust Object Scope 저장 문자열")); %>

	1. 동일 Context  page include<br/>
		<c:import var="importPage1" url="/jw10/52JSTL_c_import.jsp" scope="request" />
		${ importPage1 }
		<br/><br/><br/>

	2. 동일 Context  page include & param으로 data전송 <br/>
		<c:import var="importPage2" url="/jw10/52JSTL_c_import.jsp" scope="request" >
			<c:param name="name" value="value"/>
		</c:import>
		${ importPage2 }
		<br/><br/><br/>

	3. 다른 context  page include<br/><br/>
	<!-- 아래의 주석을 풀고 확인하자...-->
<%--
		<c:import var="daumPage" url="http://www.daum.net" />
		${ daumPage }
--%>