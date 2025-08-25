package dsa.collections.collections_hashmap;

import java.util.ArrayList;
import java.util.HashMap;

public class IntersecationArray {
    public static void intersection(int arr1[], int arr2[]) {
        HashMap<Integer, Integer> count = new HashMap<>();
        ArrayList<Integer> result = new ArrayList<>();
        for (int num : arr1) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }
        for (int num : arr2) {
            if (count.containsKey(num) && count.get(num) > 0) {
                result.add(num);
                count.put(num, count.get(num) - 1);
            }
        }
        System.out.println("Intersection: " + result);

    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 3, 4};
        int[] arr2 = {2, 2, 3, 5};
        intersection(arr1,arr2);
    }
}
