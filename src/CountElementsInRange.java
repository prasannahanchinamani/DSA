public class CountElementsInRange {
    static  int countInRange(int arr[],int m,int n){
        int count=0;
        for(int i:arr){
            if(i>=m && i<=n)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[]={10,30,11,44,90};
        System.out.println("Range of Elements "+countInRange(arr,10,30));
    }
}
