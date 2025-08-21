class Queue {
    int arr[];
    int front, rear;
    int size;

    Queue(int size) {
        this.size = size;
        arr = new int[size];
        front = -1;
        rear = -1;
    }

    // Enqueue
    public void push_enqueue(int val) {
        if (isFull()) {
            System.out.println("Overflow");
            return;
        }
        if (isEmpty()) {
            front = rear = 0;
        } else {
            rear++;
        }
        arr[rear] = val;
        System.out.println(val + " enqueued");
    }

    // Dequeue
    public void pop_dequeue() {
        if (isEmpty()) {
            System.out.println("Underflow");
            return;
        }
        System.out.println(arr[front] + " dequeued");
        if (front == rear) {
            front = rear = -1; // reset queue
        } else {
            front++;
        }
    }

    // Peek
    public int start() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[front];
    }

    // Check empty
    boolean isEmpty() {
        return front == -1;
    }

    // Check full
    boolean isFull() {
        return rear == size - 1;
    }

    // Display
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("Queue: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

// Driver class
public class QueueImpArray {
    public static void main(String[] args) {
        Queue q = new Queue(5);

        q.push_enqueue(10);
        q.push_enqueue(20);
        q.push_enqueue(30);
        q.display();

        q.pop_dequeue();
        q.display();

        System.out.println("Front element: " + q.start());
    }
}
