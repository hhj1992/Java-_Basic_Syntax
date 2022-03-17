package jp04.part03;

/*
* FileName : TheaterReservationSystem.java 
* 
*  1. �¼��� 3���� ���� ���� System
*  2. ticket = true : �¼����� ����
*  3. ���� �ɼ� �ִ� �ڿ��� ticket  ����ȭ���� �߻� �� �ذ�
 */
public class TheaterReservationSystem{

  ///Field
  //==> ticket 3�� ���Ű���(true) / ���ŵ�(false)  
  private boolean[] ticket = {true,true,true};

  ///Constructor
  public TheaterReservationSystem(){ 
  }

  ///method 
  //==> ���żҿ��� ���Ÿ� ��û�ϴ��� �˱� ���� ReservationShop ���ڷ� ����. 
  //==> Ticket �� ������ Ȯ�� �ϰ� ������ true, ������ Exception �� ������ ���ܷ� ó��
  //==> synchronized : thread �� �������̸� �ٸ� thread ���� �Ұ�
  //==> �̷� ���� �ּ�ó���ذ��� ����� Ȯ���Ͽ� synchronized modifier ����
  //public boolean getTicket(ReservationShop rs) throws Exception{
  public synchronized boolean  getTicket(ReservationShop rs) throws Exception{

	//���ż� ����
	System.out.println
		("\n\n<����System>"+rs.getShopName() +" : ���Ž��� �� synchronized method ����");

    //ticketȮ���ϰ� ������ true return
    for(int i=0;i<ticket.length;i++){

      if(ticket[i]) {
			//check ���� Ȯ���� �Ѵٰ� ���� sleep 1�� ����.
			try{ 
			  System.out.println("<����System>"+rs.getShopName()+
					  													" : ��ô�� DB check 1�� �ҿ�");
			  Thread.sleep(1000);
			 }catch(Exception e){
				 e.printStackTrace();
			 }
			
			//�¼��� ������ �¼��� false�� �ϰ� true return
			ticket[ i ] = false;
			System.out.println("<����System>"+rs.getShopName() +
																		" : ��������\t<"+(i+1)+">��ǥ������");
			System.out.println	("<����System>"+rs.getShopName() +
																	" : �������� �� synchronized method ����");
			
			return !(ticket[i]);
      }

    }
    
    //�¼��� ������ Exception �߻� ���ܷ� ó��
    throw new Exception("��ȭǥ�� �����ϴ�.");
    
  }
  
}//end of class