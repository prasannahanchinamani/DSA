//Adjacent swap and put max to end
public class BubbleSort {
    static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void bubblesort(int arr[]) {
        int n = arr.length;
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 0; j <= i - 1; j++) {
                if (arr[j] > arr[j + 1])
                    swap(arr, j + 1, j);
            }
        }
    }

    static void display(int arr[]) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        int n = arr.length;
        System.out.println("Before Sorting array: ");
        display(arr);
        bubblesort(arr);
        System.out.println("Sorted array: ");
        display(arr);
    }
}
