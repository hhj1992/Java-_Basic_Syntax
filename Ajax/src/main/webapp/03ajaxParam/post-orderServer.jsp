<%@page contentType="text/html; charset=EUC-KR" %>
<%@page pageEncoding="EUC-KR"%>

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
	 System.out.println("post-orderServer.jsp  ::   �̸�="+name+" �ּ�="+address+" ��ȭ="+phone);
%>
�̸� : <%= name %> ����
��ȭ : <%= phone %>
�ּ� : <%= address %>