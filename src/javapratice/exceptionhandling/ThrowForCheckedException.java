package javapratice.exceptionhandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowForCheckedException {
    public static void checked() throws FileNotFoundException {
        FileReader file=new FileReader("c:\\localdisk\\.txt");
        throw new FileNotFoundException();

    }

    public static void main(String[] args) {
        try{
            checked();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
        System.out.println("rest of the code");
    }

}
