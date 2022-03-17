package jp03.part03;

import java.io.*;

public class FileInputStreamTest{
	

	///Main method
	public static void main(String args[]){

		FileInputStream fis = null;

		int readCount=0;
		
		try{
			fis = new FileInputStream(args[0]);

			while(true){
				int i = fis.read();

				if(i==-1){
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
			System.out.println("\n\n========================================");
			System.out.println("======>>> readÈ½¼ö readCount : "+readCount);
			System.out.println("=======================================");
			try{
				fis.close();
			}catch (Exception e){
				e.printStackTrace();
				}
		}

	}//end of main
}//end of class