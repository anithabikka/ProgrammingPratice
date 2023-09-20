package javapratice.collections;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetComparator {
    public static void main(String[] args) {
        TreeSet<Integer> num=new TreeSet<>();
        num.add(9);
        num.add(23);
        num.add(56);
        num.add(18);
        num.add(24);
        num.add(90);
        System.out.println("print the elements");
        System.out.println(num);
        Comparator com=num.comparator();
        System.out.println("print after the comparator");
        System.out.println(com);
        System.out.println("updated list"+num.floor(85));
    }
}
