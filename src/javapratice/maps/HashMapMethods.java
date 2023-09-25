package javapratice.maps;

import java.util.HashMap;
import java.util.Map;

public class HashMapMethods {
    public static void main(String[] args) {
        Map<Integer,String> stu=new HashMap<>();
        stu.put(101,"gowri");
        stu.put(103,"madhuri");
        stu.put(100,"kalyani");
        stu.put(102,"harshitha");
        stu.put(111,"deekshitha");
        for (Map.Entry m:stu.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
            System.out.println(m.hashCode());
        }

    }
}
