public class SumofArray {
    static int sum(int arr[]) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
int arr[]={2,2,3,3,5};
        System.out.println("Sum of Array"+sum(arr));
    }
}
