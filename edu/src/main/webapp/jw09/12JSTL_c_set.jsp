<%@ page contentType="text/html; charset=euc-kr"%>
<!-- JSTL ��� : taglib ������ ���� -->
<%@ taglib prefix ="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!--  :: JSTL c:set : Bean ���� ObjectScope ���� -->
<c:set var="client" value="<%=new jw09.Client() %>" scope="session"/>

<h3>#EL �̿� ObjectScope�� ����� Bean ����</h3>
1.session ObjectScope ����� client ��ü�� name : ${sessionScope.cilent.name}<br/>
2.session ObjectScope ����� client ��ü�� addr : ${client.addr}<br/>
3.session ObjectScope ����� client ��ü�� age : ${cilent.age}<br/>
4.session ObjectScope ����� client ��ü�� info �迭�� empty : ${empty cilent.info}<br/>
5.session ObjectScope ����� client ��ü�� info �迭 ������ value<br/>
5.info �迭�� index 0 value: ${sessionScope.client.info[0]}<br/>
5.info �迭�� index 1 value: ${client.info[1]}<br/><hr/>

<h3>#��ũ��ƮƮ�� �̿� ObjectScope �� ����� Bean ����</h3>
<%
	jw09.Client c = (jw09.Client)session.getAttribute("client");
	out.println("�̸� :" + c.getName()+"<br/>");
	out.println("�ּ� :" + c.getAddr());
%><br/><hr/>

<%--Call By Value / Call By Reference
	=>�Ʒ��� ������ �����Ͽ� ��°���� ����
	A a1 = new A();
	A a2 = a1; --%>

<!--  ::JSTL : session ObjectScope ����� client �� test�� �ٽ� ���� (?) -->
<c:set var="test" value="${client}" scope="session"/>

<h3>#EL �̿� Object�� ����� Bean ����</h3>
1. session ObjectScope ����� client ��ü�� name : ${client.name} <br/>
1. session ObjectScope ����� test ��ü�� name : ${test.name}<br/><hr/>


<h3> ::ObjectScope ����� test Bean setter Method ȣ��(ȫ�浿�� �̼������� ����)<br/>
	 ::Call By Reference ����ϸ�...</h3>
<c:set target="${test}" property="name" value="�̼���"/>
	2. session ObjectScope ����� client ��ü�� name : ${client.name}<br/>
	2. session ObjectScope ����� test   ��ü��name : ${test.name}<br/><br/>
	
<h3>:: JSTL c:remove ObjectScope ����� test remove </h3>
remove�� client ��ü�� empty : ${empty sessionScope.client}<br/>
Session�� ����� client ��ü remove <br/>
<c:remove var="client" scope="session"/>
remove�� client ��ü�� empty : ${empty client} <br/><hr/>
remove���� ���� test ��ü�� empty : ${empty test} <br/><hr/>