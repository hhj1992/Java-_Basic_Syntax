<%@ page contentType="text/html; charset=euc-kr"%>
<% request.setCharacterEncoding("EUC_KR");%>
<h3>�� EL ���尴ü�� ���</h3><p/>

1.pageContext EL ���尴ü�� �̿��� requestURI : ${pageContext.request.requestURI}<br/>

2.pageContext EL ���尴ü�� �̿��� sesssion�� id : ${pageContext.session.id}<br/>

3.Expression tag�� ��� : <%=pageContext.getSession().getId()%><br/>

4.�̸� : <%=request.getParameter("name")%><br/>

5.�ּ� : ${param.addr} <br/>


<% String[] sw = request.getParameterValues("sw");%>
6.������ ����Ʈ���� : <%=sw[0] %><br/>
6.������ ����Ʈ���� : ${paramValues.sw[1]}<br/>
6.������ ����Ʈ���� : ${paramValues.sw[2]}<br/><hr/>
<%--
	::<%=sw[2]%> ���
	::Client�� �����Ѱ��� ���ٸ� .. : NullPointerException / ArrayIndexOutOfBoundException
--%>

<h5>�� EL Cookie ���尴ü : Map ����</h5>
7.��Ű�� ����� JSESSIONID name : ${cookie.JSESSIONID.name}<br/>
7.��Ű�� ����� JSESSIONID value : ${cookie.JSESSIONID.value}<br/>
