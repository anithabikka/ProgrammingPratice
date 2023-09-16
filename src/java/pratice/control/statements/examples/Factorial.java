package java.pratice.control.statements.examples;

public class Factorial {
    public static void main(String[] args) {
        int i, fact = 1;
        int number=4;
        for (i=1;i<=number;i++) {
            fact = fact * i;

        }
        // testing how to commit
        System.out.println(" factorial of"+number+"is"+fact);
    }
}
