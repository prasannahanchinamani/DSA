package dsa.collections.collections_set;

import java.util.*;

public class Subset {

    public static boolean subsetCheck(Set<Integer> setA, Set<Integer> setB) {
        // Check using HashSet
        Set<Integer> hashSetA = new HashSet<>(setA);
        if (setB.containsAll(hashSetA)) {
            System.out.println("HashSet subset check: true");
        }

        Set<Integer> linkedHashSetA = new LinkedHashSet<>(setA);
        if (setB.containsAll(linkedHashSetA)) {
            System.out.println("LinkedHashSet subset check: true");
        }


        Set<Integer> treeSetA = new TreeSet<>(setA);
        if (setB.containsAll(treeSetA)) {
            System.out.println("TreeSet subset check: true");
        }


        return setB.containsAll(setA);
    }

    public static void main(String[] args) {
        Set<Integer> setA = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> setB = new HashSet<>(Arrays.asList(1, 2, 3, 4));

        boolean isSubset = subsetCheck(setA, setB);
        System.out.println("SetA is subset of SetB: " + isSubset);
    }
}
