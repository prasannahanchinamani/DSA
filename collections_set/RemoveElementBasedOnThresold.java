package dsa.collections.collections_set;

import java.util.*;

public class RemoveElementBasedOnThresold {
    public  static  Set<Integer> removeElements(TreeSet<Integer> set, int threshold) {
        Set<Integer> result = new TreeSet<>(set);
        Iterator<Integer> iterator = result.iterator();
        while (iterator.hasNext()) {
            int current = iterator.next();
            if (current <= threshold)
                iterator.remove();
        }
        return result;
    }

    public static void main(String[] args) {
        Set<Integer> sets = new TreeSet<>(Arrays.asList(1, 2, 3, 4, 5));
        Set<Integer>result=removeElements((TreeSet<Integer>)sets,3);
        System.out.println(result);

    }
}
