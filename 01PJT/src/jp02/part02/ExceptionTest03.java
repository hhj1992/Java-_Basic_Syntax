package jp02.part02;

public class ExceptionTest03{

///field
private int sum;
private int avg;

///constructor
public ExceptionTest03(){
}


public void sum(int x, int y){
	System.out.println("1.==> sum ����");
	sum = x + y;
	System.out.println("1.==> �� : " +sum);
	System.out.println("1.==> sum ��");
}

public void avg(int z) throws ClassCastException{
	System.out.println("2.==> avg ����");
	
	avg = sum / z;
	System.out.println("2.==> ��� : " + avg);
	System.out.println("2.==> avg ��");
}


public static void main(String[] args){

	int i = Integer.parseInt(args[0]);
	int j = Integer.parseInt(args[1]);
	int k = Integer.parseInt(args[2]);

	ExceptionTest03 et = new ExceptionTest03();
	et.sum(i,j);

	et.avg(k);

	System.out.println("main Method End..");
}// end of main

} // end of class