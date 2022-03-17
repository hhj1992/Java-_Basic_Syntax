package jp02.part04;

class FindOddException extends Exception{

	//Field

	//construction
	public FindOddException(){
		System.out.println("==>FindOddException Default Constructor");
	}
	public FindOddException(String msg){
		super(msg);
		System.out.println("==> ���ڰ� �ִ� FindOddException Constructor");
	}
}

public class FindOddExceptionTest{

	//Field

	//Constructor
	public FindOddExceptionTest(){
	}

	//Method
	//Ȧ���� �ԷµǸ� FindOddException �߻� ��Ű�� Method
	public void test(int number) throws FindOddException{

		System.out.println(":: "+this.getClass().getName()+" start..");

		if(number % 2 == 0){
			System.out.println("�Է��Ͻ� �� : "+number);
		}else{
			throw new FindOddException();
		}

		System.out.println(":: "+this.getClass().getName()+" end..\n");
	}

	//mainMethod
	public static void main(String args[]){
		FindOddExceptionTest met = new FindOddExceptionTest();
		try{
			met.test(10);
			met.test(11);
		}catch(FindOddException e){
			System.out.println("\n e : "+e);
		}
	}

}