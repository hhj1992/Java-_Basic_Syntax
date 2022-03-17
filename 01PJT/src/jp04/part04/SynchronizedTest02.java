package jp04.part04;

/*
 *  FileName : SynchronizedTest02.java
 */
public class SynchronizedTest02 extends Thread{

	///Field
	private int num;
	private String name;

    ///Constructor
    public SynchronizedTest02(){
    }
	public SynchronizedTest02(String name){
		this.name=name;
	}

    ///method
	 //����ȭ ���� �ذ� �� ���
	public synchronized void increase(){
		
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
		
		SynchronizedTest02 t1 = new SynchronizedTest02("ȫ�浿");
		SynchronizedTest02 t2 = new SynchronizedTest02("ȫ�浿");
		
		t1.start();
		t2.start();
		
	}//end of main

}//end of class