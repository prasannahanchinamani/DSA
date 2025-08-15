public class NthBiggestFromArray {
    static int nthBiggest(int arr[], int n) {
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] > arr[i])
                    count++;
            }
                if (count == n - 1) {
                    return arr[i];
                }
            }

            return -1;
        }
    static int nthSmallest(int arr[], int n) {
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] < arr[i])
                    count++;
            }
            if (count == n - 1) {
                return arr[i];
            }
        }

        return -1;
    }

        public static void main (String[]args){
            int arr[] = {1, 2, 3, 4, 5, 6, 7};
            System.out.println("Nth biggest " + nthBiggest(arr, 3));
            System.out.println("Nth Smallest " + nthSmallest(arr, 3));
        }
    }
