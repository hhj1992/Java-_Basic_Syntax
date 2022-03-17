package jp03.part03;

import java.io.*;

/*
FileName : FileReaderTest01.java
*/

public class FileReaderTest01{

public static void main(String[] args){

FileReader fr = null;

int readCount=0;

try{
 	fr = new FileReader(args[0]);

	while(true){
		int i = fr.read();

		if( i == -1){
			break;
		}
		
		char c = (char)i;
		System.out.print(c);

		readCount++;
	}
 	}catch(FileNotFoundException e){
	e.printStackTrace();
	}catch(IOException e1){
	e1.printStackTrace();
	}finally{
		
		System.out.println("\n\n=========================");
		System.out.println("=====>>> readÈ½¼ö readCount : " + readCount);
		System.out.println("\n\n=========================");
		try{
			fr.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


} // end of main 
} // end of class