package javapratice.collections;

import java.util.ArrayList;
import java.util.List;

public class UsingSetAndGet {
    public static void main(String[] args) {
        List<Integer> list1=new ArrayList<Integer>();
        list1.add(24);
        list1.add(21);
        list1.add(34);
        list1.add(54);
        System.out.println("returning the element"+list1.get(3));
        list1.set(2,23);
        System.out.println(list1);

    }
}
