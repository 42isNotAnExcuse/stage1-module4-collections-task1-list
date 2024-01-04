package com.epam.mjc.collections.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListCreator {
    public LinkedList<Integer> createLinkedList(List<Integer> sourceList) {
        LinkedList<Integer> res = new LinkedList<>();

        sourceList.forEach(i -> {
            if (i % 2 == 0) {
                res.addLast(i);
            } else {
                res.addFirst(i);
            }
        });
        return res;
    }
}
