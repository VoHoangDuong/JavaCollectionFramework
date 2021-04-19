package map.hashmap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<Integer, String>hashMap = new HashMap<Integer,String>();
        Map<Integer,String>linkedHashMap = new LinkedHashMap<Integer,String>();
        Map<Integer,String>treeMap = new TreeMap<Integer,String>();
        testMap(hashMap);
        System.out.println("__________________________________");

        testMap(linkedHashMap);
        System.out.println("___________________________________");

        testMap(treeMap);
        System.out.println("___________________________________");
    }

    public static void testMap(Map<Integer,String> test){
        test.put(20,"Duong");
        test.put(21,"Khanh");
        test.put(30,"Long");
        test.put(35,"Long");
        test.put(12,"Han");
        for (Integer key: test.keySet()
             ) {
            String value = test.get(key);
            System.out.println(key + "************" + value);
        }
    }
}
