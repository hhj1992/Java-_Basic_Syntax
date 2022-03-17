package jp03.part06;

import java.io.*;

/*
* FileName : WriteObjectFile.java
*
* ObjectOutputStream�� �̿� ȸ�������� ���� UserVo instance ��
*	(��ü�� ���¸� ���´� / ����������) persistence data(File)�� ����
*/
public class WriteObjectFile{

	//main
	public static void main(String[] args) throws Exception{

		//1. instance�� File�� ������ SinkStream :: FileOutputStream ����
		//2. instance�� �����ϴ� FilterStream : ObjectOutputStream ����
		ObjectOutputStream oos
			= new ObjectOutputStream(new FileOutputStream("UserInfo.obj"));

		oos.writeObject(new UserVO(1,"ȫ�浿")); //==>APIȮ��
		oos.writeObject(new UserVO(2,"ȫ���")); //==>APIȮ��
		oos.flush();

		//Stream close()
		oos.close();
	}
}