// with ModulsOperator (%)
package basics;

import java .util.Scanner; 
class EvenorOdd{
static boolean isEvenOdd(int number){
if(number%2==0){
System.out.println(number+" is Even");
return true;
}
else{
System.out.println(number+" is Odd");
}
return false;
}
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Number");
int number=sc.nextInt();
System.out.println(isEvenOdd(number));
}
}
