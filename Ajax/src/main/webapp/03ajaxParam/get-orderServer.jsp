<%@page contentType="text/html; charset=EUC-KR" %>
<%@page pageEncoding="EUC-KR"%>

 <%@page import="java.io.*" %>

<%
	//==> �ѱ�ó�� NG
	//String name =  request.getParameter("name");
	//==> �ѱ�ó�� OK
	String name =  this.convertKo(request.getParameter("name"));
	
	String phone = request.getParameter("phone");
	
	System.out.println( request.getQueryString());
	
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
	 System.out.println("get-orderServer.jsp  ::   �̸�="+name+" �ּ�="+address+" ��ȭ="+phone);
%>
�̸� : <%= name %> ����
��ȭ : <%= phone %>
�ּ� : <%= address %>


<%!
	///Method //==>�ѱۺ�ȯ(GET) 
	private String convertKo(String paramValue){
		String convertParamValue = null;
		try{
			//==> API�� Ȯ�ο��
			byte[] b = paramValue.getBytes("8859_1");
			convertParamValue = new String(b,"EUC_KR");
		}catch(UnsupportedEncodingException uee){
			System.out.println("�ѱ� ��ȯ�� Exception �߻�");
			uee.printStackTrace();
		}
		return convertParamValue;
	}
%>