package dsa.collections.collections_set;

import java.util.*;

public class FindingFirstNon_DuplicateElement {

    public static int nonduplicate(List<Integer> list) {
        Set<Integer> seen = new LinkedHashSet<>();
        Set<Integer> duplicate = new HashSet<>();
        for (int num : list) {
            if (!seen.add(num))
                duplicate.add(num);
        }
        for (int num : list) {
            if (!duplicate.contains(num))
                return num;
        }
        return -1;
    }

    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>(Arrays.asList(4, 5, 6, 4, 7, 8, 5));
        System.out.println(list);
        int output = nonduplicate(list);
        System.out.println(output);
    }
}
