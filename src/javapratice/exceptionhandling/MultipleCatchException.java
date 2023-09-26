package javapratice.exceptionhandling;

public class MultipleCatchException {
    public static void main(String[] args) {
        try{
            int a[]=new int[5];
            a[5]=13;
            int i=50/0;

        }catch (ArithmeticException e){
            System.out.println("arithematic exception occurs");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("arrayindexoutof bond exception occurs");
        }catch (Exception e ){
            System.out.println("paremt calss exception occurs");
        }
        System.out.println("rest of the code");

    }

}
