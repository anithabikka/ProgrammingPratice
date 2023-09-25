package javapratice.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapClearEmpty {
    public static void main(String[] args) {
        HashMap<Integer,String> map=new HashMap<>();
        map.put(200,"physics");
        map.put(150,"english");
        map.put(174,"maths");
        map.put(158,"telugu");
        map.put(220,"sanskrit");
        map.put(120,"hindi");
        for (Map.Entry mar : map.entrySet()){
            System.out.println(mar.getKey()+" "+mar.getValue());

        }
        System.out.println("after mapping");
        System.out.println(map.isEmpty());
        System.out.println("after the checking empty method");
        System.out.println("after invoking the clear method"+map.clone());
        map.clear();
        System.out.println(map);


    }
}
