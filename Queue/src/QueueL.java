public class QueueL<T> {
    Node<T> front, rear;

    QueueL() {
        this.front = this.rear = null;
    }

    public void push_enque(T val) {
        Node<T> newNode = new Node<>(val);
        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    public T pop_deque() {
        if (front == null) {
            System.out.println("Underflow (queue is empty)");
            return null;
        }
        T value = front.data;
        front = front.next;
        if (front == null)
            rear = null;
        return value;
    }

  public   T peek() {
        if (front == null) {
            System.out.println("Queue is empty");
            return null;
        }
        return front.data;
    }

  public  void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.print(" (front -> rear): ");
        Node<T> temp = front;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }


    boolean isEmpty() {
        return front == null;
    }
}
