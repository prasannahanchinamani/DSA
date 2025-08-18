/*
To apply Binary Search algorithm:
The data structure must be sorted.
Access to any element of the data structure should take constant time.
 */
public class BinarySearch {
    static int binarySearch(int arr[], int target) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low) + (high - low) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    static int binarySearchRecursion(int arr[], int left, int right, int target) {
        if (left > right) {
            return -1;
        }
        int mid = (left + right) / 2;
        if (arr[mid] == target)
            return mid;
        else if (arr[mid] > target)
            return binarySearchRecursion(arr, left, mid - 1, target);
        else
            return binarySearchRecursion(arr, mid + 1, right, target);
    }

    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 10, 40};
        int element = 10;
        int result = binarySearch(arr, element);
        if (result == -1)
            System.out.println(
                    "Element is not present in array");
        else
            System.out.println("Element is present at "
                    + "index " + result);



        int[] arr1 = {1, 3, 5, 7, 9, 11};
        int target = 7;
        int result1 = binarySearchRecursion(arr1, 0, arr.length - 1, target);

        if (result1 == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element is present at index " + result);
        }
    }
}

