package basicquestions;

/* many questions with Ternary Operation see the Method Name U will get it */
import java.util.Scanner;

public class TernaryOperatorEvenOdd {
	private void EvenOddwithoutAnycontrol(int number) {
		String res[] = { "Even", "odd" };
		System.out.println(number + " is a " + res[number % 2]);
	}

	private void EvenOddTernary(int number) {
		String res = (number % 2 == 0) ? "Even" : "Odd";
		System.out.println(number + " is " + res);

	}

	private int biggestAmongThree(int number1, int number2, int number3) {
		return (number1 > number2) ? (number1 > number3 ? number1 : number3) : (number2 > number3 ? number2 : number3);
	}

	private int smallestAmongThree(int number1, int number2, int number3) {
		return (number1 < number2) ? (number1 < number3 ? number1 : number3) : (number2 < number3 ? number2 : number3);
	}

	private void ascendingOrderofThreeNumber(int number1, int number2, int number3) {
		int big = biggestAmongThree(number1, number2, number3);
		int small = smallestAmongThree(number1, number2, number3);
		int mid = (number1 + number2 + number3) - (big + small);
		System.out.println(small + " " + mid + " " + big);
	}

	public static void main(String[] args) {
		TernaryOperatorEvenOdd ternaryOperatorEvenOdd = new TernaryOperatorEvenOdd();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int number = scanner.nextInt();
		ternaryOperatorEvenOdd.EvenOddTernary(number);
		ternaryOperatorEvenOdd.EvenOddwithoutAnycontrol(number);
		System.out.println("Enter Three Numbers:/by after one Number Enter");
		int number1 = scanner.nextInt();
		int number2 = scanner.nextInt();
		int number3 = scanner.nextInt();
		int big = ternaryOperatorEvenOdd.biggestAmongThree(number1, number2, number3);
		System.out.println("Biggest Number:" + big);
		int small = ternaryOperatorEvenOdd.smallestAmongThree(number1, number2, number3);
		System.out.println("Smallest Number:" + small);
		ternaryOperatorEvenOdd.ascendingOrderofThreeNumber(number1, number2, number3);
	}
}
