package java.pratice.control.statements.examples;

import java.util.Scanner;
public class SumOfEvenAndOddNumbers {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the range of integer");
        int n=sc.nextInt();
        System.out.println("enter the numbers");

         int evensum=0;
         int oddsum=0;
        //
            for (int i=1;i<=n;i++){ //
                  int n1=sc.nextInt();
                  if(n1%2 ==0){

                      evensum = evensum+n1;

                  }else {

                      oddsum = oddsum+n1;
                  }



            }
            System.out.println("the sum of even number"+evensum);
        System.out.println("the sum of odd number"+oddsum);

        }



        }


