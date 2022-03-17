package jp02.part05;

/*
FileName : OuterClass02.java

<<Inner local Class의 이해>>
1. Inner localClass 는  method와 내부의 local variable과 같은 level
2. 컴파일 후 innerClass는 어떤 형태의 class가 되는지 확인할 것 (~~~$1~~~.class)
*/
public class OuterClass02{

   //F
   private String outer="outerClass의 Field";

   //C
   public OuterClass02(){

   }

   //M
   public void outerMethod(){
      
      System.out.println(":: "+this.getClass().getName()+" start..");

      final String localVariable="OuterClass 내의 outerMethod의 localVariable";

      //inner local class
      class InnerLocalClass{
         //F
         private String inner="innerClass의 Field";
         //C
         public InnerLocalClass(){
         }
         //M
         public void innerMethod(){
            System.out.println("==>"+this.getClass().getName()+" start..");
            //innerClass에서 outerClass로 접근
            System.out.println(localVariable);
            System.out.println(outer);
            System.out.println(inner);
            System.out.println("==> "+this.getClass().getName()+" end..");
         }
      }
      
      System.out.println(":: "+this.getClass().getName()+" start..");

      //inner local class를 둘러싼 method에서 인스턴스 생성 가능 
      InnerLocalClass ilc = new InnerLocalClass();
      ilc.innerMethod();
   }

   //main
   public static void main(String[] args){
      new OuterClass02().outerMethod();
   }
}