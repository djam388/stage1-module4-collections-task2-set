package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Set<String> firstCombination = new HashSet<>(firstSet);
        Set<String> secondCombination = new HashSet<>(secondSet);
        Set<String> thirdCombination = new HashSet<>(thirdSet);
        firstSet.retainAll(secondSet);
        if (firstSet.size() != 0) {
            firstSet.removeAll(thirdSet);
            thirdCombination.removeAll(firstCombination);
            thirdCombination.removeAll(secondCombination);
            firstSet.addAll(thirdCombination);
        }
        else {
            thirdSet.removeAll(firstCombination);
            thirdSet.removeAll(secondCombination);
            return thirdSet;
        }
        return firstSet;
//        throw new UnsupportedOperationException("You should implement this method.");
    }
}
