
<%@ page contentType="text/html;charset=euc-kr" %>

<!-- 
	1. error �� ó���ϴ� page ��  isErrorPage �Ӽ� : true �� ����
	2. error �� ó���ϴ� page �� �ݵ�� true �� �����Ѵٸ� default �� ? 
-->
<%@ page isErrorPage="true" %>

<% System.out.println("03JSPErrorPage.jsp����");  %>

	<br/>
	<hr/>
	����� error page ���� <br/><br/>

	exception : <%= exception %><br/>
	exception.toString() : <%= exception.toString() %><br/>
	exception.getMessage() : <%= exception.getMessage() %><br/><br/>
	
	����� error page �� <br/>
	<hr/>
	<br/>

<% System.out.println("03JSPErrorPage.jsp ��");  %>