<%@page contentType="text/html; charset=EUC-KR" %>
<%@page pageEncoding="EUC-KR"%>

<%--
		//JSON(JavaScript Object Notation)
	 	//==> 1. name= value Notation
	 	var test01 ={ a:'a', b:'b', c:'c'};
	 	
	 	//==> 2. array Notation
	 	var test02 =[ 'aa', 'bb', 'cc' ];

	 	//==> 3. name=value �� array�� ȥ��
--%>


{
	"aaa":"aaa",
	"bbb":"bbb",
	"ccc": [ "z","zz","zzz"]
}
<%-- 
	- client ���� parseJSON() ���� Error �� �߻��ϸ�..
	- �Ʒ��� ���� �Ѵٸ�...
{
	aaa:'aaa',
	bbb:'bbb',
	ccc: [ 'z','zz','zzz']
}
 --%>