package jp04.part03;

/*
 * FileName : ReservationShop.java
 * 
 * 1. ����ó�� �𵨸��� class 
 */
public class  ReservationShop extends Thread{

  ///Field
  private String shopName;
  private TheaterReservationSystem trs;

  ///constructor
  public ReservationShop(){
  }
  
  public ReservationShop(TheaterReservationSystem trs, String shopName){
    this.trs = trs;    
    this.shopName = shopName;
  }

  ///method
  public String getShopName(){
    return shopName;
  }

  //thread run() method
  //==> TheaterReservationSystem���� getTicket()�� ǥ�� ������ Exception�� �߻���Ų��.
  public void run(){
    try{
		  if(trs.getTicket(this)){
			  System.out.println("\t\t<����System>"+shopName+ " : 1��° ���Žõ� �� �Ϸ�");
		  }
		  if(trs.getTicket(this)){
			  System.out.println("\t\t<����System>"+shopName+ " : 2��° ���Žõ� �� �Ϸ�");
		  }
		  if(trs.getTicket(this)){
			  System.out.println("\t\t<����System>"+shopName+ " : 3��° ���Žõ� �� �Ϸ�");
		  }
    }catch(Exception e){
      System.out.println("\t\t<����System>"+shopName+ "ǥ�� ���׿�.");
    }
  }
  
}//end of class