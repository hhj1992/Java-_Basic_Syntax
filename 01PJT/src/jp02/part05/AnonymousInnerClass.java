package jp02.part05;

/*
	FileName : AnonymousInnerClass.java

	<< Anonymous Inner Class�� ����>>
	1. class�� �̸��� ���� ��Ư�� class
*/
class A{
	//F
	//C
	//M
	public void abc(String message){
		System.out.println(":: "+this.getClass().getName()+" start..");
		System.out.println(":: abc()"+message);
		System.out.println(":: "+this.getClass().getName()+" end..");
	}
}


public class AnonymousInnerClass{

	//main
	public static void main(String[] args){

		//1. �ν��Ͻ� ����, �ĺ������� �޼ҵ� ����
		System.out.println("1.=========================");
		A a = new A();
		a.abc("Hello");

		//2. �ν��Ͻ� ���� �� �ٷ� �޼ҵ� ����
		System.out.println("2.=========================");
		new A().abc("Hello");

		/* ===== �Ʒ��� �ڵ带 ���� ======
			public class B extends A{
				public void def(String message{
					System.out.println(":: Hi "+message);
				}
			}
			new B().abc("Hello");
			new B().def("Hello");
		==================================*/

		//3. ���� �ڵ带 �����Ѵٸ�, �Ʒ��� �ڵ��...
		//==> Anonymous(�͸�, �Ҹ� : �̸��� ����)
		//==> ���� �ҽ����� public class B extends�� �����..
		System.out.println("3.=========================");
		new A(){
			public void def(String message){
				System.out.println(":: "+this.getClass().getName()+" start..");
				System.out.println(":: def()"+message);
				System.out.println(":: "+this.getClass().getName()+" end..");		
			}
		}.abc("Hello");

		System.out.println("4.=========================");
		new A(){
			public void def(String message){
				System.out.println(":: "+this.getClass().getName()+" start..");
				System.out.println(":: def()"+message);
				System.out.println(":: "+this.getClass().getName()+" end..");
			}
		}.def("Hello");
	}
}