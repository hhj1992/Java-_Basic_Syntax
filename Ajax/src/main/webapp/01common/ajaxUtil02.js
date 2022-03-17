var request = null;

//request ���� function Definition	 	 	
function createRequest(){	 	
	try{
		request = new XMLHttpRequest();
		alert ("XMLHttpRequest() �� request instancet�����Ϸ�");
		}catch(trymicrosoft){
		try{
			request = new ActiveXObject("Msxml2.XMLHTTP");
			alert ("ActiveXObject(Msxml2.XMLHTTP) �� request instancet�����Ϸ�");
		}catch(othermicrosoft){
			try{
				request =new ActiveXObject("Microsoft.XMLHTTP");
				alert ("new ActiveXObject(Microsoft.XMLHTTP) �� request instancet�����Ϸ�");
			}catch(failed){
				request = null;
			}
		}
	}
	if( request == null ){
		alert ("request��ü ������ error �߻���.");
	}
} 


//==> open() / callback Method���� / send()�� ó���ϴ� fuction Definition
function openSendRequest(httpURL, httpMETHOD, httpPARAM, callBackMethod){
	
	//url ����
	var url = httpURL;
	//alert("1. url : "+url);
	
	//http method ����
	var method = (httpMETHOD == "POST") ? "POST" : "GET";
	//alert("2. Method : "+method);
	
	//param ����(QueryString)
	var param = httpPARAM;
	if( method == "GET" && param != null){
		url = url+"?"+param;
	}
	//alert("3. Param : "+param+" url : "+url);
	
	//callback ���� 
	var callBack = callBackMethod;
	//alert("4. callBack : "+callBack);
	
	//request�� Get/Post���,�ش�url,�񵿱�� ������ ���� ����(�����ʱ�ȭ)
	request.open(method,url,true);
	
	//send() ȣ���� �Ʒ��� �Ӽ��� ���� respons�� callBack Method ����			
	request.onreadystatechange =  callBack;

	//request�� data���� header����
	request.setRequestHeader('Content-Type','application/x-www-form-urlencoded');
	
	//Post����� ��� Param ����
	param = (method == "POST") ? param : null;
	//alert("5. param : "+param);
	request.send( param );
}


//trim ���� Function
function trim(str) {  
  		return str.replace(/^\s\s*/, '').replace(/\s\s*$/, '');  
}  