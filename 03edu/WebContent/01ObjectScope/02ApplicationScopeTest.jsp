<%@ page contentType="text/html;charset=EUC_KR" %>

<%
	// :: ���尴ü : request,session,out,application ���
	// :: Scriptlet, Expression Tag ���� ��� ����

	// 1. application Object Scope  "count" ����.
	Integer count = (Integer)application.getAttribute("count");

	// 2. ���ٸ�..
	//==> name : "count"  value : new Integer(1)  
	if(count == null){
		out.println(" :: �ش� ������ 1 ��° ��� ::");
		application.setAttribute("count",new Integer(1));
	}
	
	// 3. �ִٸ�..
	//==> application ObjectScope  ������ ���
	//==> count ���� ����(+1)  �ٽ� application ObjectScope ����
	else{
		int changeCount = count.intValue()+1;
		out.println("::  �ش� ������ "+changeCount+" ��° ��� ::");

		application.setAttribute("count",new Integer(changeCount) );
	}
%>