package javapratice.collections;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;

public class DequeMethods {
    public static void main(String[] args) {
        Deque<String> obj=new ArrayDeque<String>();
        obj.add("book");
        obj.add("pen");
        obj.add("pencil");
        obj.add("eraser");
        obj.add("sketches");
        obj.add("colours");
        System.out.println("print the elements");
        System.out.println(obj);
        obj.add("colour pencils");
        System.out.println("after the invoking elements"+ obj);
        ArrayList<String> obj1=new ArrayList<String>();
        obj1.add("blue sketch");
        obj1.add("green sketch");
        obj1.add("white sketch");
        obj.addAll(obj1);
        System.out.println(" after invoking the elements");
        System.out.println(obj);
        obj.add("gel pens");
        System.out.println("after invoking the add() method");
        System.out.println(obj);
        obj.addFirst("green pen");
        System.out.println("after invoking the addfirst method");
        System.out.println(obj);
        obj.contains("pen");
        if(obj.contains("pen")){
            System.out.println("the element is in the list");

        }else {
            System.out.println("the element does not present ");
        }
        System.out.println("print the descending order");
        Iterator itr= obj.descendingIterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }




    }
}
