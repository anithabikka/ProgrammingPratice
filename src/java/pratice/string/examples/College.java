package java.pratice.string.examples;

public class College {
    public static void main(String [] args){
    int age = 25;
    boolean isStudent = true;

if (age < 18) {
        if (isStudent) {
            System.out.println("You are a student under 18.");
        } else  if (isStudent){
            System.out.println("You are not a student under 18.");
        }
    } else {
        System.out.println("You are 18 or older.");
    }

}}
