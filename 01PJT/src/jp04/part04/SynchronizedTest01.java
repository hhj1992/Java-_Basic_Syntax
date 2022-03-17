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
    /* // 동기화 문제 미해결 인 경우
    public void increase(){
        System.out.println("여기는 동기화 되지않은 Increase()");
	*/
  
	///* //동기화 문제 해결 인 경우
	public synchronized void increase(){
		System.out.println("여기는 동기화된 Increase()");
	///*/ 
		for (int i=0;i<10;i++){
			System.out.print(Thread.currentThread().getName());
			System.out.println("\t"+name+"님의  현재	예금액은 : "+num+"원");
			
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
		
		SynchronizedTest01 bb = new SynchronizedTest01("홍길동");
		
		Thread t1 = new Thread(bb);
		Thread t2 = new Thread(bb);
		
		t1.start();
		t2.start();
		
	}//end of main
	
}//end of class