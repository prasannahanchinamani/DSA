package advancearrays;

public class TripletSum {
    static void pairTriplets(int arr[], int n) {
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == n) {
                        System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
                        break;
                    }
                }
            }
        }

    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        pairTriplets(arr, 8);
    }

}
