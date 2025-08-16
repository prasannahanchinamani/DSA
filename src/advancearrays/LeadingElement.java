package advancearrays;

public class LeadingElement {
public static int leadingElement(int arr[]){
    int max=arr[arr.length-1];
    for(int i=arr.length-2;i>=0;i--){
        if(arr[i]>max){
            max=arr[i];
        }
    }
    return max;
}

    public static  int findPeakElement(int[] nums) {
        int big = nums[0];
        int index = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > big) {
                big = nums[i];
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int arr[]={2,3,6,8,9,1,2,6};
        System.out.println(leadingElement(arr));
        System.out.println(findPeakElement(arr));
    }
}
