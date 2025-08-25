package dsa.collections_linkedlist;
import java.util.LinkedList;

public class PalindromeCheck {
    public static <T> boolean isPalindrome(LinkedList<T> list) {
        int left = 0;
        int right = list.size() - 1;
        while (left < right) {
            if (!list.get(left).equals(list.get(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        LinkedList<Character> list = new LinkedList<>();
        list.add('r');
        list.add('a');
        list.add('c');
        list.add('e');
        list.add('c');
        list.add('a');
        list.add('r');

        System.out.println("Is palindrome: " + isPalindrome(list)); // true
    }
}
