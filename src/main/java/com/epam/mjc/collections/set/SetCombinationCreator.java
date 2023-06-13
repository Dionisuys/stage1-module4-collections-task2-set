package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Set<String> subset = new HashSet<>(firstSet);
        subset.retainAll(secondSet);
        subset.removeAll(thirdSet);
        for (String s : thirdSet) {
            if (!firstSet.contains(s) && !secondSet.contains(s)) {
                subset.add(s);
            }
        }
        return subset;
    }
}
