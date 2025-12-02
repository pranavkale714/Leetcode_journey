package com.List;

import java.util.Arrays;
import java.util.LinkedList;

public class ReverseWithNewList {

    public static void main(String[] args) {
        // Initialize LinkedList
        LinkedList<Integer> li = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));

        System.out.println("Original LinkedList: " + li);

        // Reverse using a new list
        LinkedList<Integer> reversed = new LinkedList<>();
        for (int i = li.size() - 1; i >= 0; i--) {
            reversed.add(li.get(i));
        }

        System.out.println("Reversed LinkedList (new list): " + reversed);
    }
}
