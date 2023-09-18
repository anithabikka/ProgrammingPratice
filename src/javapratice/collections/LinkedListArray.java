package javapratice.collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListArray {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<String>();
        list.add("book");
        list.add("pen");
        list.add("pencil");
        list.add("eraser");
        System.out.println("print the original  list");
        System.out.println(list);
        System.out.println("print the updated  list");
        list.add("story books");
        System.out.println("print the updated list"+list);
        LinkedList<String> list2=new LinkedList<String>();
        list2.add("magzine");
        list2.add("news paper");
        list.addAll(list2);
        System.out.println("after invoking the list"+list);

        list.add(1,"blackpen");
        System.out.println("after invoking the add method"+list);
        list.addFirst("bluepen");
        System.out.println("afer invoking add method"+list);


    }
}
