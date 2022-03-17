<%@ page contentType="text/html; charset=euc-kr"%>
<%--�Ʒ������� Servlet Controller�� ȭ�鱸�� ���� ObjectScope�� �����Ѱ����� ����--%>
<%
//session ObjectScope����
session.setAttribute("client", new jw09.Client());
%>

<!-- 1. Scripttlet Tag �̿� ȭ�� ����-->
<%
	out.println("<h3>1. Scriptlet Tag �̿� Session ���� Bean(Data) ȭ�� ����</h3>");

	jw09.Client client = (jw09.Client)session.getAttribute("client");
	
	out.println("�̸� :" + client.getName()+"<br/>");
	String[] info = client.getInfo();
	for(int i=0; i<info.length; i++){
		out.println("info �迭�� index["+i+"] :" + info[i] + "<br/>");
	}
%>

<!-- 2. EL�̿� ȭ�� ���� -->
<hr/>
<h3>2.EL �̿� session ���� Bean(Data) ȭ�� ����</h3>
name : ${sessionScope.client.name}<br/>
addr : ${client.addr}<br/>
age : ${client.age}<br/>

info �迭�� empty : ${empty client.info}<br/>

info �迭�� index 0 value : ${sessionScope.client.info[0]}<br/>
info �迭�� index 1 value : ${client.info[1]}<br/>

<!--  EL�� Ư¡ : OnjectScope, Bean, Collection ���ٿ��� -->