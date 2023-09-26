package javapratice.exceptionhandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class NestedCatchBlock {
    public static void main(String args[]){

       String  name = "file.txt";
        FileReader one = null;
        try {
            one = new FileReader(name);
        } catch (FileNotFoundException e) {
            System.out.println("checked exception");
        }
        System.out.println(one);
        //outer try block
        try{

            //inner try block 1
            try{

                System.out.println("going to divide by 0");
                int b =39/0;
            }
            //catch block of inner try block 1
            catch(ArithmeticException e)
            {
                System.out.println(e);
            }


            //inner try block 2
            try{
                int a[]=new int[5];

                //assigning the value out of array bounds
                a[5]=4;
            }

            //catch block of inner try block 2
            catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println(e);
            }


            System.out.println("other statement");
        }
        //catch block of outer try block
        catch(Exception e)
        {
            System.out.println("handled the exception (outer catch)");
        }

        System.out.println("normal flow..");
    }

}
