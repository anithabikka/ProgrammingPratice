package java.pratice.control.statements.examples;

public class Pattern {
    public static void main(String[] args){
       for (int i = 1; i <= 5; i++) {
           for (int k=4;k>=i;k--){
               System.out.print(" ");

           }

           for(int j=i;j>=1;j--){
               //if(j<i){

               System.out.print(j);}
           for(int j=2;j<=i;j++){

               System.out.print(j);

           }
           System.out.println();
       }






    }
}