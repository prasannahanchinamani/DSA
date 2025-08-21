import java.util.*;

public class SortQueueUsingStack {
    public static void sortQueue(Queue<Integer> q) {
        Stack<Integer> stack = new Stack<>();

        while (!q.isEmpty()) {
            int temp = q.poll();

            while (!stack.isEmpty() && stack.peek() > temp) {
                q.add(stack.pop());
            }
            stack.push(temp);
        }


        while (!stack.isEmpty()) {
            q.add(stack.pop());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(30);
        q.add(10);
        q.add(20);
        q.add(50);
        q.add(40);

        System.out.println("Original Queue: " + q);

        sortQueue(q);

        System.out.println("Sorted Queue: " + q);
    }
}
