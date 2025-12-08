package com.List;

import java.util.*;

public class ReverseLinkedListUsingIterator {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));

        // Using descendingIterator() of LinkedList
        Iterator<Integer> it = list.descendingIterator();

        System.out.print("Reversed List: ");
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
    }
}
