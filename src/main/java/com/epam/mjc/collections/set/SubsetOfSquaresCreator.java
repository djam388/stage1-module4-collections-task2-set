package com.epam.mjc.collections.set;

import java.util.*;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        Iterator<Integer> iterator = sourceList.iterator();
        NavigableSet<Integer> subsetOfSquares = new TreeSet<>();

        while (iterator.hasNext()) {
            int val = iterator.next();
            subsetOfSquares.add(val * val);
        }

        List<Integer> range = new ArrayList<>();

        for (int i = lowerBound; i <= upperBound; i++) {
            range.add(i);
        }

        subsetOfSquares.retainAll(range);
        return subsetOfSquares;
        //throw new UnsupportedOperationException("You should implement this method.");
    }
}
