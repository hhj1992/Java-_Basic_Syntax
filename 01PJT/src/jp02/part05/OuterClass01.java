package jp02.part05;










public class OuterClass01{

	//Field
	private String outer = "OuterClass �� Field";

	//Constructor
	public OuterClass01(){
	}

	//Mehod
	public void outerMethod(){
		System.out.println(":: "+this.getClass().getName()+" start..");
		//innerClass�� ������ ��� �ν��Ͻ� ���� �� ����
		InnerClass ic = new InnerClass();
		ic.innerMethod();
		System.out.println(":: "+this.getClass().getName()+" end..");
	}

	//InnerMember Class
	public class InnerClass{
		//Field
		private String inner = "InnerClass �� Field";
		//Constructor
		public InnerClass(){
		}
		//Method
		public void innerMethod(){
			//innerClass���� outer class�� ����
			//OuterClass���� Field,Method�� ���� ���� :: ���۷��� ���ʿ�
			System.out.println("==> "+this.getClass().getName()+" start..");
			//==>OuterClass�� Field ���ٹ�� :: 2����
			System.out.println(outer);
			System.out.println(OuterClass01.this.outer);
			//==>�Ʒ��� ���๮�� �ּ� Ǯ�� compile error�� �߻��Ѵ�. ������...
			//System.out.println(this.outer);
			System.out.println(inner);
			System.out.println("==> "+this.getClass().getName()+" end..");
		}
	}

	//main method
	public static void main(String[] args){
		new OuterClass01().outerMethod();
	}
}