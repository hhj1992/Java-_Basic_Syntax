<%@ page contentType="text/html;charset=euc-kr" %>

<!-- Declaration Tag : method, Field(member variable)���� -->
<%!
	///Field
	int count=0;
	///Method
	public int gugudan(int i,int j){
		return i*j;
	}
%>

<html>
<head></head>

<body>
<h2>1. �������� ����մϴ�.</h2><br/>
<%--
<% for(int i=1;i<10;i++){	%>
		<%= i+" ���� ����մϴ�." %><br/>
	<%for(int j=1;j<10;j++) {  %>
			<%= i+" X "+j+ " = "+ i*j %><br/>
	<%} %>
<% }%>											
 --%>
<!-- ���� Scriptlet , Expression tag ����� �Ͱ� �Ʒ��� coding �� -->
<%--
	<% 
		for(int i=1;i<10;i++){	
			out.println ( i+" ���� ����մϴ�. <br/>");
			for(int j=1;j<10;j++) {
				out.println( i+" X "+j+ " = "+ i*j+"<br/>" );
			} 
		}
	%>
 --%>
	<% for(int i=1;i<10;i++){%>	
		<%=i%> ���� ����մϴ�.<br/>
		<%for(int j=1;j<10;j++) {%>
			<%=i%>X<%=j %> = <%=i*j %><br/>
		<%} %> 
	<%}%>
	

<hr/><hr/>

<h2>2. gugudan() method  ��� ������ ���.</h2><br/>

<% for(int i=1;i<10;i++){	%>
		<%= i+" ���� ����մϴ�." %><br/>
		<%	for(int j=1;j<10;j++) {  %>
			<%= this.gugudan(i,j) %><br/>
		<%} %>		
<% }%>	

</body>
</html>