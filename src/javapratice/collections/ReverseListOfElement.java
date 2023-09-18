package javapratice.collections;

import java.util.*;

public class ReverseListOfElement {
    public static void main(String[] args) {
       LinkedList<String> list1=new LinkedList<String>();
       list1.add("laptop");
      list1.add("computer");
        list1.add("mouse");
        list1.add("keyboard");
        Iterator itr=  list1.descendingIterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
//        }
//public static void main(String args[]){
//
//    LinkedList<String> ll=new LinkedList<String>();
//    ll.add("Ravi");
//    ll.add("Vijay");
//    ll.add("Ajay");
//    //Traversing the list of elements in reverse order
//    Iterator i=ll.descendingIterator();
//    while(i.hasNext())
//    {
//        System.out.println(i.next());
    }
}
}


