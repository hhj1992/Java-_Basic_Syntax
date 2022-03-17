
<%@ page contentType="text/html;charset=euc-kr" %>

<!-- 
	1. error 를 처리하는 page 는  isErrorPage 속성 : true 로 설정
	2. error 를 처리하는 page 는 반드시 true 로 설정한다면 default 는 ? 
-->
<%@ page isErrorPage="true" %>

<% System.out.println("03JSPErrorPage.jsp시작");  %>

	<br/>
	<hr/>
	여기는 error page 시작 <br/><br/>

	exception : <%= exception %><br/>
	exception.toString() : <%= exception.toString() %><br/>
	exception.getMessage() : <%= exception.getMessage() %><br/><br/>
	
	여기는 error page 끝 <br/>
	<hr/>
	<br/>

<% System.out.println("03JSPErrorPage.jsp 끝");  %>