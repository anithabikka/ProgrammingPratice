package javapratice.oopspratice;

abstract class Abstrac {
abstract void drawing();
 public void test(){
    System.out.println("this is a default method in abstract");
}

}
 class Rectangle extends Abstrac{
     void drawing(){
         System.out.println("draw rectangle");
     }}
     class Circle extends Abstrac{
         void drawing(){
             System.out.println("draw circle");

         }
         public void test(){
             System.out.println("child test");
         }
     }

     public class Abstract{
         public static void main(String[] args) {
             Abstrac obj=new Circle();
             obj.test();
         }
     }


