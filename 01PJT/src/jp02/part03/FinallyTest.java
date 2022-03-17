package jp02.part03;

import java.io.*;

/*
*  FileName : Finallytest.java
*  
*	1.  try-catch-finally   의미 
*	2.  다중 catch 문을 이해 : 다중 catch  경우 Hierarchy 상위를 하부의 catch 기술 처리
*	3.  RuntimeException(Unchecked) / 그외 Exception( Checked ) 의 차이점 이해 
*	  ㅇ RuntimeExcetpion 하위: 컴파일시 check 하지 않는다.	==> UnChecked Exception
*     ㅇ 그외 Exception : 컴파일시 check, Compile Error  		==> Checked Exception
*/
public class FinallyTest{

	///Field
	private char[] c = new char[1024];
	private FileReader fileReader;

	///Constructor
	public FinallyTest(){
	}
	public FinallyTest(String fileName){
		this.fileRead(fileName); 
	}

	///method
	//1. 다중 catch 문의 이해 ==> 다중 catch 문 사용시 하위 Exception  먼저 처리
	//2. finally  이해           	 ==> Exception 발생유무와 관계없이 무조건 실행
	public void fileRead(String str){
		try{
			fileReader = new FileReader(str); 
			fileReader.read(c,0,1024);          
		}catch(FileNotFoundException e1){
			System.out.println("e1 : "+e1);
			System.out.println(str+" : File이 없습니다.");
		}catch(IOException e2){
			System.out.println("e2 : "+e2);
			System.out.println("read() method에서 Exception 발생");
		}catch(Exception e3){
			System.out.println("e3 : "+e3);
			System.out.println("모든 Exception 은 내가 잡느다.");
		}finally{
			System.out.println("여기는 fileRead() :: Exception이 발생하던 말던 나는 실행");
		}
	}
	
}//end of class