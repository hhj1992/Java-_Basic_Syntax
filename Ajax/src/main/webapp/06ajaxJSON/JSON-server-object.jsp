<%@page contentType="text/html; charset=EUC-KR" %>
<%@page pageEncoding="EUC-KR"%>

<%@page import="org.json.simple.JSONObject"%>
<%@page import="org.json.simple.JSONArray"%>

<%
	//==> json_simple.jar library를 이용하면....
	//==> 1. name= value Notation
	JSONObject obj = new JSONObject();
	obj.put("aaa","aaa");
	obj.put("bbb","bbb");

 	//==> 2. array Notation
	JSONArray array = new JSONArray();
	array.add("z");
	array.add("zz");
	array.add("zzz");
	
 	//==> 3. name=value 와 array의 혼용
	obj.put("ccc",array);
	
 	//==>console출력 결과를 확인하자.
	System.out.println(obj);

 %>

<%= obj %>