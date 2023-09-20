package javapratice.collections;

import java.util.Set;
import java.util.HashSet;

public class HashSt {
    public static void main(String[] args) {
        HashSet<String> name=new HashSet<String>();
        name.add("bench");
        name.add("coin");
        name.add("note");
        name.add("table");
        name.add("chair");
        name.add("ladder");
        System.out.println("print the elements");
        System.out.println(name);
        Set<String> name1=new HashSet<>();
        name.add("sofa");
       name1.add("gate");
        name.addAll(name1);
        System.out.println("after invoking print the elements");
        System.out.println(name);
        HashSet name2=new HashSet();
        name2=(HashSet)name.clone();
        System.out.println(name2);


    }
}
