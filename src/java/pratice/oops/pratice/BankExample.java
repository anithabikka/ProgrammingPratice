package java.pratice.oops.pratice;

class Accoun {
    int getinterestrate(){
        return 0;}
        int getwithdrawallimit(){
            return 0;
        }}


    class SavingsAccount extends Accoun{
        int getinterestrate(){
            return 2;}
        int getwithdrawallimit(){
            return 50000;
        }}
        class CheckingAccount extends Accoun{
            int getinterestrate(){
                return 8;}
            int getwithdrawallimit(){
                return 80000;
            }


    }


 class BankExample{
     public static void main(String[] args) {
         SavingsAccount s1 = new SavingsAccount();
         CheckingAccount s2 = new CheckingAccount();
         System.out.println("the interest rate of savings account is" + s1.getinterestrate());
         System.out.println("the withdrawallimit of savings account is" + s1.getwithdrawallimit());
         System.out.println("the interest rate of checking account is" + s2.getinterestrate());
         System.out.println("the withdrawallimit of checking account is" + s2.getwithdrawallimit());
     }}








