package advancearrays;

import java.util.LinkedHashSet;

public class RemoveDuplicate {
    static int[] removeDuplicate(int arr[]) {
        int count = 0;
        boolean isFound[] = new boolean[26];
        for (int i = 0; i < arr.length; i++) {
            if (isFound[i] == false) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        isFound[i] = true;
                        count++;
                    }
                }
            }
        }
        int removearray[] = new int[arr.length - count];
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (isFound[i] == false)
                removearray[k++] = arr[i];
        }
        return removearray;
    }


    static int[] removeDuplicateUseCollection(int arr[]) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        // automatically removes duplicates, keeps insertion order
        for (int num : arr) {
            set.add(num);
        }

        // convert set back to array
        int result[] = new int[set.size()];
        int i = 0;
        for (int num : set) {
            result[i++] = num;
        }
        return result;
    }

    static void display(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }


    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 3, 3, 4, 5};
        int unique[] = removeDuplicate(arr);
        display(unique);

    }
}
