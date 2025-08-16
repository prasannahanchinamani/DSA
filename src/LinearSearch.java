public class LinearSearch {
    static  int linearSearch(int arr[],int target){
        for(int i=0;i<arr.length;i++)
            if(arr[i]==target) {
                System.out.println("Is Found At index ");
                return i;
            }
        return  -1;
    }

    public static void main(String[] args) {
        int arr[]={1,20,10,24,21,34};
        System.out.println(linearSearch(arr,20));
    }
}
