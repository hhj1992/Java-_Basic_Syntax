<%@page contentType="text/html; charset=EUC-KR" %>
<%@page pageEncoding="EUC-KR"%>

<%@page import="org.json.simple.JSONObject"%>
<%@page import="org.json.simple.JSONArray"%>

<% 
	//==>�ѱ�ó��(POST)	 ::  UTF-8�� encoding
	request.setCharacterEncoding("UTF-8");
	String name =  request.getParameter("name");
	String phone = request.getParameter("phone");
	
	//==> �ּҸ� ���Ƿ� �߻���Ű��...
	String address ="";
	int random = new java.util.Random().nextInt(3);
	if( random ==0 ){
		address = "����";
	}else if( random ==1 ){
		address = "�λ�";
	}else{
		address = "���ֵ�";
	}
%>

<%
	 System.out.println("postJSON-orderServer.jsp  ::   �̸�="+name+" �ּ�="+address+" ��ȭ="+phone);
	
	//==> json_simple.jar library�� �̿��ϸ�....
	//==> 1. name= value Notation
	JSONObject obj = new JSONObject();
	obj.put("name",name);
	obj.put("phone",phone);
	obj.put("address",address);
	//==>console��� ����� Ȯ������.
	System.out.println(obj);
%>

















<%= obj  %>

<%--
�̸� : <%= name %> ����
��ȭ : <%= phone %>
�ּ� : <%= address %>
 --%>


