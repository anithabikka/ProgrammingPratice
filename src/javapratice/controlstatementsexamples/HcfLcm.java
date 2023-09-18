package javapratice.controlstatementsexamples;

import java.util.Scanner;

public class HcfLcm {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
        System.out.println("enter the number");
        int num1=sc.nextInt();

        int a=num;
        int b=num1;
        while (num !=num1){
            if (num>num1){
                num-=num1;
                System.out.println(num);
            }else {
                num1-=num;
                System.out.println(num1);


            }


        }
        System.out.println("the hcf "+num);
        int lcm=(a*b)/num;
        System.out.println("the lcm "+lcm);

    }
}
