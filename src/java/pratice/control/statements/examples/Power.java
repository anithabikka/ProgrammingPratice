package java_pratice.array_examples.control_statements_examples;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter the number");
        int n1= sc.nextInt();
        System.out.println(" enter the number");
        int n2 = sc.nextInt();


        int power =1;
        for (int i=1;i<=n2;i++) {
            power = power * n1;

        }System.out.println("the power of a give number is " + power);

        }
}
