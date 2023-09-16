package java.pratice.control.statements.examples;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("enter the integer");
        int n= sc.nextInt();
        int count =0;
        if(n>1){
            for(int i=1;i<=n;i++){
                    if(n%i==0) {
                        count++;
                    }
            }if (count==2){
                System.out.println("the number is a prime number");
            }else {
                System.out.println("it is not a prime");
            }


        }else{
            System.out.println("give number is not a prime number");
        }





         }
    }
