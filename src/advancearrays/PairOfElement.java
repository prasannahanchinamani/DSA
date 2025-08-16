package advancearrays;

public class PairOfElement {
    static  void printPairs(int arr[],int sum){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==sum){
                    System.out.println(arr[i]+" "+arr[j]);
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        printPairs(arr,5);
    }
}
