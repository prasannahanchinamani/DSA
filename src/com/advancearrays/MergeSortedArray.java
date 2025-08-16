package com.advancearrays;

public class MergeSortedArray {
    static int[] mergeSortedArray(int arr1[], int arr2[]) {
        int merged[] = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j])
                merged[k++] = arr1[i++];
            else
                merged[k++] = arr2[j++];
        }
        while (i < arr1.length)
            merged[k++] = arr1[i++];
        while (j < arr2.length)
            merged[k++] = arr2[j++];
        return merged;
    }

    static void display(int arr[]) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int arr1[] = {1, 3, 4, 7, 9};
        int arr2[] = {2, 3, 8, 10, 15, 12};
        int merged[] = mergeSortedArray(arr1, arr2);
        display(merged);
    }
}
