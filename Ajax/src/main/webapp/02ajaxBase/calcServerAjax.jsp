<%@page contentType="text/html; charset=EUC-KR" %>
<%@page pageEncoding="EUC-KR"%>

<%
	//==> �������� ��ǰ�Ǹ� ���� reqeust�� 10���� ����
	Integer sold = (Integer)application.getAttribute("sold");
	
	if( sold == null ){
		sold = new Integer(100);
		application.setAttribute("sold",sold);
	}
	int soldValue = sold.intValue() + 10;
	application.setAttribute("sold",new Integer(soldValue));
%>

<% 	System.out.println("calcServerAjax(ajax����) sold ==>"+soldValue); %>

<%= soldValue %>