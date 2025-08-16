package advancearrays;

public class MisiingElement {
    static int missingElement(int arr[]) {
        int acsum = 0;
        for (int i = 0; i < arr.length; i++) {
            acsum += arr[i];
        }
        int n = arr.length+1;
        int sum = n * (n + 1)/ 2;
        return sum - acsum;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 6};
        System.out.println(missingElement(arr));
    }
}
