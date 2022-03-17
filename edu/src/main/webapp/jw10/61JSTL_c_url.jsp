<%@ page contentType="text/html;charset=euc-kr" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<h3>ㅇc:url을 이용하여 URL을 만들어(??)보면 </h3>

	<c:url var ="url1" value="/jw10/11JSTL_c_set.jsp" />

	<c:url var = "url2" value = "http://127.0.0.1:8080/edu/jw10/52JSTL_c_import.jsp" scope="session" >
		<c:param name="name" value="value" />
	</c:url>
	
	<c:url var ="url3" value="http://www.daum.net" />

	1. url을 출력하면<br/>
		url1 : ${ url1 }<br/>
		url2 : ${ url2 }<br/>
		url3 : ${ url3 }<br/>
		
		<br/><br/><br/><br/>

	 2. c:url , c:import 동시 사용해보면...<br/>
		<c:import var="importPage" url="${ url2 }" scope="request" />
		${ importPage  }
		
		<br/><br/><br/><br/>

	3. sessionObect에 저장된 url2 사용하기<br/>
		<a href="${ sessionScope.url2 }">어디로 링크가 걸려있나 확인하자...</a> 