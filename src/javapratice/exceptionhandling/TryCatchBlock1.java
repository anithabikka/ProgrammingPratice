package javapratice.exceptionhandling;

public class TryCatchBlock1 {
    public static void main(String[] args) {
        try{
            System.out.println("print the try block");
            int data=50/0;
        }catch (ArithmeticException e){
          //  System.out.println(e);
        }
    }
}
