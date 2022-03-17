package homework.work11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.List;
import java.util.Vector;

public class FileCalculator {

	public static void main(String[] args) throws Exception {
		
		FileCalculator fc = new FileCalculator();
		fc.addCalculateResult("D:\\test.dat");
		
	}
	
	public void addCalculateResult(String inputFileName) throws Exception{
		String oneLine = "";
		int sum = 0;
		int multi = 1;
		BufferedReader br = new BufferedReader(new FileReader(inputFileName));
		
		List <Integer>v = new Vector<Integer>();
		
		while((oneLine = br.readLine())!=null) {
			
			if(oneLine.length()==0) {
				break;
			}
			v.add(Integer.parseInt(oneLine));
		} // end of while
		
		br.close();
		
		for(int i = 0; i<v.size();i++) {
			
			sum += ((Vector<Integer>) v).elementAt(i);	
			multi *= ((Vector<Integer>) v).elementAt(i);
		}
	
		String str = String.valueOf(sum);
		String str2 = String.valueOf(multi);
		
		BufferedWriter bw = new BufferedWriter(new FileWriter(inputFileName,true));
		
		bw.write(str);
		bw.newLine();
		bw.write(str2);
		bw.newLine();
		
		bw.flush();
		bw.close();
	} // end of addCalculateResult
}// end of class
