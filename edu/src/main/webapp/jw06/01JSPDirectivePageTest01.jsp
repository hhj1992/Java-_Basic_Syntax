<%@ page contentType = "text/html; charset=euc-kr"%>
<%@ page import = "java.util.*"%>

<%@ page language="java"%>
<%@ page info="처음작성하는 JSP"%>

<%@ page session ="true"%>
<%@ page isThreadSafe="true"%>

<%--
<%@ page extends = "java.util.Vector"%>
--%>
	
<%
	String value="지역변수";
	System.out.println(":: " + value);

	Calendar calendar = Calendar.getInstance();
	int year = calendar.get(Calendar.YEAR);
	System.out.println(":: " + year + "년");

	String info = getServletInfo();
	System.out.println(":: information" + info);

%>	

<html>
<head></head>
	<body>
		안녕하세요 html 시작 <br/>
		<hr/>
		<%= ":: " + value%><br/>
		<%= ":: " + year%><br/>
		<%= ":: information :" + info%><br/>
		<hr/>
		안녕하세요 html 끝<br/>
	</body>
</html>