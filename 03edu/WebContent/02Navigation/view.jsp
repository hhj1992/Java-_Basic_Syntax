<%@ page contentType="text/html;charset=euc-kr" %>
<%@ page pageEncoding="euc-kr" %>

<%@page import="spring.service.domain.User"%>

<html>
<body>
	
	1.Servlet ���� Request ObjectScope ������ ���� ��� .<br/>
	
	<% User user01 = (User)request.getAttribute("user01"); %>
	<% if(user01 != null) { %>
			��  ��  �� : <%=user01.getUserId()%><br/>
			��� ��ȣ : <%=user01.getUserPasswd()%><br/>
	<% }else{ %>
			Request ObjectScope �� ����� ������ �����ϴ�.
	<% } %>
	
	<hr/><hr/>
		
	2.Servlet ���� Session ObjectScope ������ ���� ��� .<br/>
	
	<% User user02 = (User)session.getAttribute("user02"); %>
	<% if(user02 != null) { %>
			��  ��  �� : <%=user02.getUserId()%><br/>
			��� ��ȣ : <%=user02.getUserPasswd()%><br/>
	<% }else{ %>
			Session ObjectScope �� ����� ������ �����ϴ�.
	<%} %>
	
	<hr/><hr/>
	
	3.Servlet ���� Application ObjectScope ������ ���� ��� .<br/>
	<% User user03 = (User)application.getAttribute("user03"); %>
	<% if(user03 != null) { %>
			��  ��  �� : <%= user03.getUserId()  %><br/>
			��й�ȣ : <%= user03.getUserPasswd()  %><br/>
	<%}else{ %>
			Application ObjectScope �� ����� ������ �����ϴ�.
	<%} %>		

</body>
</html>