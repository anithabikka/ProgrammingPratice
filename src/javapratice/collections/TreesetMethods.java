package javapratice.collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreesetMethods {
    public static void main(String[] args) {
        TreeSet<String>  name=new TreeSet<>();
        name.add("dog");
        name.add("camel");
        name.add("bear");
        name.add("zebra");
        name.add("elephant");
        System.out.println("after the add method");
        System.out.println(name);
        System.out.println("after the descending order");
        Iterator itr= name.descendingIterator();
        while (itr.hasNext()){
        System.out.println(itr.next());
    }
}}
