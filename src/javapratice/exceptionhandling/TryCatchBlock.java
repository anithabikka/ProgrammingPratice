package javapratice.exceptionhandling;

public class TryCatchBlock {
    public static void main(String[] args) {
        try{
            int data=34/0;

        }
        catch (ArithmeticException e){
            System.out.println(e);

        }
        System.out.println("rest of the code");
    }
}
