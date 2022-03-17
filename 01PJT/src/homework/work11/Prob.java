package homework.work11;

public class Prob {

	public static void main(String[] args) {
		
		Prob p1 = new Prob();
		System.out.println("입력 : korea");
		System.out.println("출력 : "+p1.toEncoding("Korea"));
		System.out.println("입력 : 홍길동");
		System.out.println("출력 : "+p1.toEncoding("홍길동"));
		System.out.println("입력 : 홍 길 동");
		System.out.println("출력 : "+p1.toEncoding("홍 길 동"));
		System.out.println("입력 : Hong 길 동");
		System.out.println("출력 : "+p1.toEncoding("Hong 길 동"));
		System.out.println("입력 : 0319");
		System.out.println("출력 : "+p1.toEncoding("0319"));
		
		
		
	}// end of main

public String toEncoding(String str) {
	
	String result = "";
	
	for(int i = 0; i<str.length(); i++) {
		
		char c = str.charAt(i);
		
		
	}
	
	return null;


} // end of toEncoding
} // end of class 
