package java.pratice.control.statements.examples;

import java.util.Scanner;
    public class NumberClassifier {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the range  of numbers: ");
            int n = scanner.nextInt();

            int positiveCount = 0;
            int negativeCount = 0;
            int zeroCount = 0;

            System.out.println("Enter " + n + " integers:");

            for (int i = 0; i < n; i++) {
                int num = scanner.nextInt();

                if (num > 0) {
                    positiveCount++;
                } else if (num < 0) {
                    negativeCount++;
                } else {
                    zeroCount++;
                }
            }

            scanner.close();

            System.out.println("Number of positive numbers: " + positiveCount);
            System.out.println("Number of negative numbers: " + negativeCount);
            System.out.println("Number of zeros: " + zeroCount);



                   }
        }

