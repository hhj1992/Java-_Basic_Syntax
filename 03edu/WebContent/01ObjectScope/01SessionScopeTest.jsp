<%@ page contentType="text/html;charset=EUC_KR" %>

<%
	// :: ���尴ü : request,session,out,application ���
	// :: Scriptlet, Expression Tag ���� ��� ����

	// 1. session Object Scope  "count" ����.
	Integer count = (Integer)session.getAttribute("count");

	// 2. ���ٸ�..
	//==> name : "count"  value : new Integer(1)  
	if(count == null){
		out.println(" :: Browser �Ѱ� 1 ��° �湮 ::");
		session.setAttribute("count",new Integer(1));
	}
	
	// 3. �ִٸ�..
	//==> session ObjectScope  ������ ���
	//==> count ���� ����(+1)  �ٽ� session ObjectScope ����
	else{
		int changeCount = count.intValue()+1;
		out.println(":: Browser �Ѱ� "+changeCount+" ��° �湮 ::");

		session.setAttribute("count",new Integer(changeCount) );
	}
%>