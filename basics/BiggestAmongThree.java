package basics;

import java.util.*;
public class BiggestAmongThree{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the firstNumber");
int first=sc.nextInt();
System.out.println("Enter the SecondNumber");
int second=sc.nextInt();
System.out.println("Enter the  ThirdNumber");
int Third=sc.nextInt();
int big=first;
System.out.println("Biggest Among Three");
if(big<second)
big=second;
if(big<Third)
big=Third;
System.out.println("Bigget is :"+big);
}
}
