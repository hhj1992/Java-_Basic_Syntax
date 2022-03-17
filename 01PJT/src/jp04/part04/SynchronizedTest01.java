package jp04.part04;

/*
 * FileName : SynchronizedTest01.java
 */
public class SynchronizedTest01 implements Runnable{

	///Field
     private int num;
	 private String name;
	
    ///Constructor
    public SynchronizedTest01(){
    }
    public SynchronizedTest01(String name){
		this.name=name;
	}

    ///Method
    /* // ����ȭ ���� ���ذ� �� ���
    public void increase(){
        System.out.println("����� ����ȭ �������� Increase()");
	*/
  
	///* //����ȭ ���� �ذ� �� ���
	public synchronized void increase(){
		System.out.println("����� ����ȭ�� Increase()");
	///*/ 
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

    //main method
	public static void main(String[] args) {
		
		SynchronizedTest01 bb = new SynchronizedTest01("ȫ�浿");
		
		Thread t1 = new Thread(bb);
		Thread t2 = new Thread(bb);
		
		t1.start();
		t2.start();
		
	}//end of main
	
}//end of class