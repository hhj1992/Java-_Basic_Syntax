<%@page contentType="text/html; charset=EUC-KR" %>
<%@page pageEncoding="EUC-KR"%>

<%@page import="org.json.simple.JSONObject"%>
<%@page import="org.json.simple.JSONArray"%>

<%
	//==> json_simple.jar library�� �̿��ϸ�....
	//==> 1. name= value Notation
	JSONObject obj = new JSONObject();
	obj.put("aaa","aaa");
	obj.put("bbb","bbb");

 	//==> 2. array Notation
	JSONArray array = new JSONArray();
	array.add("z");
	array.add("zz");
	array.add("zzz");
	
 	//==> 3. name=value �� array�� ȥ��
	obj.put("ccc",array);
	
 	//==>console��� ����� Ȯ������.
	System.out.println(obj);

 %>

<%= obj %>