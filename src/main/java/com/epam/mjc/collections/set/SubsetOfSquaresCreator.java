package com.epam.mjc.collections.set;

import java.util.List;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        TreeSet<Integer> treeSetInteger = new TreeSet<>();
        for (int number : sourceList) {
            treeSetInteger.add(number * number);
        }
        return treeSetInteger.subSet(lowerBound, true, upperBound, true);
    }
}
