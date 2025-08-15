package basics;
import java.util.*;
//  Sum of its Digits and Product Of  its Digit is Equals to that Number

class SpecialNumber{
static  int DigitSum(int number){
int sum=0;
while(number!=0){
int digit=number%10;
sum+=digit;
number=number/10;
}
return sum;
}
static int DigitProduct(int number){
int product=1;
while(number!=0){
int  digit=number%10;
product*=digit;
number/=10;
}
return product;
}
public static void  main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Number");
int number=sc.nextInt();
int sum=DigitSum(number);
int product=DigitProduct(number);
if(sum+product==number)
System.out.println("Special Number");
else
System.out.println("Not a Special Number");
}
}

