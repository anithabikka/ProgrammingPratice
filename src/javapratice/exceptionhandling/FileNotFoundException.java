package javapratice.exceptionhandling;

import javax.swing.text.html.parser.Parser;
import java.io.PrintWriter;

public class FileNotFoundException {
    public static void main(String[] args) {
      //  PrintWriter pw;
        try{
            
            int obj=Integer.parseInt("java");
           //pw=new PrintWriter("java");

        }catch (Throwable e){
            System.out.println(e);

        }
        System.out.println("rest of the code");
    }
}
