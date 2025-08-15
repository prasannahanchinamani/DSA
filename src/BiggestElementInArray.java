public class BiggestElementInArray {
    static int biggestElement(int arr[]) {
        int big = Integer.MIN_VALUE;
        for (int i : arr) {
            if (i > big)
                big = i;
        }
        return big;
    }


    static int smallestElement(int arr[]) {
        int small = Integer.MAX_VALUE;
        for (int i : arr) {
            if (i < small)
                small = i;
        }
        return small;
    }

    static int secondBiggest(int arr[]) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for (int i : arr) {
            if (i > first) {
                second = first;
                first = i;
            } else if (i>second && i!=first) {
                second=i;
            }
        }
        return second;
    }
    static  int secondSmallest(int arr[]){
        int first=Integer.MAX_VALUE;
        int second=Integer.MAX_VALUE;
        for(int i:arr){
            if(i<first) {
                second = first;
                first = i;
            }else if(i<second && i!=first)
                second=i;
        }
        return  second;
    }

    public static void main(String[] args) {
        int arr[] = {12, 13, 15, 20, 8};
        System.out.println("Biggest " + biggestElement(arr));
        System.out.println("Smallest " + smallestElement(arr));
        System.out.println("Second Biggest "+secondBiggest(arr));
        System.out.println("Second Smallest "+secondSmallest(arr));
    }
}
