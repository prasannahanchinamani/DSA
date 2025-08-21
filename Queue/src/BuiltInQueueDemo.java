import java.util.*;

public class BuiltInQueueDemo {
    public static void reverse(Queue<Integer> q) {
        Stack<Integer> temp = new Stack<>();
        while (!q.isEmpty()) {
            temp.push(q.poll());
        }
        while (!temp.isEmpty()) {
            q.offer(temp.pop());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);

        System.out.println("Queue: " + q);

        System.out.println("Front: " + q.peek());

        System.out.println("Dequeued: " + q.poll());
        System.out.println("Queue after dequeue: " + q);
        reverse(q);
        System.out.println("Reversed Queue (Stack): " + q);

        System.out.println("Size: " + q.size());
    }
}
