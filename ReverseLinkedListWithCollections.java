package com.List;

import java.util.*;

import java.util.*;

public class ReverseLinkedListWithCollections {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));

        System.out.println("Original List: " + list);

        // Reverse the LinkedList
        Collections.reverse(list);

        System.out.println("Reversed List: " + list);
    }
}
