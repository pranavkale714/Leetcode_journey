package com.List;

import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

public class HashMapIterationExample {
    public static void main(String[] args) {
        // Sample HashMap
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");
        map.put(4, "Date");

        System.out.println("Method 1: Using entrySet() with for-each loop");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        System.out.println("\nMethod 2: Using keySet() with for-each loop");
        for (Integer key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }

        System.out.println("\nMethod 3: Using entrySet() with Iterator");
        Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, String> entry = iterator.next();
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        System.out.println("\nMethod 4: Using forEach() method (Java 8+)");
        map.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));
    }
}
