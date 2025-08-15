package basicquestions;

import java.util.Scanner;

public class DateMonthYearValidation {
	public String isValid(int date, int month, int year) {
		// years start from 1 but we want from 1947
		if (date < 1 || date > 31 || month < 1 || month > 12 || year < 1947)
			return "Invalid";
		else if ((month == 1 || month == 4 || month == 6 || month == 9) && (date > 30))
			return "Invalid";
		else if ((month == 2 && !((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) && date > 28))
			return "Invalid";
		else
			return "valid";
	}

	static void monthNumberDays() {
		int days[] = { 28, 31, 30 };
		System.out.println("Enter the Month Number to check Number of Days:");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		if (number < 1 || number > 12)
			System.out.println("Not valid Enter between (1-12):");
		switch (number) {
		case 1:
			System.out.println("January:" + days[1]);
			break;
		case 2:
			System.out.println("Febrauary:" + days[0]);
			break;
		case 3:
			System.out.println("March:" + days[1]);
			break;
		case 4:
			System.out.println("April:" + days[2]);
			break;
		case 5:
			System.out.println("May:" + days[1]);
			break;
		case 6:
			System.out.println("June:" + days[1]);
			break;

		case 7:
			System.out.println("July:" + days[2]);
			break;
		case 8:
			System.out.println("August:" + days[1]);
			break;
		case 9:
			System.out.println("Septmber:" + days[2]);
			break;
		case 10:
			System.out.println("Octomber:" + days[1]);
			break;
		case 11:
			System.out.println("November:" + days[2]);
			break;
		case 12:
			System.out.println("December:" + days[1]);
			break;
		default:
			monthNumberDays();

		}

	}

	public static void main(String[] args) {
		DateMonthYearValidation datemonthyearValidation = new DateMonthYearValidation();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the date:");
		int date = scanner.nextInt();
		System.out.println("Enter the Month:");
		int month = scanner.nextInt();
		System.out.println("Enter the Year:");
		int year = scanner.nextInt();
		String res = datemonthyearValidation.isValid(date, month, year);
		System.out.println(date + "/" + month + "/" + year + " is " + res);
		datemonthyearValidation.monthNumberDays();
	}
}
