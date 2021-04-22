package map.hashmap.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample5 {
    public static void main(String[] args) {
        HashMap<Integer,String> students = new HashMap<Integer,String>();
        students.put(10,"Duong");
        students.put(11,"Khanh");
        students.put(12,"Long");
        students.put(14,"Han");
        System.out.println("Phan tu co key = 10: " + students.get(10));
        System.out.println("Phan thu co key = 11: " + students.get(11));
        for (Map.Entry<Integer,String> st: students.entrySet()) {
            System.out.println("Phan tu co key = " + st.getKey() + " " + " co gia tri la: " + st.getValue());
        }
    }
}
