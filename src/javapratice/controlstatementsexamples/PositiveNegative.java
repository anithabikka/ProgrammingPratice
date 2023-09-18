package javapratice.controlstatementsexamples;

import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter range number");
        int num=sc.nextInt();
        System.out.println("enter the number");

        int positivecount=0;
        int negativecount=0;
        int zerocount=0;

        for (int i=1;i<=num;i++){
            int num1=sc.nextInt();
            if (num1>0){
                positivecount++;
            } else if (num1<0) {
                negativecount++;

            }else {
                zerocount++;
            }

        }
        System.out.println("the positivecount is"+positivecount);
        System.out.println("the negativecount is"+negativecount);
        System.out.println("the zerocount is"+zerocount);



    }
}
