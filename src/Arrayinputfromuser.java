import java.util.Scanner;

public class Arrayinputfromuser {
    static Scanner scanner = new Scanner(System.in);

    int[] input(int number) {
        System.out.println("Enter Elements");
        int arr[] = new int[number];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    void displayarr(int arr[]) {
        System.out.println("Dispalying Elements");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter the number of Elements");
        int number = scanner.nextInt();
        Arrayinputfromuser arrayinputfromuser = new Arrayinputfromuser();
         int arr[]=arrayinputfromuser.input(number);
         arrayinputfromuser.displayarr(arr);
    }
}
