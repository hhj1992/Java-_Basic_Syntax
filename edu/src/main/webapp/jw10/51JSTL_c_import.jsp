<%@ page contentType="text/html;charset=euc-kr" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<h3> :: c:import / include ������ /  jsp:include ��</h3><br/>
<!--  include ������ /  jsp:include 	:  ����Context �� ����  
       c:import  									:  �ٸ� Context ����. 	-->

<%	request.setAttribute("data",new String("reqeust Object Scope ���� ���ڿ�")); %>

	1. ���� Context  page include<br/>
		<c:import var="importPage1" url="/jw10/52JSTL_c_import.jsp" scope="request" />
		${ importPage1 }
		<br/><br/><br/>

	2. ���� Context  page include & param���� data���� <br/>
		<c:import var="importPage2" url="/jw10/52JSTL_c_import.jsp" scope="request" >
			<c:param name="name" value="value"/>
		</c:import>
		${ importPage2 }
		<br/><br/><br/>

	3. �ٸ� context  page include<br/><br/>
	<!-- �Ʒ��� �ּ��� Ǯ�� Ȯ������...-->
<%--
		<c:import var="daumPage" url="http://www.daum.net" />
		${ daumPage }
--%>