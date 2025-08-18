//divide and merge
public class MergeSort {
    static void divide(int arr[], int low, int high) {
        if (low >= high)
            return;
        int mid = (low + high) / 2;
        divide(arr, low, mid);
        divide(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }

    static void merge(int arr[], int low, int mid, int high) {
        int newarr[] = new int[high-low+1];
        int left = low, right = mid + 1, k = 0;
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                newarr[k++] = arr[left++];
            } else {
                newarr[k++] = arr[right++];
            }
        }
        while (left <= mid) {
            newarr[k++] = arr[left++];
        }
        while (right <= high) {
            newarr[k++] = arr[right++];
        }
        for (int i = 0; i < newarr.length; i++) {
            arr[low + i] = newarr[i];
        }
    }

    static void display(int arr[]) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {12, 15, 9, 8, 77, 51, 20};

        System.out.println("Original array: ");
        display(arr);
        divide(arr, 0, arr.length-1);
        System.out.print("Sorted array: ");
        System.out.println();
        display(arr);
    }
}
