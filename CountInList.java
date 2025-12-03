package com.List;

import java.util.*;

public class CountInList {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");

        // Create a HashMap to store frequency
        Map<String, Integer> frequencyMap = new HashMap<>();

        for (String fruit : list) {
            // If the fruit is already in the map, increment count, else set to 1
            frequencyMap.put(fruit, frequencyMap.getOrDefault(fruit, 0) + 1);
        }

        // Print the frequency map
        for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
