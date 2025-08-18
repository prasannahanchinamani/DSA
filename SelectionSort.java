public class SelectionSort {
    /* Select Minimum and Swap */
    static void display(int arr[]) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    static void selectionsort(int arr[]) {
        for (int i = 0; i < arr.length - 2; i++) {
            int miniidx = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[miniidx])
                    miniidx = j;
            }
            swap(arr,i,miniidx);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 64, 25, 12, 22, 11 };

        System.out.print("Original array: ");
        display(arr);

        selectionsort(arr);

        System.out.print("Sorted array: ");
        display(arr);
    }
}
