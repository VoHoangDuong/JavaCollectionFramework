package map.hashmap.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample3 {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<Integer, String>();
        hashMap.put(2, "Java");
        hashMap.put(3,"Python");
        hashMap.put(4,"C++");
        hashMap.put(5,"PHP");
        // show hashmap
        for (Map.Entry<Integer,String>element: hashMap.entrySet()) {
            System.out.println("Key: " + element.getKey() + " Value: " + element.getValue());
        }
    }
}
