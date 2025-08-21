import java.util.Stack;

class QueueUsingStacks<T> {
    private Stack<T> stack1 = new Stack<>();
    private Stack<T> stack2 = new Stack<>();

    // Enqueue operation
    public void enqueue(T val) {
        stack1.push(val);
    }

    // Dequeue operation
    public T dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow (empty)");
            return null;
        }

        if (stack2.isEmpty()) {
            // Move all elements from stack1 to stack2
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        return stack2.pop();
    }

    // Peek (front element)
    public T peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return null;
        }

        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.peek();
    }

    // Check empty
    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    // Size
    public int size() {
        return stack1.size() + stack2.size();
    }
}

public class QueueWithStacksDemo {
    public static void main(String[] args) {
        QueueUsingStacks<Integer> q = new QueueUsingStacks<>();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);

        System.out.println("Front element: " + q.peek());
        System.out.println("Dequeued: " + q.dequeue());
        System.out.println("Dequeued: " + q.dequeue());
        System.out.println("Front element: " + q.peek());
        System.out.println("Size: " + q.size());
    }
}
