package javapratice.controlstatementsexamples;

import java.util.Scanner;

public class AsciiValue {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("enter the char value");
        char ch = sc.next().charAt(0);
    int asciiValue = ch ;
        System.out.println("the ascii value of"  + " " +ch+" "  +  "is"+ asciiValue);
    }
}
