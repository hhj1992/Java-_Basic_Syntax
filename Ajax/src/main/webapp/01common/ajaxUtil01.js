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