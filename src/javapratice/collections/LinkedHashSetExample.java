package javapratice.collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.stream.IntStream;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        HashSet<String> name=new LinkedHashSet<>();
        name.add("phone");
        name.add("smartphone");
        name.add("keypad phone");
        name.add("tab");
        name.add("laptop");
        name.add("computer");
        System.out.println("aftern invoking add() method");
        System.out.println(name);
        System.out.println(name.parallelStream());
        System.out.println(name.stream());
        System.out.println("after cloning "+name.clone());
        LinkedHashSet<String> name2=new LinkedHashSet<>();
        name2.add("phone");
        name2.add("tab");
        name2.add("laptop");
name.retainAll(name2);
        System.out.println("after invoking retain all method"+ name);
        System.out.println(name.containsAll(name2));
    }
}
