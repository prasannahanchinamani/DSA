package advancearrays;

public class Rotation {
    static int[] leftRotation(int arr[], int n) {
        n = n % arr.length;
        while (n > 0) {
            int first = arr[0];
            for (int i = 1; i < arr.length; i++) {
                arr[i - 1] = arr[i];
            }
            arr[arr.length - 1] = first;
            n--;
        }
        return arr;
    }

    static int[] rightRotation(int arr[], int n) {
        n = n % arr.length;
        while (n > 0) {
            int last = arr[arr.length - 1];
            for (int i = arr.length - 2; i >= 0; i--) {
                arr[i + 1] = arr[i];
            }
            arr[0] = last;
            n--;
        }
        return arr;
    }

    static void rotateArr(int arr[], int d) {
        int n = arr.length;
        d = d % n;  // in case d > n

        reverse(arr, 0, d - 1);
        reverse(arr, d, n - 1);
        reverse(arr, 0, n - 1);
    }

    // Helper: reverse array from index l to r
    static void reverse(int arr[], int l, int r) {
        while (l < r) {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }

    static void display(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        int left[] = leftRotation(arr, 2);
        display(left);
        System.out.println();
        int right[] = rightRotation(left, 1);
        display(right);

    }
}
