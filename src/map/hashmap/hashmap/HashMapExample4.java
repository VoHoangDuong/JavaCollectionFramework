package map.hashmap.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

//Su dung iterator duyet cac phan tu cua HashMap
public class HashMapExample4 {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<Integer,String>();
        treeMap.put(1,"Java");
        treeMap.put(2,"Python");
        treeMap.put(3,"C++");
        treeMap.put(4,"PHP");
        Iterator<Integer> iterator = treeMap.keySet().iterator();
        while (iterator.hasNext()){
            System.out.println(treeMap.get(iterator.next()));
        }
    }
}
