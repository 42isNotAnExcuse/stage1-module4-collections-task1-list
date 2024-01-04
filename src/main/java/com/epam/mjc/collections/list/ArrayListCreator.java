package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayListCreator {
    public ArrayList<String> createArrayList(List<String> sourceList) {
        return sourceList.stream()
                .filter(s -> sourceList.indexOf(s) != 0 && (sourceList.indexOf(s) + 1) % 3 == 0)
                .flatMap(s -> Stream.of(s, s))
                .collect(Collectors.toCollection(ArrayList::new));
    }
}
