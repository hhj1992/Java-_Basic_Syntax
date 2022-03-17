package jp03.part06;

import java.io.*;

/*
* FileName : ReadObjectFile.java
*
* ObjectInputStream�� �̿� Persistence data(File)�� �����
* ȸ�������� ���� UserVO instance�� (��ü�� ���¸� ���´�/����������) �о�´�.
*/
public class ReadObjectFile{

	//main
	public static void main(String[] args) throws Exception{

		//1. File���� instance�� ���� SinkStream :: FileInputStream ����
		//2. Instance �� �д� FilterStream : ObjectInputStream ����
		ObjectInputStream ois
			= new ObjectInputStream(new FileInputStream("UserInfo.obj"));

		UserVO user01 = (UserVO)ois.readObject(); // ==> API Ȯ�� ==> ����� ����ȯ ����?
		UserVO user02 = (UserVO)ois.readObject(); // ==> API Ȯ�� ==> ����� ����ȯ ����?

		System.out.println("1��° ȸ������:: "+user01);
		System.out.println("2��° ȸ������:: "+user02);

		//Stream close()
		ois.close();

	}//end of main

}//end of class