package jp04.part03;

/*
* FileName : TheaterReservationSystem.java 
* 
*  1. 좌석이 3개인 극장 예매 System
*  2. ticket = true : 좌석예매 가능
*  3. 공유 될수 있는 자원인 ticket  동기화문제 발생 및 해결
 */
public class TheaterReservationSystem{

  ///Field
  //==> ticket 3장 예매가능(true) / 예매됨(false)  
  private boolean[] ticket = {true,true,true};

  ///Constructor
  public TheaterReservationSystem(){ 
  }

  ///method 
  //==> 예매소에서 예매를 요청하는지 알기 위해 ReservationShop 인자로 받음. 
  //==> Ticket 의 유무를 확인 하고 있으면 true, 없으면 Exception 을 던진는 예외로 처리
  //==> synchronized : thread 가 수행중이면 다를 thread 접근 불가
  //==> 이레 각각 주석처리해가며 결과를 확인하여 synchronized modifier 이해
  //public boolean getTicket(ReservationShop rs) throws Exception{
  public synchronized boolean  getTicket(ReservationShop rs) throws Exception{

	//예매소 왁인
	System.out.println
		("\n\n<예매System>"+rs.getShopName() +" : 예매시작 및 synchronized method 시작");

    //ticket확인하고 있으면 true return
    for(int i=0;i<ticket.length;i++){

      if(ticket[i]) {
			//check 유무 확인을 한다고 가정 sleep 1초 주자.
			try{ 
			  System.out.println("<예매System>"+rs.getShopName()+
					  													" : 잠시대기 DB check 1초 소요");
			  Thread.sleep(1000);
			 }catch(Exception e){
				 e.printStackTrace();
			 }
			
			//좌석이 있으면 좌석을 false로 하고 true return
			ticket[ i ] = false;
			System.out.println("<예매System>"+rs.getShopName() +
																		" : 예매종료\t<"+(i+1)+">번표예매함");
			System.out.println	("<예매System>"+rs.getShopName() +
																	" : 예매종료 및 synchronized method 종료");
			
			return !(ticket[i]);
      }

    }
    
    //좌석이 없으면 Exception 발생 예외로 처리
    throw new Exception("영화표가 없습니다.");
    
  }
  
}//end of class