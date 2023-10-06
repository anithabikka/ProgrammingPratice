package javapratice.lamdaexpression;

import java.util.TreeSet;

public class TreeMapSorting {
    public static void main(String[] args) {
      //  TreeSet<String> name = new TreeSet<String>((aStr,bStr) -> bStr.compareTo(aStr));
        TreeSet<String> name = new TreeSet<String>((o1,o2) -> o1.compareTo(o2));
        name.add("a");
        name.add("b");
        name.add("c");
        name.add("d");
        name.add("e");
        name.add("f");
        System.out.println(" after sortimg the elements"+ name);


    }
}
