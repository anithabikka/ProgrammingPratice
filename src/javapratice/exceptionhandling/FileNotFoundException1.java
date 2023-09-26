package javapratice.exceptionhandling;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileNotFoundException1 {
    public static void main(String[] args) {
        PrintWriter Pw;
        try{
            Pw = new PrintWriter("jtp.txt");

        }catch (FileNotFoundException e){
            System.out.println(e);
        }
        System.out.println("file saved successfully");
    }
}
