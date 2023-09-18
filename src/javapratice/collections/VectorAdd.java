package javapratice.collections;

import java.util.Vector;

public class VectorAdd {
    public static void main(String[] args) {
        Vector<String> vec=new Vector<String>();
        vec.add("good");
        vec.add("average");
        vec.add("bad");
        vec.add("outstanding");
       vec.add("excellent");
       vec.add(2,"super");

        System.out.println(vec);
    }
}
