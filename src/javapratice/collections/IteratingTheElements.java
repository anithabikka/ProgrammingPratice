package javapratice.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratingTheElements {
    public static void main(String[] args) {
        ArrayList<String> obj = new ArrayList<String>();
        obj.add("anitha");
        obj.add("usha");
        obj.add("sathya");
        obj.add("kavitha");
        obj.add("purnima");
        obj.add("lakshmi");
        System.out.println("traversing list through iterator");
        ListIterator<String> list1 = obj.listIterator(obj.size());
        while (list1.hasPrevious()) {//for loop use cheyocha
            String str= list1.previous();
            System.out.println(str);
        }
//        System.out.println("travesrsing list through for each method");
//        obj.forEach(a -> {
//            System.out.println(a);
//        });
//        System.out.println("traversing list through foreach remaining method ");
//        Iterator<String> itr = obj.iterator();
//        itr.forEachRemaining(a -> {
//            System.out.println(a);
//        });

    }


    }

