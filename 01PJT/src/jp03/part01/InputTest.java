package jp03.part01;


import java.io.*;

public class InputTest{

	///Main method
	public static void main(String args[]){

		System.out.println(args[0]);
		
		InputStream inputStream = System.in;

		System.out.println("�Է��� ��ٸ��ϴ�.......");

		try{
			while(true){

				int i = inputStream.read();
				char c = (char)i;

				System.out.println("�Է��Ͻ� �� : "+c);

				if(c=='x'){
					inputStream.close();
					break;
				}

		} 
	
	}catch(IOException e){
		e.printStackTrace();
	}

	}//end of main

}//end of class
