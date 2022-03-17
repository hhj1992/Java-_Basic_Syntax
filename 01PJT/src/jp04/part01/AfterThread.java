package jp04.part01;

/*
*	FileName : AfterThread.java
*/
public class  AfterThread extends Thread{
	
    ///Field
    private String name;

    ///Constructor
    public AfterThread(){
    }
	public AfterThread(String name){
		this.name = name;
	}

    ///Method
	public void run(){
		for(int i=1;i<100;i++){
			System.out.println(name+" : "+i+"*"+9+"="+i*9);
		}
	 }

    ///Main Method
	public static void main(String[] args){

		System.out.println("����� main start....");

		AfterThread bt1 = new AfterThread("1��°");
		AfterThread bt2 = new AfterThread("2��°");
        //==>start() method �� ��� �ִ°�.???
        bt1.start();
		bt2.start();
		
        System.out.println("����� main end....");

	}//end of main

}//end of class

//==> ���� ����� ?
//==> start() method �ǹ̴� ?