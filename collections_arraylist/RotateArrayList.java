package dsa.collections.collections_arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class RotateArrayList {
    public static <T> void rotateRight(ArrayList<T> arrayList, int k) {
        int n = arrayList.size();
        k = k % n;
        Collections.reverse(arrayList);
        Collections.reverse(arrayList.subList(0,k));
        Collections.reverse(arrayList.subList(k,n));
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 1; i <= 7; i++) {
            arr.add(i);
        }

        System.out.println("Original List: " + arr);

        int k = 3; // rotate 3 positions to the right
        rotateRight(arr, k);

        System.out.println("After rotating " + k + " positions to the right: " + arr);
    }
}
