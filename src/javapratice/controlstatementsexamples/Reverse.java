package javapratice.controlstatementsexamples;

import java.util.*;
public class Reverse {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name to be reversed: ");
       String name=sc.nextLine();

       for(int i = name.length()-1; i>=0; i--){
      //  for (int i=0;i<name.length()-1;i--){
            System.out.print(name.charAt(i));
        }
    }
}
