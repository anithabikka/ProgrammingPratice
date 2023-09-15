package stringexamples;

//public class stringexamples.Cool {
//    public static void main(String[] args) {
////        for(int i=9;i>0;i--){
////            System.out.println(i);
////        }
//int term=5;
//                for(int i=1;i<=5;i--){
//                    for(int j=1;j<=1;j--){
//                        System.out.print("* ");
//                    }
//                    System.out.println();//new line
//                }
//            }
//        }
//
public class Cool {
    public static void main(String args[]) {
//i for rows and j for columns
//row denotes the number of rows you want to print
        int i, j, row = 6;
//Outer loop work for rows
        for (i = 0; i < row; i++) {
//inner loop work for space
            for (j = 5; j >=i; j--) {
//prints space between two stars
                System.out.print(" ");
            }
//inner loop for columns
            for (j = 0; j <= i; j++) {
//prints star
                System.out.print("* ");
            }
//throws the cursor in a new line after printing each line
            System.out.println();
        }
    }
}





