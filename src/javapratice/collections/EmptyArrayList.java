package javapratice.collections;

import java.util.ArrayList;

public class EmptyArrayList {
    public static void main(String[] args) {
        ArrayList<String> list1= new ArrayList<String>();
        System.out.println("is arraylist empty"+list1.isEmpty());
        list1.add("santosh");
        list1.add("shanmuk");
        list1.add("deepu");
        list1.add("ramesh");
        list1.add("bharat");
        System.out.println("the give arrylist is empty"+list1.isEmpty());
    }
}
