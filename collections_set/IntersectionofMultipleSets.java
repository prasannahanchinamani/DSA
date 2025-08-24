package dsa.collections.collections_set;

import java.util.*;

public class IntersectionofMultipleSets {
    public static Set<Integer> intersectAll(List<Set<Integer>> sets) {
        Set<Integer> result= new HashSet<>(sets.get(0));
         for(int i=1;i<sets.size();i++){
             result.retainAll(sets.get(i));
         }
     return result;
    }

    public static void main(String[] args) {
        List<Set<Integer>> sets = new ArrayList<>();
        sets.add(new HashSet<>(Arrays.asList(1,2,3)));
        sets.add(new LinkedHashSet<>(Arrays.asList(2,3,4)));
        sets.add(new TreeSet<>(Arrays.asList(3,4,5)));
        Set<Integer>intersection=intersectAll(sets);
        System.out.println(intersection);
    }
}
