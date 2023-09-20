package javapratice.collections;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;

public class DequeExanple {
    public static void main(String[] args) {
        Deque<String> que = new ArrayDeque<String>();
        que.add("gopi");
        que.add("guru");
        que.add("anitha");
        que.add("supriya");
        que.add("fatima");
        que.add("deekshitha");
        System.out.println(que);
        System.out.println("after offer first tranversal");
        for (String i:que){
            System.out.println(i);
        }
        que.poll();
        System.out.println(que);
que.pollLast();
        System.out.println(que);
        que.offerFirst("gayatri");
        System.out.println(que);

    }
}