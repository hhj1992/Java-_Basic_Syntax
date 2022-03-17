package jp04.part01;

/*
*	FileName : BeforeThread.java
*/
public class  BeforeThread extends Thread{

    ///Field
    private String name;
        
    ///Constructor
    public BeforeThread(){
    }
    public BeforeThread(String name){
          this.name = name;
    }
  
     //Method
	public void run(){
		for(int i=1;i<100;i++){
			System.out.println(name+" : "+i+"*"+9+"="+i*9);
		}
	}

    ///Main Method
	public static void main(String[] args) 	{

        System.out.println("여기는 main start....");

		BeforeThread bt1 = new BeforeThread("1번째");
		BeforeThread bt2 = new BeforeThread("2번째");
		bt1.run();
		bt2.run();
		
        System.out.println("여기는 main end....");

	}//end of main

}//end of class

//==> 실행 결과는 ?