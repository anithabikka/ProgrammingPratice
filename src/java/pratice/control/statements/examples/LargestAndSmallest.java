package java_pratice.array_examples.control_statements_examples;

import java.util.Scanner;
public class LargestAndSmallest {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        System.out.print("enter the number");
//        char choice
        int max=0;
        int min =0;
                Scanner console = new Scanner(System.in);
        System.out.print("how many number you want  ");
       int number = console.nextInt();
        System.out.println("enter the numbers you want");

                for(int i=0; i <=number;i++) {
                    int num = console.nextInt();

                    if (num >= max){  // 4, 5, 6, 7
                       max=num;
                      if(min ==0){
                            min=num;
                        }
                    }else if(min >=num) {
                        min =num;
                    }else {
                        min=num;
                    }

                }
                System.out.println("Largest number: " + max);
                System.out.println("Smallest number: " + min);
            }
        }






