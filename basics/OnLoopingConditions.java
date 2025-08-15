package basicquestions;

public class OnLoopingConditions {
//while
	// n to 1
	void printnTo1(int n) {
		while (n > 0) {
			System.out.print(n + " ");
			n--;
		}
	}

	void printn1Ton(int n) {
		int i = 0;
		while (i < n) {
			i++;
			System.out.print(i + " ");
		}
	}
	void printEven1toN(int n) {
		int i=2;
		while(i<=n) {
		System.out.print(i+" ");
			i+=2;
		}
	}
	void printEvenNto1(int n) {
		if(n%2!=0)
			n--;
		while(n>=2) {
		System.out.print(n+" ");
			n-=2;
		}
	}
	
	
	void printOdd1toN(int n) {
		int i=1;
		while(i<=n) {
		System.out.print(i+" ");
			i+=2;
		}
	}
	void printOddNto1(int n) {
		if(n%2==0)
			n--;
		while(n>=1) {
		System.out.print(n+" ");
			n-=2;
		}
	}
	void multiplicationTable(int n) {
		int i=1;
		while(i<=10) {
			System.out.println(n+"*"+i+" : "+(n*i));
			i++;
		}
	}
	 void  factorial(int n) {
		 int fact=1;
		 while(n>0) {
			 fact*=n;
			 n--;
		 }
		 System.out.println(" factorial "+fact);
	 }
   void sumofNaturalNumber(int n) {
	   int sum=0;
	   while(n>0) {
		   sum+=n;
		   n--;
	   }
	   System.out.println("sum is:"+sum);
   }
   int reverseNumber(int number) {
	   int rev=0;
	   do {
		    int digit=number%10;
		    rev=rev*10+digit;
		    number/=10;
	   }while(number!=0);
	   return rev;
   }
   boolean numberPalindrome(int number) {
	   int reversenumber=reverseNumber(number);
	   if(number==reversenumber)
		   return true;
	   return false;
   }
    void biggestDigit(int number) {
    	int big=-9;
    	do {
    		int digit=number%10;
    		if(digit>big)
    			big=digit;
    		number/=10;
    	}while(number!=0);
    	System.out.println("Biggest Digit:"+big);
    }
    void nPowerP(int n,int p) {
    	int ans=1;
    	while(p>0) {
    		ans*=n;
    		p--;
    	}
    	System.out.println(ans);
    }
    void divisorCount(int number) {
    	int count=1;int i=1;
    	while(i<=number/2) {
    		if(number%i==0)
    			count++;
    		i++;
    	}
    	System.out.println(count);
    }
	public static void main(String[] args) {
		OnLoopingConditions loops = new OnLoopingConditions();
		int n = 5;
//		loops.printnTo1(n);
//		loops.printn1Ton(n);
//		loops.printOddNto1(n);
//		loops.multiplicationTable(n);
//		loops.factorial(n);
//		loops.sumofNaturalNumber(n);
//		System.out.println(loops.numberPalindrome(999));
//		loops.biggestDigit(198);
//		loops.nPowerP(2, 3);
		loops.divisorCount(4);
	}
}
