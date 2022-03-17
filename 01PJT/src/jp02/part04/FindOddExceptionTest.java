package jp02.part04;

class FindOddException extends Exception{

	//Field

	//construction
	public FindOddException(){
		System.out.println("==>FindOddException Default Constructor");
	}
	public FindOddException(String msg){
		super(msg);
		System.out.println("==> 인자가 있는 FindOddException Constructor");
	}
}

public class FindOddExceptionTest{

	//Field

	//Constructor
	public FindOddExceptionTest(){
	}

	//Method
	//홀수가 입력되면 FindOddException 발생 시키는 Method
	public void test(int number) throws FindOddException{

		System.out.println(":: "+this.getClass().getName()+" start..");

		if(number % 2 == 0){
			System.out.println("입력하신 수 : "+number);
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