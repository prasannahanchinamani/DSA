class StackL<T> {
    private Node<T> top;
    private int size;

    StackL() {
        top = null;
        size = 0;
    }

    public void push(T val) {
        Node<T> newNode = new Node<>(val);
        newNode.next = top;  // new node points to old top
        top = newNode;       // move top to new node
        size++;
    }


    public T pop() {
        if (isEmpty()) {
            System.out.println("Underflow (stack is empty)");
            return null;
        }
        T value = top.data;  // remove from head (top)
        top = top.next;
        size--;
        return value;
    }

    public T peek() {
        if (isEmpty())
            return null;
            return top.data;

    }
    boolean isEmpty() {
        return top == null;
    }
    public  void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.print(" (top -> bottom): ");
        Node<T> temp = top;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

}
public class StackImpQueue {
    public static void main(String[] args) {
        StackL<Integer> stack = new StackL<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.display(); // (top -> bottom): 30 20 10
        System.out.println("Peek: " + stack.peek()); // 30
        System.out.println("Popped: " + stack.pop()); // 30
        stack.display(); // (top -> bottom): 20 10
    }
}
