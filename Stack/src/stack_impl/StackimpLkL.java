package stack_impl;

// Generic Node
class Node<T> {
    T data;
    Node<T> next;

    Node(T data) {
        this.data = data;
        this.next = null;
    }
}

// Generic Stack using LinkedList
class Stack<T> {
    private Node<T> top; // top of stack

    Stack() {
        top = null;
    }

    // Push
    void push(T val) {
        Node<T> newNode = new Node<>(val);
        newNode.next = top;
        top = newNode;
        System.out.println(val + " pushed");
    }

    // Pop
    T pop() {
        if (isEmpty()) {
            System.out.println("Underflow (stack is empty)");
            return null;
        }
        T value = top.data;
        top = top.next;
        return value;
    }

    // Peek
    T peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return null;
        }
        return top.data;
    }

    // Check empty
    boolean isEmpty() {
        return top == null;
    }

    // Display stack
    void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.print("Stack (top -> bottom): ");
        Node<T> temp = top;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

// Driver class
public class StackimpLkL {
    public static void main(String[] args) {
        // Integer stack
        Stack<Integer> intStack = new Stack<>();
        intStack.push(10);
        intStack.push(20);
        intStack.push(30);
        intStack.display();
        System.out.println("Popped: " + intStack.pop());
        intStack.display();

        // String stack
        Stack<String> strStack = new Stack<>();
        strStack.push("Apple");
        strStack.push("Banana");
        strStack.push("Cherry");
        strStack.display();
        System.out.println("Top element: " + strStack.peek());
    }
}
