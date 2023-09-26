package javapratice.exceptionhandling;

public class TryCatchBlock2 {
    public static void main(String[] args) {
        int i=20;
        int j = 0;
        try{
            int data=i/j;
        }catch (Exception e){
            System.out.println(i/(j+5));
        }
    }
}
