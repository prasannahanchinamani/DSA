public class EvenOddNumberinArray {

    int[] EvenNumberArray(int arr[]) {
        int count = 0;
        for (int num : arr) {
            if (num % 2 == 0) count++;
        }
        int[] evenArr = new int[count];
        int j = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                evenArr[j++] = num;
            }
        }
        return evenArr;
    }

    int[] OddNumberArray(int arr[]) {
        int count = 0;
        for (int num : arr) {
            if (num % 2 != 0) count++;
        }
        int[] oddArr = new int[count];
        int j = 0;
        for (int num : arr) {
            if (num % 2 != 0) {
                oddArr[j++] = num;
            }
        }
        return oddArr;
    }

    void displayarr(int arr[]) {
        System.out.println("Displaying Elements:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};

        EvenOddNumberinArray evenOddNumberinArray = new EvenOddNumberinArray();

        int even[] = evenOddNumberinArray.EvenNumberArray(arr);
        int odd[] = evenOddNumberinArray.OddNumberArray(arr);

        System.out.println("Even Numbers");
        evenOddNumberinArray.displayarr(even);

        System.out.println("Odd Numbers");
        evenOddNumberinArray.displayarr(odd);
    }
}
