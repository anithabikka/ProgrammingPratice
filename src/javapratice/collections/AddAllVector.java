package javapratice.collections;

import java.util.ArrayList;

public class AddAllVector {
    public static  void main(String[] args) {
        ArrayList<Integer> vec=new ArrayList<Integer>();
        vec.add(3);
        vec.add(4);
        vec.add(5);
        vec.add(8);
        ArrayList<Integer> vec1=new ArrayList<Integer>();
        vec1.add(6);
        vec1.add(8);
        vec1.add(9);
        vec1.add(2);
       // vec.addAll(vec1);
        vec.addAll(3,vec1);
        System.out.println("the final vector is"+vec);
    }
}
