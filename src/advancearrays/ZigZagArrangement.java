package advancearrays;

public class ZigZagArrangement {
    static int[] ZigZagArray(int arr1[], int arr2[]) {
     int merged[] = new int[arr1.length + arr2.length];
    int i = 0, j = 0, k = 0;
        while (i < arr1.length && j < arr2.length) {

            merged[k++] = arr1[i++];
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
        int arr1[]={1,3,5,7,9};
        int arr2[]={2,4,6,8,10,12,14};
        int zigzag[]=ZigZagArray(arr1,arr2);
        display(zigzag);
    }
}
