package stack_impl;

public class SAMain {
    public static void main(String[] args) {
        StackArray stack = new StackArray(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element: " + stack.peek());  // 30
        System.out.println("Stack size: " + stack.size());   // 3

        System.out.println("Popped: " + stack.pop());        // 30
        System.out.println("Top element: " + stack.peek());  // 20
    }
}
