package java_pratice.array_examples.control_statements_examples;

import java.util.Scanner;
public class Ex {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        for (int i=1;i<=10;i++){


        System.out.println(n+ " * " +i+" = "+ (n*i));
    }
}}