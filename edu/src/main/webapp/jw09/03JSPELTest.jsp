<%@ page contentType="text/html; charset=euc-kr"%>
<% request.setCharacterEncoding("EUC_KR");%>
<h3>ㅇ EL 내장객체를 사용</h3><p/>

1.pageContext EL 내장객체를 이용한 requestURI : ${pageContext.request.requestURI}<br/>

2.pageContext EL 내장객체를 이용한 sesssion의 id : ${pageContext.session.id}<br/>

3.Expression tag를 사용 : <%=pageContext.getSession().getId()%><br/>

4.이름 : <%=request.getParameter("name")%><br/>

5.주소 : ${param.addr} <br/>


<% String[] sw = request.getParameterValues("sw");%>
6.선택한 소프트웨어 : <%=sw[0] %><br/>
6.선택한 소프트웨어 : ${paramValues.sw[1]}<br/>
6.선택한 소프트웨어 : ${paramValues.sw[2]}<br/><hr/>
<%--
	::<%=sw[2]%> 경우
	::Client가 선택한것이 없다면 .. : NullPointerException / ArrayIndexOutOfBoundException
--%>

<h5>ㅇ EL Cookie 내장객체 : Map 형식</h5>
7.쿠키에 저장된 JSESSIONID name : ${cookie.JSESSIONID.name}<br/>
7.쿠키에 저장된 JSESSIONID value : ${cookie.JSESSIONID.value}<br/>
