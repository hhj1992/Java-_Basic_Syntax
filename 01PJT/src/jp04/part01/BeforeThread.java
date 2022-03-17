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

        System.out.println("����� main start....");

		BeforeThread bt1 = new BeforeThread("1��°");
		BeforeThread bt2 = new BeforeThread("2��°");
		bt1.run();
		bt2.run();
		
        System.out.println("����� main end....");

	}//end of main

}//end of class

//==> ���� ����� ?