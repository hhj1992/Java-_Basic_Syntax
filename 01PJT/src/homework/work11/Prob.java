package homework.work11;

public class Prob {

	public static void main(String[] args) {
		
		Prob p1 = new Prob();
		System.out.println("�Է� : korea");
		System.out.println("��� : "+p1.toEncoding("Korea"));
		System.out.println("�Է� : ȫ�浿");
		System.out.println("��� : "+p1.toEncoding("ȫ�浿"));
		System.out.println("�Է� : ȫ �� ��");
		System.out.println("��� : "+p1.toEncoding("ȫ �� ��"));
		System.out.println("�Է� : Hong �� ��");
		System.out.println("��� : "+p1.toEncoding("Hong �� ��"));
		System.out.println("�Է� : 0319");
		System.out.println("��� : "+p1.toEncoding("0319"));
		
		
		
	}// end of main

public String toEncoding(String str) {
	
	String result = "";
	
	for(int i = 0; i<str.length(); i++) {
		
		char c = str.charAt(i);
		
		
	}
	
	return null;


} // end of toEncoding
} // end of class 
