package java.pratice.control.statements.examples;

import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
//        int i,num=10,sum=0;
//        for (i=0;i<=num;i++){
//            sum=sum+i;
//
//        }
//        System.out.println("the sum of 10 natural numbers is" +sum);

//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter a number");
//        int n=sc.nextInt();
//        System.out.println("enter a");
//        int a=sc.nextInt();
//
//for(int i=1;i<=a;i++){
//    System.out.println(n+"*"+i+"="+(n*i));

//}
Scanner sc=new Scanner(System.in);
        System.out.println("enter the number1");
        int n= sc.nextInt();
        System.out.println("enter the number2");
        int a= sc.nextInt();
        int power=1;
for(int i=1;i<=a;i++){


    power= power*n;
}
        System.out.println(power);
    }
    }
