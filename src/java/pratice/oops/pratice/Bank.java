package java.pratice.oops.pratice;

class Account {
     private float interestrates;
     private int withdrawllimit;//

//     java_pratice.oops_pratice.Account(int withdrawllimit) {
//         this.withdrawllimit = withdrawllimit;
//     }

//     class java_pratice.oops_pratice.SavingsAccount extends java_pratice.oops_pratice.Account{
     float getInterestrates() {


         return interestrates;
     }
     public void setInterestrates(float setInterestrates) {
         this.interestrates = interestrates;
     }
     int getwithdrawllimit() {


         return withdrawllimit;


     }

     public void setWithdrawllimit(int withdrawllimit) {
         this.withdrawllimit = withdrawllimit;


     }




     class SavingsAccount extends Account {

              void saving() {
                  System.out.println("the interestrates of savings accoubt is"+ interestrates);
                  System.out.println("the withdrawllimit of savings account is"+withdrawllimit);
              }
          }
     class CheckingAccount extends Account {

         void check() {
             System.out.println("the interestrates of savings accoubt is"+interestrates);
             System.out.println("the withdrawllimit of savings account is"+withdrawllimit);
         }
     }}
      class Bank{
          public static void main(String[] args) {
              Account S1= new Account();
              Account S2= new Account();
              S1.setInterestrates(1.5f);
              S1.setWithdrawllimit(500000);
              S2.setInterestrates(2.0f);
              S2.setWithdrawllimit(800000);


              System.out.println(S1.getInterestrates()+S1.getwithdrawllimit());
              System.out.println(S2.getInterestrates()+S2.getwithdrawllimit());
          }
      }



