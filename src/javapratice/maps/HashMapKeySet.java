package javapratice.maps;

import java.util.HashMap;

public class HashMapKeySet {
    public static void main(String[] args) {
        HashMap<Integer,String> obj=new HashMap<>();
        obj.put(121,"maths");
        obj.put(112,"english");
        obj.put(125,"social");
        obj.put(123,"maths");
        obj.put(126,"biology");
        System.out.println(obj.keySet());
        System.out.println("updated list");
        HashMap<Integer,String> obj1=new HashMap<>();
        obj1.put(156,"sanskrit");
        obj1.put(128,"science");
        obj1.put(129,"maths1");

        obj.putAll(obj1);
        System.out.println(obj);
        System.out.println("after invoking the map");
        obj.putIfAbsent(190,"maths2a");
        System.out.println(obj);
        System.out.println("updated list");
       obj.remove(129);
        System.out.println(obj);
        System.out.println("updated list");
        obj.remove(128,"science");
        System.out.println(obj);


    }

}
