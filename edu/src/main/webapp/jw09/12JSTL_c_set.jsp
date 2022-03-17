<%@ page contentType="text/html; charset=euc-kr"%>
<!-- JSTL 사용 : taglib 지시자 설정 -->
<%@ taglib prefix ="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!--  :: JSTL c:set : Bean 생성 ObjectScope 저장 -->
<c:set var="client" value="<%=new jw09.Client() %>" scope="session"/>

<h3>#EL 이용 ObjectScope에 저장된 Bean 접근</h3>
1.session ObjectScope 저장된 client 객체의 name : ${sessionScope.cilent.name}<br/>
2.session ObjectScope 저장된 client 객체의 addr : ${client.addr}<br/>
3.session ObjectScope 저장된 client 객체의 age : ${cilent.age}<br/>
4.session ObjectScope 저장된 client 객체의 info 배열은 empty : ${empty cilent.info}<br/>
5.session ObjectScope 저장된 client 객체의 info 배열 각각의 value<br/>
5.info 배열의 index 0 value: ${sessionScope.client.info[0]}<br/>
5.info 배열의 index 1 value: ${client.info[1]}<br/><hr/>

<h3>#스크립트트렛 이용 ObjectScope 에 저장된 Bean 접근</h3>
<%
	jw09.Client c = (jw09.Client)session.getAttribute("client");
	out.println("이름 :" + c.getName()+"<br/>");
	out.println("주소 :" + c.getAddr());
%><br/><hr/>

<%--Call By Value / Call By Reference
	=>아래의 내용을 참조하여 출력결과를 이해
	A a1 = new A();
	A a2 = a1; --%>

<!--  ::JSTL : session ObjectScope 저장된 client 을 test로 다시 저장 (?) -->
<c:set var="test" value="${client}" scope="session"/>

<h3>#EL 이용 Object에 저장된 Bean 접근</h3>
1. session ObjectScope 저장된 client 객체의 name : ${client.name} <br/>
1. session ObjectScope 저장된 test 객체의 name : ${test.name}<br/><hr/>


<h3> ::ObjectScope 저장된 test Bean setter Method 호출(홍길동을 이순신으로 변경)<br/>
	 ::Call By Reference 고려하면...</h3>
<c:set target="${test}" property="name" value="이순신"/>
	2. session ObjectScope 저장된 client 객체의 name : ${client.name}<br/>
	2. session ObjectScope 저장된 test   객체의name : ${test.name}<br/><br/>
	
<h3>:: JSTL c:remove ObjectScope 저장된 test remove </h3>
remove전 client 객체는 empty : ${empty sessionScope.client}<br/>
Session에 저장된 client 객체 remove <br/>
<c:remove var="client" scope="session"/>
remove후 client 객체는 empty : ${empty client} <br/><hr/>
remove하지 않은 test 객체는 empty : ${empty test} <br/><hr/>