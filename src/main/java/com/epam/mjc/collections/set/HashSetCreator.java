package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> hashSetInteger = new HashSet<>();
        for (int number : sourceList) {
            while (number % 2 == 0) {
                hashSetInteger.add(number);
                number /= 2;
            }
            hashSetInteger.add(number);
            hashSetInteger.add(number * 2);
        }
        return hashSetInteger;
    }
}
