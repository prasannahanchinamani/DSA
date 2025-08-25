package dsa.collections.collections_arraylist;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class NonRepatingFirstElement {
    public static void nonRepeating(ArrayList<Integer> list) {
        ArrayList<Integer> temp = new ArrayList<>(list);
        Map<Integer, Integer> countfreq = new HashMap<>();
        for (int i : temp) {
            countfreq.put(i, countfreq.getOrDefault(i, 0) + 1);
        }
        for (int num : list) {
            if (countfreq.get(num) == 1) {
//                System.out.println(countfreq.get(num));
                System.out.println(num);
                break;
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(5);
        list.add(1);
        list.add(2);
        list.add(0);
        list.add(4);
        list.add(1);
        list.add(5);
        nonRepeating(list);

    }
}
