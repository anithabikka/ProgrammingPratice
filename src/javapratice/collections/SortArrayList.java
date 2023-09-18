package javapratice.collections;

import java.util.Collections;
import java.util.Stack;

public class SortArrayList {
    public static void main(String[] args) {
        Stack<String> al1=new Stack<String>();
        al1.add("ayesha");
        al1.add("sahasra");
        al1.add("anitha");
        al1.add("deekshitha");
        Collections.sort(al1);
        for (String names:al1){
            System.out.println(names);}
            Stack<Integer> al2=new Stack<Integer>();
            al2.add(24);
            al2.add(25);
            al2.add(86);
            al2.add(12);
            Collections.sort(al2);
            System.out.println(al2);

        }

    }

