package javapratice.controlstatementsexamples;

public class FibonacciSeries {
    public static void main(String[] args) {
        int num1 = 0, num2 = 1;
        //int count = 0;
        for (int i=2;i<=10;i++){
            System.out.println(num1);
            int num3 = num1+num2;
            num1 = num2;
            num2 = num3;

        }
    }
}
