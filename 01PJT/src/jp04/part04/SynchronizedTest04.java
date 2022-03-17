package jp04.part04;

/*
 * 	FileName : SynchronizedTest04.java
 */
public class SynchronizedTest04 implements Runnable{
	
	///Field
	private int num;
	private String name;
    private boolean check = true;

     ///Constructor
    public SynchronizedTest04(){
    }
    public SynchronizedTest04(String name){
		this.name=name;
	}

    //method
    //method  동기화 시킨경우
	public synchronized void increase(){
		
		System.out.println("여기는 동기화된 Increase()");

        for ( ; ;){
			System.out.print(Thread.currentThread().getName());
			System.out.println(name+"님의  현재	예금액은 : "+num+"원");
			
			num++;
			
			try{
				Thread.sleep(100);
			}catch(Exception e){}

            if( check ){
                check=false;
                break;
            }
		}
	}
	
    //thread run method
	public void run(){
		increase();
	}

    //main method
	public static void main(String[] args) {
		
		SynchronizedTest04 bb = new SynchronizedTest04("홍길동");
		
		Thread t1 = new Thread(bb);
		Thread t2 = new Thread(bb);
		
		t1.start();
		t2.start();
		
		Thread t3 = new Thread(bb);
		t3.start();
		
	}//end of main
	
}//end of class