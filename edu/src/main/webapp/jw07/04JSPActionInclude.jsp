<%@ page contentType="text/html;charset=euc-kr" %>

<html>
<body>

::  04JSPActionInclude.jsp ���� <br/>

<%
	// Scriptlet tag ���� ���� :: service() Method  local variable
	String value = "local variable";

	// request,session,application  ObjectScope  Data ����
	request.setAttribute("aaa",value);
	session.setAttribute("bbb",new String("session ObjectScope ����� ���ڿ�"));
	application.setAttribute("ccc",new String("application ObjectScope ����� ���ڿ�"));
%>

<jsp:include  page="05JSPActionInclude.jsp"/>
::  04JSPActionInclude.jsp �� <br/>

</body>
</html>