package javapratice.collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeOfferMethods {
    public static void main(String[] args) {
        Deque<Integer> off=new ArrayDeque<Integer>();
        off.add(56);
        off.add(78);
        off.add(65);
        off.add(34);
        off.add(52);
        off.add(77);
        System.out.println("printh the elements");
        System.out.println(off);
        System.out.println("after invoking the element"+ off.element());
        off.offer(37);
        System.out.println("after invoking the offer() method");
        System.out.println(off);
        off.poll();
        System.out.println("updated list");
        System.out.println(off);
        off.pop();
        System.out.println("updated list");
        System.out.println(off);
        off.push(23);
        System.out.println("updated list");
        System.out.println(off);
        System.out.println("after the invoking of elements"+off.size());
    }
}
