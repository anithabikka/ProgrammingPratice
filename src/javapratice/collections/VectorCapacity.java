package javapratice.collections;

import java.util.Vector;

public class VectorCapacity {
    public static void main(String[] args) {
        Vector<String> arr=new Vector<>(5);
        arr.add("a");
        arr.add("e");
        arr.add("o");
        arr.add("d");
        System.out.println("the capacity of vector"+arr.capacity());
        System.out.println("Size :"+arr.size());
    }
}
