package jp02.part03;

/*
 * FileName : ExcpetionTest06.java 
 */
public class ExceptionTest06{	

	///Field
	private int sum;
	private int avg;
	
	///Constructor	
	public ExceptionTest06(){
	}

	///Method
	public void sum(String[] args){
		for(int i = 0 ; i<args.length ; i++){
			sum += Integer.parseInt(args[i]);
		}
		System.out.println("합 : "+sum);
	}
	public void avg(int z){
		avg = sum / z;
		System.out.println("평균 : "+avg);
	}

	///main method
	public static void main(String[] args){
		
		//인자가 유무 판단 ::  data 갯수의 validate check
		if(args.length == 0){
			System.out.println("usage : java num1 num2 num3....");
			System.exit(0);
		}

		//Exception 활용 숫자인지 판단 :: validate check
		try{
		  for(int i = 0 ; i<args.length ; i++){
			Integer.parseInt(args[i]);
		  }
		}catch(NumberFormatException nfe){
		   System.out.println("usage : 인자값은 숫자이여야 합니다.");
		   System.exit(0);
		}

		ExceptionTest06 et = new ExceptionTest06();
		et.sum(args);
		et.avg(args.length);
		
		System.out.println("main Method End....");
		
	}//end of main
	
}//end of class