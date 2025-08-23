package dsa.collections.queue;

import java.util.Stack;

public class QueueUsingStacks {
    private Stack<Integer> s1 = new Stack<>();
    private Stack<Integer> s2 = new Stack<>();

    public void enqueue(int x) {
        s1.push(x);
    }

    public int dequeue() {
        if (s1.isEmpty() && s2.isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }

        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }

        return s2.pop();
    }

    public int peek() {
        if (s1.isEmpty() && s2.isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }

        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }

        return s2.peek();
    }

    public boolean isEmpty() {
        return s1.isEmpty() && s2.isEmpty();
    }

    public static void main(String[] args) {
        QueueUsingStacks queue = new QueueUsingStacks();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Front element: " + queue.peek()); // 10
        System.out.println("Dequeued: " + queue.dequeue());   // 10
        System.out.println("Dequeued: " + queue.dequeue());   // 20
        System.out.println("Is empty? " + queue.isEmpty());   // false
        System.out.println("Dequeued: " + queue.dequeue());   // 30
        System.out.println("Is empty? " + queue.isEmpty());   // true
    }
}
