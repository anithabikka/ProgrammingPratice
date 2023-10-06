package javapratice.exceptionhandling;

public class HierarachyOfExceptionHandling {
    public static void main(String[] args) {
        String s ="exception";
        try {
            int[] arr = new int[]{45, 37, 28, 29, 30};
            System.out.println(arr[10]);
        }catch (ArithmeticException e){
            System.out.println(e);
        }catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println(s);
        }
    }
}
