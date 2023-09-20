package javapratice.collections;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueExample {
    public static void main(String[] args) {
        PriorityQueue<String> queue=new PriorityQueue<>();
        queue.add("anitha");
        queue.add("ashok");
        queue.add("sathya");
        queue.add("vijay");
        queue.add("karan");
      queue.add("anapurna");
//        System.out.println(queue.element());
//        System.out.println(queue.peek());
        Iterator itr= queue.iterator();
        while (itr.hasNext()){
       System.out.println(itr.next());}
//        queue.remove();
//        queue.poll();
//        System.out.println("after yhe removal "+ queue);
//
//    }
//}
//        PriorityQueue<String> queue1=new PriorityQueue<String>();
//        queue.add("Amit");
//        queue.add("Vijay");
//        queue.add("Karan");
//        queue.add("Jai");
//        queue.add("Rahul");
//        System.out.println("head:"+queue.element());
//        System.out.println("head:"+queue.peek());
//        System.out.println("iterating the queue elements:");
//        Iterator itr1=queue.iterator();
//        while( itr1.hasNext()){
//            System.out.println(itr1.next());
//        }
//        queue.remove();
//        queue.poll();
//        System.out.println("after removing two elements:");
//        Iterator<String> itr2=queue.iterator();
//        while(itr2.hasNext()){
//            System.out.println(itr2.next());
        }
    }
