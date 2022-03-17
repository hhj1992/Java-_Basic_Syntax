package jp02.part05;

/*
FileName : OuterClass02.java

<<Inner local Class�� ����>>
1. Inner localClass ��  method�� ������ local variable�� ���� level
2. ������ �� innerClass�� � ������ class�� �Ǵ��� Ȯ���� �� (~~~$1~~~.class)
*/
public class OuterClass02{

   //F
   private String outer="outerClass�� Field";

   //C
   public OuterClass02(){

   }

   //M
   public void outerMethod(){
      
      System.out.println(":: "+this.getClass().getName()+" start..");

      final String localVariable="OuterClass ���� outerMethod�� localVariable";

      //inner local class
      class InnerLocalClass{
         //F
         private String inner="innerClass�� Field";
         //C
         public InnerLocalClass(){
         }
         //M
         public void innerMethod(){
            System.out.println("==>"+this.getClass().getName()+" start..");
            //innerClass���� outerClass�� ����
            System.out.println(localVariable);
            System.out.println(outer);
            System.out.println(inner);
            System.out.println("==> "+this.getClass().getName()+" end..");
         }
      }
      
      System.out.println(":: "+this.getClass().getName()+" start..");

      //inner local class�� �ѷ��� method���� �ν��Ͻ� ���� ���� 
      InnerLocalClass ilc = new InnerLocalClass();
      ilc.innerMethod();
   }

   //main
   public static void main(String[] args){
      new OuterClass02().outerMethod();
   }
}