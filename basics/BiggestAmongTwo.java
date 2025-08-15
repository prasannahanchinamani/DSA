package basics;

import java.util.*;
public class BiggestAmongTwo{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the firstNumber");
int first=sc.nextInt();
System.out.println("Enter the SecondNumber");
int second=sc.nextInt();
System.out.println("Biggest Among Two");
if(first>second)
System.out.println("Biggest is :"+first);
else
System.out.println("Bigget is :"+second);
}
}
