package homework.work11;

public class Prob2 {

	public static void main(String[] args) {
		String url1
		= "http://localhost/order?prodId=PROD-001&prodName=������3&price=980000";
		
		String prodName = getParameter(url1, "prodName");
		System.out.println("��ǰ �̸�: " + prodName);
		
		String url2
		= "http://localhost/registUser?userId=USER-001&userName=ȫ�浿&address=����� ������&userAge=26";
		
		String userAddress = getParameter(url2, "address");
		System.out.println("ȸ�� �ּ�: " + userAddress);
			
	}
	
	private static String getParameter(String url, String paramName) {
		
		String result=null;
		String str=null;	
		String[] temp = url.split("&");
	
	for(int i = 0; i < temp.length; i++) {
		
		str = temp[i];
		
		if(str.startsWith(paramName)==true) {
			String[] temp2 = str.split("=");
			result = temp2[1];
			break;
		}
	}
		return result;
	}

}
