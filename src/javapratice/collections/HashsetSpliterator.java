package javapratice.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.Spliterator;

public class HashsetSpliterator {
    public static void main(String[] args) {
        Set<String> str=new HashSet<>();
        str.add("apple");
        str.add("grapes");
        str.add("pine apple");
        str.add("mango");
        Spliterator<String> strSpliterator= str.spliterator();
        System.out.println(str);
    }
}
