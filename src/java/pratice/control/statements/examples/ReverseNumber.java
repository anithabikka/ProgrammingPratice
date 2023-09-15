package java_pratice.array_examples.control_statements_examples;

import java.util.Scanner;

public class ReverseNumber
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);

        int number;
        int reverse = 0;

        System.out.print("Enter the number ");
        number = console.nextInt();

        int temp = number;
        int remainder = 0;

        while(temp>0) // 589
        {
            remainder = temp % 10;

            reverse = reverse * 10 + remainder; // 9

            temp /= 10; // temp = temp/10

        }

        System.out.println("java_pratice.array_examples.control_statements_examples.Reverse of " + number + " is " + reverse);

    }
}
