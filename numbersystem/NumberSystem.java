package numbersystem;

import java.util.HashSet;
import java.util.Set;
/* check all Method Names You will get it*/
public class NumberSystem {

    // Prime number check
    static boolean isPrimeNumber(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    // Perfect number
    static boolean isPerfect(int number) {
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) sum += i;
        }
        return sum == number;
    }

    // Strong number
    static boolean isStrongNumber(int number) {
        int sum = 0, temp = number;
        while (number != 0) {
            sum += fact(number % 10);
            number /= 10;
        }
        return temp == sum;
    }

    // Armstrong number
    static boolean isArmStrong(int number) {
        int count = digitCount(number);
        int sum = 0, temp = number;
        while (number != 0) {
            sum += power(number % 10, count);
            number /= 10;
        }
        return temp == sum;
    }

    // Happy number
    static boolean isHappyNumber(int number) {
        Set<Integer> seen = new HashSet<>();
        while (number != 1 && !seen.contains(number)) {
            seen.add(number);
            number = SquareSum(number);
        }
        return number == 1;
    }

    // Disarium number
    static boolean isDisarium(int number) {
        int count = digitCount(number);
        int sum = 0, temp = number;
        while (number != 0) {
            sum += power(number % 10, count);
            count--;
            number /= 10;
        }
        return temp == sum;
    }

    // Neon number
    static boolean isNeon(int number) {
        int square = number * number;
        int sum = 0;
        while (square != 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == number;
    }

    // Harshad/Niven number
    static boolean isHarshad(int number) {
        int temp = number, sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return temp % sum == 0;
    }

    // Automorphic number
    static boolean isAutoMorphic(int number) {
        int square = number * number;
        int temp = number, divisor = 1;
        while (temp > 0) {
            divisor *= 10;
            temp /= 10;
        }
        return square % divisor == number;
    }

    // Xylem / Phloem number
    static String isXylemPhloem(int number) {
        int extremeSum = 0, meanSum = 0;
        int temp = number;

        extremeSum += temp % 10; // last digit
        temp /= 10;
        while (temp >= 10) {
            meanSum += temp % 10;
            temp /= 10;
        }
        extremeSum += temp; // first digit

        return (extremeSum == meanSum) ? "Xylem" : "Phloem";
    }

    // Utility: sum of squares of digits
    static int SquareSum(int number) {
        int sum = 0;
        while (number != 0) {
            int digit = number % 10;
            sum += digit * digit;
            number /= 10;
        }
        return sum;
    }

    // Utility: count digits
    static int digitCount(int number) {
        int count = 0;
        while (number != 0) {
            count++;
            number /= 10;
        }
        return count;
    }

    // Utility: power function
    static int power(int n, int p) {
        int product = 1;
        while (p > 0) {
            product *= n;
            p--;
        }
        return product;
    }

    // Utility: factorial
    static int fact(int number) {
        int fact = 1;
        while (number > 1) {
            fact *= number;
            number--;
        }
        return fact;
    }

    // Palindrome number
    static boolean isPalindrome(int number) {
        int temp = number, rev = 0;
        while (number != 0) {
            rev = rev * 10 + (number % 10);
            number /= 10;
        }
        return rev == temp;
    }

    // MAIN METHOD - Testing all functions
    public static void main(String[] args) {
        int[] testNumbers = {5, 6, 25, 76, 121, 153, 370, 407, 19, 89};

        for (int num : testNumbers) {
            System.out.println("\nNumber: " + num);
            System.out.println("Prime? " + isPrimeNumber(num));
            System.out.println("Perfect? " + isPerfect(num));
            System.out.println("Strong? " + isStrongNumber(num));
            System.out.println("Armstrong? " + isArmStrong(num));
            System.out.println("Happy? " + isHappyNumber(num));
            System.out.println("Disarium? " + isDisarium(num));
            System.out.println("Neon? " + isNeon(num));
            System.out.println("Harshad/Niven? " + isHarshad(num));
            System.out.println("Automorphic? " + isAutoMorphic(num));
            System.out.println("Xylem/Phloem: " + isXylemPhloem(num));
            System.out.println("Palindrome? " + isPalindrome(num));
        }
    }
}
