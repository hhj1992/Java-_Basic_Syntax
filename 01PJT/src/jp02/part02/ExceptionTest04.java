package jp02.part02;

public class ExceptionTest04{

///field
private int sum;
private int avg;

///constructor

public ExceptionTest04(){
}


public void sum(int x, int y){
	System.out.println("1.==> sum ����");
	sum = x + y;
	System.out.println("1.==> �� : " +sum);
	System.out.println("1.==> sum ��");
}

public void avg(int z) throws ArithmeticException{
	System.out.println("2.==> avg ����");
	avg = sum / z;
	System.out.println("2.==> ��� : " + avg);
	System.out.println("2.==> avg ��");
}


public static void main(String[] args){

	int i = Integer.parseInt(args[0]);
	int j = Integer.parseInt(args[1]);
	int k = Integer.parseInt(args[2]);

	ExceptionTest04 et = new ExceptionTest04();
	et.sum(i,j);

try{
	et.avg(k);
	//}catch(ArithmeticException e){
	 }catch(Exception e){   // Object e �� �ȵǴ� ������ Object�� printStackTrace�� ��� ���� �ʴ´�.
 		 System.out.println("1.>> ==========================");
		 System.out.println("et.avg(k)���� Exception�� �߻��� ���");
		 System.out.println("2.>> ==========================");
		 System.out.println(e);
		 System.out.println("3.>> ==========================");
		 e.printStackTrace();
		 System.out.println("4.>> ==========================");
}
	System.out.println("main Method End....");

}
}