package jp04.part03;

/*
 * FileName : ReservationShop.java
 * 
 * 1. 예매처를 모델링한 class 
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
  //==> TheaterReservationSystem에서 getTicket()은 표가 없으면 Exception을 발생시킨다.
  public void run(){
    try{
		  if(trs.getTicket(this)){
			  System.out.println("\t\t<지점System>"+shopName+ " : 1번째 예매시도 및 완료");
		  }
		  if(trs.getTicket(this)){
			  System.out.println("\t\t<지점System>"+shopName+ " : 2번째 예매시도 및 완료");
		  }
		  if(trs.getTicket(this)){
			  System.out.println("\t\t<지점System>"+shopName+ " : 3번째 예매시도 및 완료");
		  }
    }catch(Exception e){
      System.out.println("\t\t<지점System>"+shopName+ "표가 없네요.");
    }
  }
  
}//end of class