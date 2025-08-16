import java.util.Arrays;

public class BInarySearch {
    static  int binarySearch(int arr[],int target){
        Arrays.sort(arr);
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(arr[mid]==target)
                return mid;
            else if(arr[mid]<target)
                left=mid-1;
            else
                right=mid+1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]={12,12,13,14,15,16};
        System.out.println("Binary Search "+binarySearch(arr,13));
    }
}
