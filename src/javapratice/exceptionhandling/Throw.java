package javapratice.exceptionhandling;

public class Throw {
    public void validate(int age){
        if (age<18){
            throw new ArithmeticException("person is not eligible to vote");
        }else {
            System.out.println("person will eligible for vote");
        }
    }
    public static void main(String[] args) {
Throw obj=new Throw();
obj.validate(19);
        System.out.println("rest of the code");
    }
}
