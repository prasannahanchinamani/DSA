public class PrimeNumberInArray {
    static boolean isPrime(int number){
        if(number<2)
            return  false;
        for(int i=2;i*i<number;i++){
            if(number%i==0)
                return  false;
        }
        return true;
    }
    static int  countPrimeNumberInArray(int arr[]){
         int count=0;
         for (int i:arr){
             if(isPrime(i))
                 count++;
         }
         return count;
    }
    public static void main(String[] args) {
 int arr[]={3,5,7,11,13,15};
        System.out.println("Prime Number Count\n"+countPrimeNumberInArray(arr));
    }
}
