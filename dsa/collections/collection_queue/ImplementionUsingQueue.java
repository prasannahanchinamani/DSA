package dsa.collections.collection_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ImplementionUsingQueue {
    private Queue<Integer> q1 = new LinkedList<>();
    private Queue<Integer> q2 = new LinkedList<>();

    public void push(int value) {
        q2.add(value);
        while (!q1.isEmpty()) {
            q2.add(q1.remove());
        }
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }

    public int pop() {
        if (q1.isEmpty()) {
            System.out.println("Its Empty");
        }
        return q1.poll();
    }

    public int peek() {
        if (q1.isEmpty()) {
            System.out.println("Its Empty");
        }
        return q1.peek();
    }

    public boolean isEmpty() {
        return q1.isEmpty();
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack);
        System.out.println("Top element: " + stack.peek()); // 30
        System.out.println("Popped: " + stack.pop());       // 30
        System.out.println("Popped: " + stack.pop());       // 20
        System.out.println("Is empty: " + stack.isEmpty()); // false
        System.out.println("Popped: " + stack.pop());       // 10
        System.out.println("Is empty: " + stack.isEmpty());
    }
}
