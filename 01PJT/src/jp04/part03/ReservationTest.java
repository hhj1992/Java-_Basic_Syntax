package jp04.part03;

/*
 * FileName : ReservationTest.java
 * 
 * 1. ����/���� 2���� ����ó���� ���ÿ� ���Ÿ� �ϴ°�츦 Test 
 */
public class ReservationTest{

	///main
	public static void main(String[] args){
		TheaterReservationSystem trs = new TheaterReservationSystem();
		ReservationShop rs1 = new ReservationShop(trs,"��������");
		ReservationShop rs2 = new ReservationShop(trs,"��������");

		//Thread start
		rs1.start();
		rs2.start();
	}//end of main

}//end of class