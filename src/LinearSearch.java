/*Linear Search : It is used for an unsorted array.
 It mainly does one by one comparison of the item to be search with array elements. It takes linear or O(n) Time.
 */
public class LinearSearch {
    static int search(int arr[], int element) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == element)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 10, 40};
        int element = 10;

        int result = search(arr, element);
        if (result == -1)
            System.out.print(
                    "Element is not present in array");
        else
            System.out.print("Element is present at index "
                    + result);
    }
}
