package jp04.part03;

/*
 * FileName : ReservationTest.java
 * 
 * 1. 강남/강북 2개의 예매처에서 동시에 예매를 하는경우를 Test 
 */
public class ReservationTest{

	///main
	public static void main(String[] args){
		TheaterReservationSystem trs = new TheaterReservationSystem();
		ReservationShop rs1 = new ReservationShop(trs,"강남지점");
		ReservationShop rs2 = new ReservationShop(trs,"강북지점");

		//Thread start
		rs1.start();
		rs2.start();
	}//end of main

}//end of class