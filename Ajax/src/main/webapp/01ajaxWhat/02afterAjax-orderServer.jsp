<%@page contentType="text/html; charset=EUC-KR" %>
<%@page pageEncoding="EUC-KR"%>

<%
	//==> �������� �������� reqeust�� 10�� ����
	Integer addr = (Integer)session.getAttribute("addr");
	if( addr == null ){
		addr = new Integer(100);
		session.setAttribute("addr",addr);
	}
	int addrValue = addr.intValue() + 10;
	session.setAttribute("addr",new Integer(addrValue));

	String phone =  request.getParameter("phone");

	//==> DBMS���� ��ȭ��ȣ ������ �̿��Ͽ� �ּҸ� �˻��ߴٰ� ����
	System.out.println("02afterAjax-orderServer.jsp  ::   ��ȭ="+phone+" ����="+addrValue);
%>

��ȭ��ȣ :  <%=phone%> ����
�ּ� : �����  <%= (addrValue) %> ���� �Դϴ�