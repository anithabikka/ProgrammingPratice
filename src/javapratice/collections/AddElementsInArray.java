package javapratice.collections;

import java.util.ArrayList;

public class AddElementsInArray {
    public static void main(String[] args) {
        ArrayList<String> a1=new ArrayList<String>();
        a1.add("sai");
        a1.add("sahasra");
        a1.add("anitha");
        a1.add("gowry");
        System.out.println("after invoking add the elements"+a1);
        a1.add(1,"deekshitha");
        System.out.println("after invoking add the element"+a1);
        ArrayList<String> a2=new ArrayList<String>();
        a2.add("vyshnavi");
        a2.add("bittu");

        a1.addAll(a2);
        System.out.println("after invoking add all the element"+a1);
a1.removeAll(a1);
        System.out.println("after invoking remove all method"+a1);


        a1.clear();

        System.out.println("after invoking clear method"+a1);
        a1.remove(1);
        System.out.println("after invoking remove metod"+a1);

    }
}
