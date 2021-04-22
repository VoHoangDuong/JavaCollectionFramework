package map.hashmap.linkedhashmap;

import java.util.LinkedHashMap;

public class LinkedHashMapExample1 {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String>students = new LinkedHashMap<>();
        students.put(2,"Duong");
        students.put(3,"Nam");
        students.put(2,"Long");

        System.out.println("Before remove: ");
        System.out.println(students);

        students.remove(2);

        System.out.println("After remove:");

        System.out.println(students.toString());
    }
}
