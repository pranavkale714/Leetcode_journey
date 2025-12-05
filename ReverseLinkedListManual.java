package com.List;

import java.util.*;

public class ReverseLinkedListManual {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));

        LinkedList<Integer> reversedList = new LinkedList<>();

        // Iterate from end to start using index
        for (int i = list.size() - 1; i >= 0; i--) {
            reversedList.add(list.get(i));
        }

        System.out.println("Reversed List: " + reversedList);
    }
}
