public class QuickSort {

    public void quicksort(int arr[], int start, int end) {
        if (start >= end)
            return;
        int pivot = partition(arr, start, end);
        quicksort(arr, start, pivot - 1);
        quicksort(arr, pivot + 1, end);
    }

    private void swap(int arr[], int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    private int partition(int[] arr, int low, int high) {
        int position = low;
        for (int i = low; i <= high; i++) {
            if (arr[i] <= arr[high]) {
                swap(arr, i, position);
                position++;
            }
        }
        return position - 1;
    }

    static void display(int arr[]) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();
        int arr[] = {1, 3, 4, 5, 1, 2};
        quickSort.quicksort(arr, 0, arr.length - 1);
        display(arr);
    }

}
