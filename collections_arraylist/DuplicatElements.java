package dsa.collections.collections_arraylist;

import java.util.*;

public class DuplicatElements {
    public static void removeduplicate(ArrayList<Integer> arrayList) {
        Set<Integer> seen = new HashSet<>();
        Iterator<Integer> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            int current = iterator.next();
            if (seen.contains(current))
                iterator.remove();
            else
                seen.add(current);
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 1, 2, 3));
        System.out.println(array);
        System.out.println("Removed Duplicate");
        removeduplicate(array);
        System.out.println(array);
        /*
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 1, 2, 3));
        HashSet<Integer> set = new HashSet<>(list);
        list.clear();
         list.addAll(set);

         */
    }
}
