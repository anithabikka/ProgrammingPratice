package javapratice.controlstatementsexamples;

import java.util.Scanner;

public class LargestSmallest {

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter range number");
            int num=sc.nextInt();
            System.out.println("enter the number");
int max=Integer.MIN_VALUE;
int min=Integer.MAX_VALUE;




            for (int i=1;i<=num;i++) {
                int num1 = sc.nextInt();

                if (num1 > max) {
                    max=num1;
                }if (num1<min){
                    min=num1;
                }
                }


            System.out.println("largest number"+max);
            System.out.println("smallest number"+min);
                }



            }