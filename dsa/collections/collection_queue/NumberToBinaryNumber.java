package dsa.collections.collection_queue;

import java.util.LinkedList;
import java.util.Queue;

public class NumberToBinaryNumber {
    public static void generateBinary(int n) {
        Queue<String> queue = new LinkedList<>();
        queue.add("1");
        for (int i = 1; i <= n; i++) {
            String s = queue.remove();
            System.out.print(s + " ");
            queue.add(s + "0");
            queue.add(s + "1");
        }

    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("Binary numbers from 1 to " + n + ":");
        generateBinary(n);
    }
}
