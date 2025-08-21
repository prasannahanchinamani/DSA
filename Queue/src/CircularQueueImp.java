
class CircularQueue<T> {
    private Node<T> front, rear;
    private int size;
    private final int capacity;

    CircularQueue(int capacity) {
        this.capacity = capacity;
        this.front = this.rear = null;
        this.size = 0;
    }

    // Enqueue
    public void enqueue(T val) {
        if (isFull()) {
            System.out.println("Overflow (Queue is full)");
            return;
        }

        Node<T> newNode = new Node<>(val);
        if (isEmpty()) {
            front = rear = newNode;
            rear.next = front;
        } else {
            rear.next = newNode;
            rear = newNode;
            rear.next = front;
        }
        size++;
    }

    // Dequeue
    public T dequeue() {
        if (isEmpty()) {
            System.out.println("Underflow (Queue is empty)");
            return null;
        }

        T value = front.data;

        if (front == rear) {
            front = rear = null;
        } else {
            front = front.next;
            rear.next = front;
        }
        size--;
        return value;
    }

    // Peek
    public T peek() {
        if (isEmpty()) {
            System.out.println("Underflow (Queue is empty)");
            return null;
        }
        return front.data;
    }

    // Display
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        Node<T> temp = front;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != front);
        System.out.println();
    }

    public boolean isEmpty() {
        return front == null;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public int size() {
        return size;
    }
}

// Test class
public class CircularQueueImp {
    public static void main(String[] args) {
        CircularQueue<Integer> cq = new CircularQueue<>(3); // fixed size = 3

        cq.enqueue(10);
        cq.enqueue(20);
        cq.enqueue(30);
        cq.display(); // 10 20 30

        cq.enqueue(40); // should print overflow

        System.out.println("Dequeued: " + cq.dequeue()); // removes 10
        cq.display(); // 20 30

        cq.enqueue(40);
        cq.display(); // 20 30 40

        System.out.println("Peek: " + cq.peek()); // 20
        System.out.println("Size: " + cq.size()); // 3
    }
}
