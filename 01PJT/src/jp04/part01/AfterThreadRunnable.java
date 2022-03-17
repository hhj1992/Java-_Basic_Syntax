package jp04.part01;

/*
* FileName : AfterThreadRunnable.java
*/
public class AfterThreadRunnable implements Runnable{

	//F
	private String name;

	//C
	public AfterThreadRunnable(){
	}
	public AfterThreadRunnable(String name){
		this.name = name;
	}

	//M
	public void run(){
		for (int i=1; i<100; i++){
			System.out.println(name+" : " +i);
			
			//sleep() ==> API 확인
			try{
				Thread.sleep(100); //static
			}catch(InterruptedException e){
				System.out.println(e);
			}
		
		}
	}

	//main
	public static void main(String[] args){

		System.out.println("여기는 main start...");
		AfterThreadRunnable bt1 = new AfterThreadRunnable("1번째");
		AfterThreadRunnable bt2 = new AfterThreadRunnable("2번째");

		//Thread 생성자 확인 
		Thread t1 = new Thread(bt1);
		Thread t2 = new Thread(bt2);

		t1.start();
		t2.start();
		System.out.println("여기는 main end....");

	}

}