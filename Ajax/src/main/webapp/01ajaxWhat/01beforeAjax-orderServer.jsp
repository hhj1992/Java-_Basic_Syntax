<%@page contentType="text/html; charset=EUC-KR" %>
<%@page pageEncoding="EUC-KR"%>

<%
	//==> ���Ƿ� �������� reqeust�� 10�� ����
	Integer addr = (Integer)session.getAttribute("addr");
	if( addr == null ){
		addr = new Integer(100);
		session.setAttribute("addr",addr);
	}
	int addrValue = addr.intValue() + 10;
	session.setAttribute("addr",new Integer(addrValue));

	String phone =  request.getParameter("phone");

	//==> DBMS���� ��ȭ��ȣ ������ �̿��Ͽ� �ּҸ� �˻��ߴٰ� ����
	 System.out.println("01beforeAjax-orderServer.jsp  ::   ��ȭ="+phone+" ����="+addrValue);
%>

<!DOCTYPE html>
<html>

<head>
	<meta charset="EUC-KR">
</head>

<body onload="document.forms[0].reset()">

	<form method="post" action="01beforeAjax-orderServer.jsp" >
	
		<p>�� ȭ �� ȣ :  
			<input type="text" size="14" name="phone" id="phone" value=<%=phone %> ></input>
		</p>
		
		<p>�� �� �� �� : </p>  
		<p>
			<textarea 	rows="4" cols="50" name="address" id="address" >
				<%="\n ��ȭ��ȣ :  "+phone+"����\n �ּ� : ����� "+ addrValue +" ���� �Դϴ�."%>
			</textarea>	
		</p>
		
		<p style="color: red;">����ȸ���� ��ȭ��ȣ �Է����ֹ���ư����������...</p>
		
		<p><input type="submit" value="�ֹ��ϱ�" id="submit"/></p>	
		
	</form>
	
</body>

</html>