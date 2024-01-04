package com.epam.mjc.collections.list;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        sourceList.sort(new ListComparator());
        Collections.reverse(sourceList);
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int v1 = Integer.parseInt(a);
        int v2 = Integer.parseInt(b);
        return Math.abs(v2) - Math.abs(v1);
    }
}
