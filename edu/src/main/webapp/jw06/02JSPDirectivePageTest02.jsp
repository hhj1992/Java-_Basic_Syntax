
<%@ page contentType="text/html;charset=euc-kr" %>

<!-- 	1. �Ʒ��� page ������ �ּ�ó�� �� / �� ���� :  ������ Ȯ�� -->
<%@ page errorPage="03JSPErrorPage.jsp" %> 

<%-- 
	   2. ���� errorPage=path �� �Ʒ��� ���� path �� ���� Ȯ�� 
			 :: 404 Error�� �߻��ϴ� ���� ����
	<%@ page errorPage="http://127.0.0.1:8080/edu/jw06/03JSPErrorPage.jsp" %>
	<%@ page errorPage="/edu/jw06/03JSPErrorPage.jsp" %>
	<%@ page errorPage="/jw06/03JSPErrorPage.jsp" %>

	<%@ page errorPage="edu/jw06/03JSPErrorPage.jsp" %>
	<%@ page errorPage="jw06/03JSPErrorPage.jsp" %>
	<%@ page errorPage="/03JSPErrorPage.jsp" %>
	
	==> web application(ContextRoot :: /edu) ���� ���(?)
 --%>


<!-- 3. ���������� I/O Buffer�� ������� Ȯ��
		   :: �ּ��� Ǯ�� ����, �ּ� ó�� �� ���� ������ Ȯ��  -->
  <%-- <%@page buffer="none" %> --%>
  <%@page buffer="8kb"  autoFlush="true"%>

<html>
<body>

	�ȳ��ϼ���  html ����<br/>
    buffer ��ü ũ��  : <%= out.getBufferSize() %><br/>
	buffer �ܿ� ũ��  : <%= out.getRemaining() %><br/>
	
	<hr/>
	������ Exception �߻�...

	<% int number=0; %>
	<% number = Integer.parseInt("a"); %>
	<%="number : "+number %>
	<hr/>
	
	�ȳ��ϼ���  html ��<br/>

</body>
</html>