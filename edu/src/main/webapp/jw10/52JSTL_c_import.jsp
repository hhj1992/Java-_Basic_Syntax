<%@ page contentType="text/html;charset=euc-kr" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<hr/>
<h3>
	:: 52JSTL_c_import.jsp 시작<br/>

	request ObjectScope Data 추출유무 : ${ requestScope.data }<br/>
	
	<c:if test="${ ! empty param.name }">
		Param 으로 전달된 value 추출 : ${ param.name }<br/>
	</c:if>

 	::52JSTL_c_import.jsp 끝
</h3>
<hr/>