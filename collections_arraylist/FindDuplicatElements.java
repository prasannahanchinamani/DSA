package dsa.collections.collections_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindDuplicatElements {
    public static void findduplicate(ArrayList<Integer> arrayList) {
        Set<Integer> duplicates = new HashSet<>();
        Set<Integer> uniques = new HashSet<>();
        for (Integer num : arrayList) {
            if (!uniques.contains(num))
                duplicates.add(num);
        }
        System.out.println("Duplicate elements are: " + duplicates);

    }

    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 1, 2, 3));
        System.out.println(array);
        System.out.println("Removed Duplicate");
        findduplicate(array);
//        System.out.println(array);
        /*
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 1, 2, 3));
        HashSet<Integer> set = new HashSet<>(list);
        list.clear();
         list.addAll(set);

         */
    }
}
