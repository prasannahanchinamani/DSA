package advancearrays;

public class Duplicate {
    static void Duplicate(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    System.out.println("Duplicate Element:" + arr[i]);
            }
        }
    }

    static void removeDuplicate(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = true;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = false;
                    break;
                }
            }
            if (!isDuplicate)
                System.out.println(arr[i] + " ");
        }
    }

    static int[] removeDuplicateWithoutbooelan(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    arr[j] = arr[n - 1];
                    n--;
                    j--;
                }
            }
        }
        int remove[] = new int[n];
        for (int i = 0; i < n; i++) {
            remove[i] = arr[i];
        }
        return remove;
    }

    static void display(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }


    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 4};
        Duplicate(arr);
        removeDuplicate(arr);
//        removeDuplicateWithoutbooelan(arr);
        int unique[]=removeDuplicateWithoutbooelan(arr);
        display(unique);
    }
}
