package com.List;

import java.util.Arrays;
import java.util.LinkedList;

public class ReverseInPlace {

    public static void main(String[] args) {
        // Initialize LinkedList
        LinkedList<Integer> li = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));

        System.out.println("Original LinkedList: " + li);

        // In-place reversal
        int size = li.size();
        for (int i = 0; i < size - 1; i++) {
            li.add(i, li.removeLast());
        }

        System.out.println("Reversed LinkedList (in-place): " + li);
    }
}
