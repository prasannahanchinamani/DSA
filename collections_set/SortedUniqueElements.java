package dsa.collections.collections_set;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

public class SortedUniqueElements {
    public static TreeSet<Integer> sortedUniqueElements(List<Integer>list){
        return new TreeSet<>(list);
    }
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>(Arrays.asList(7, 2, 9, 1, 2, 9));
        System.out.println(list);
        TreeSet<Integer>uniqueelemets=sortedUniqueElements(list);
        System.out.println(uniqueelemets);
    }
}
