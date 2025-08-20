package stack_impl;

public class LLMain {
    public static void main(String[] args) {
        StackLL<Integer> stack = new StackLL<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element: " + stack.peek());  // 30
        System.out.println("Popped: " + stack.pop());        // 30
        System.out.println("Top element: " + stack.peek());  // 20
        System.out.println("Stack size: " + stack.size());   // 2
    }
}
