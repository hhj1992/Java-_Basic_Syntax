package jp03.part01;

import java.io.*;

public class ReaderTest{

	///Main method
	public static void main(String args[]){

		try{


		InputStream inputStream = System.in;

		InputStreamReader reader = new InputStreamReader(inputStream);

		System.out.println("입력을 기다립니다.......");

		
		while(true){


				int i = reader.read();
				char c = (char)i;


				System.out.println("입력하신 값 : "+c);

				
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