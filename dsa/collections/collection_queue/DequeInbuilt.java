package dsa.collections.collection_queue;

import java.util.Deque;
import java.util.LinkedList;

public class DequeInbuilt {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>(); // built-in deque

        // Add elements
        deque.offerLast(10); // add at back
        deque.offerLast(20);
        deque.offerFirst(5); // add at front

        System.out.println(deque); // [5, 10, 20]

        // Remove elements
        deque.pollFirst(); // removes 5
        deque.pollLast();  // removes 20
        System.out.println(deque); // [10]

        // Peek
        deque.offerLast(20);
        System.out.println("Front: " + deque.peekFirst()); // 10
        System.out.println("Back: " + deque.peekLast());   // 20
    }
}
