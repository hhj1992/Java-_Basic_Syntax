package jp04.part04;

/*
 *  FileName : SynchronizedTest03.java
 */
public class SynchronizedTest03 extends Thread{

	///Field
    private static int num;
	private static String name;

    ///constructor
    public SynchronizedTest03(){
    }
	public SynchronizedTest03(String name){
		SynchronizedTest03.name=name;
	}

    ///method
	public static synchronized void increase(){
		System.out.println("����� ����ȭ�� Increase()");
		
		for (int i=0;i<10;i++){
			System.out.print(Thread.currentThread().getName());
			System.out.println("\t"+name+"����  ����	���ݾ��� : "+num+"��");
			num++;
			try{
				Thread.sleep(100);
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}

    //thread run method
	public void run(){
		increase();
	}

    ///main method
	public static void main(String[] args) {
		
		SynchronizedTest03 t1 = new SynchronizedTest03("ȫ�浿");
		SynchronizedTest03 t2 = new SynchronizedTest03("ȫ�浿");
		
		t1.start();
		t2.start();
		
	}//end of main

}//end of class