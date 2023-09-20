package javapratice.collections;

import java.util.TreeSet;

public class TreeSetCeiling {
    public static void main(String[] args) {
        TreeSet<Integer> inte=new TreeSet<>();
        inte.add(9);
        inte.add(8);
        inte.add(4);
        inte.add(26);
        inte.add(34);
        System.out.println("after invoking the add() method");
        System.out.println(inte);
        int value= inte.ceiling(28);
        System.out.println(value);
    }
}
