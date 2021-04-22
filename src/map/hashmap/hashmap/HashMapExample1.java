package map.hashmap.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample1 {
    public static void main(String[] args) {
        Map<Integer,String>hashMap = new HashMap<>();
        hashMap.put(1,"Java");
        hashMap.put(2,"PHP");
        hashMap.put(3,"C++");
        hashMap.put(4,"Python");
//        System.out.println(hashMap);
        for(Map.Entry<Integer, String> element : hashMap.entrySet()){
            System.out.println(element.toString());
        }
    }
}
