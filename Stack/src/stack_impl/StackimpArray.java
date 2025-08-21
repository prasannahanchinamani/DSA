package stack_impl;

public class StackimpArray {
    private int arr[];
    private int top;
    private int size;

    StackimpArray(int size) {
        arr = new int[size];
        top = -1;
        this.size = size;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public int size() {
        return top + 1;
    }

    //push
    public void push(int val) {
        if (isFull()) {
            System.out.println("Over Flow");
            return;
        }
        arr[++top] = val;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow!");
            return -1;
        }
        return arr[top--];
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        }
        return arr[top];
    }

    public static void main(String[] args) {
        StackimpArray stack = new StackimpArray(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element: " + stack.peek());  // 30
        System.out.println("Stack size: " + stack.size());   // 3

        System.out.println("Popped: " + stack.pop());        // 30
        System.out.println("Top element: " + stack.peek());  // 20
    }
}
