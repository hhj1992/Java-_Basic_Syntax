<%@page contentType="text/html; charset=EUC-KR" %>
<%@page pageEncoding="EUC-KR"%>

<!DOCTYPE html>
<html>

<head>
	<meta charset="EUC-KR">
</head>

<body>

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

<%	System.out.println("calcServerNormal.jsp(�������) sold ==>"+soldValue);%>

	<h1> �Ǹ� ����</h1>

		<table>
			<tr>
				<th>�Ǹŵ� ��ǰ ����</th>
				<td><span id="sold"><%= soldValue %></span></td>
			</tr>
			<tr>
				<th>��ǰ �ܰ�</th>
				<td><span id="price">100</span>��</td>
			</tr>
		</table>
		
		<h2>�� ����ݾ�  :  <span id="cash"><%= soldValue*100 %>��</span></h2>
		
		<form action="calcServerNormal.jsp" method="POST">
			<input type="submit" value="�Ǹź��� �ٽú���(�������)">
		</form>

</body>

</html>