package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> createdHashSet = new HashSet<>();
        Iterator<Integer> iterator = sourceList.iterator();

        while (iterator.hasNext()) {
            int val = iterator.next();
            if ((val % 2) == 0) {
                createdHashSet.add(val);
                while (((val / 2) % 2) == 0) {
                    val /= 2;
                    createdHashSet.add(val);
                }
                if ((val / 2) > 2) {
                    createdHashSet.add(val / 2);
                }
                else {
                    createdHashSet.add(1);
                }
            }
            else {
                createdHashSet.add(val);
                createdHashSet.add(val * 2);
            }

        }
        return createdHashSet;
    }
}
