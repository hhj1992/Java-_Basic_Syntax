
<%@ page contentType="text/html;charset=euc-kr" %>

<!-- 	1. 아래의 page 지시자 주석처리 전 / 후 실행 :  차이점 확인 -->
<%@ page errorPage="03JSPErrorPage.jsp" %> 

<%-- 
	   2. 위의 errorPage=path 를 아래의 각각 path 로 변경 확인 
			 :: 404 Error가 발생하는 이유 이해
	<%@ page errorPage="http://127.0.0.1:8080/edu/jw06/03JSPErrorPage.jsp" %>
	<%@ page errorPage="/edu/jw06/03JSPErrorPage.jsp" %>
	<%@ page errorPage="/jw06/03JSPErrorPage.jsp" %>

	<%@ page errorPage="edu/jw06/03JSPErrorPage.jsp" %>
	<%@ page errorPage="jw06/03JSPErrorPage.jsp" %>
	<%@ page errorPage="/03JSPErrorPage.jsp" %>
	
	==> web application(ContextRoot :: /edu) 에서 출발(?)
 --%>


<!-- 3. 내부적으로 I/O Buffer의 사용유무 확인
		   :: 주석을 풀고 실행, 주석 처리 후 실행 차이점 확인  -->
  <%-- <%@page buffer="none" %> --%>
  <%@page buffer="8kb"  autoFlush="true"%>

<html>
<body>

	안녕하세요  html 시작<br/>
    buffer 전체 크기  : <%= out.getBufferSize() %><br/>
	buffer 잔여 크기  : <%= out.getRemaining() %><br/>
	
	<hr/>
	인위적 Exception 발생...

	<% int number=0; %>
	<% number = Integer.parseInt("a"); %>
	<%="number : "+number %>
	<hr/>
	
	안녕하세요  html 끝<br/>

</body>
</html>