package javapratice.collections;

import java.util.TreeSet;

public class TreeSetRemainingMethods {
    public static void main(String[] args) {
        TreeSet<String> nam=new TreeSet<>();
        nam.add("name");
        nam.add("balu");
        nam.add("anjali");
        nam.add("sujitha");
        nam.add("surekha");
        nam.add("mahi");
        System.out.println("print the elements");
        System.out.println(nam);
        System.out.print("updated list");
        System.out.println(nam.floor("anjali"));
        System.out.println("updated list");
        System.out.println(nam.headSet("anjali",true));
    }
}
