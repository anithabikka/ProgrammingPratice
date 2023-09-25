package javapratice.maps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapMethods {
    public static void main(String[] args) {


    LinkedHashMap<String,String> map=new LinkedHashMap<String, String>();
    map.put("hyderabad","telengana");
    map.put("gandhi nagar","gujarat");
    map.put("lucknow","uttarpradesh");
    map.put("tiruvananthapuram","karala");
  //   Set set =map.entrySet();
     for(Map.Entry m:map.entrySet()){
        System.out.println(m.getKey()+" "+m.getValue());
        
    }


}}
