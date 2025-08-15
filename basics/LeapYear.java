package basicquestions;

import java.util.Scanner;

public class LeapYear {
	public boolean isleap(int year) {
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
			return true;
		return false;
	}

	public static void main(String[] args) {
		System.out.println("Enter the Year to check Leapyear or Not");
		Scanner scanner = new Scanner(System.in);
		int year = scanner.nextInt();
		LeapYear leapYear = new LeapYear();
		System.out.println(leapYear.isleap(year));
	}
}
