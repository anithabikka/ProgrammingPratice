package javapratice.maps;

import java.util.HashMap;
import java.util.Map;

public class HashSetCompute {
    public static void main(String[] args) {
        HashMap<Double,String> obj=new HashMap<>();
        obj.put(128.3,"biology");
        obj.put(130.24,"maths");
        obj.put(123.45,"sanskrit");
        obj.put(150.90,"english");
        obj.put(156.0,"physics");
        System.out.println(obj);
        System.out.println("updated list");

        System.out.println(obj.containsKey(124.67));
        System.out.println(obj.containsValue("science"));
        System.out.println("after checking  method");
        System.out.println(obj.get(128.3));
        System.out.println("updated list");
        System.out.println(obj.getOrDefault(156.0,"social"));
        System.out.println("after updating");
        obj.replace(156.0,"maths1b");
        System.out.println(obj);
        System.out.println("updated list");
        obj.replace(150.90,"english","maths2a");
        System.out.println(obj);
        System.out.println("the size of the map is "+ obj.size());
       for (Map.Entry obj1:obj.entrySet()){
            System.out.println(obj1.setValue("maths2b"));
        }
    }}

