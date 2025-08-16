package advancearrays;

import java.util.HashMap;
import java.util.Map;

public class UniqueArray {
    static void pritUnique(int arr[]) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int i : arr) {
            freq.put(i, freq.getOrDefault(i, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            if (entry.getValue() == 1)
                System.out.print(entry.getKey() + " ");
        }
    }
    static void printUniqueLoop(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            boolean isFound = true;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j] && i != j) {
                    isFound = false;
                    break;
                }
            }
            if (isFound)
                System.out.println(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 1, 2};
        pritUnique(arr);
        System.out.println();
        printUniqueLoop(arr);
    }
}
