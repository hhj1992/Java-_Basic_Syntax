<%@ page contentType="text/html; charset=euc-kr"%>
<%--아래내용은 Servlet Controller가 화면구성 위해 ObjectScope에 저장한것으로 생각--%>
<%
//session ObjectScope저장
session.setAttribute("client", new jw09.Client());
%>

<!-- 1. Scripttlet Tag 이용 화면 구성-->
<%
	out.println("<h3>1. Scriptlet Tag 이용 Session 저장 Bean(Data) 화면 구성</h3>");

	jw09.Client client = (jw09.Client)session.getAttribute("client");
	
	out.println("이름 :" + client.getName()+"<br/>");
	String[] info = client.getInfo();
	for(int i=0; i<info.length; i++){
		out.println("info 배열의 index["+i+"] :" + info[i] + "<br/>");
	}
%>

<!-- 2. EL이용 화면 구성 -->
<hr/>
<h3>2.EL 이용 session 저장 Bean(Data) 화면 구성</h3>
name : ${sessionScope.client.name}<br/>
addr : ${client.addr}<br/>
age : ${client.age}<br/>

info 배열은 empty : ${empty client.info}<br/>

info 배열의 index 0 value : ${sessionScope.client.info[0]}<br/>
info 배열의 index 1 value : ${client.info[1]}<br/>

<!--  EL의 특징 : OnjectScope, Bean, Collection 접근용이 -->