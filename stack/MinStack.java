import java.util.Stack;

public class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    // Constructor initializes both stacks
    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    // Push element onto stack
    public void push(int x) {
        stack.push(x);
        // Push to minStack if empty or new min found
        if (minStack.isEmpty() || x <= minStack.peek()) {
            minStack.push(x);
        }
    }

    // Remove element from stack
    public void pop() {
        if (stack.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        int popped = stack.pop();
        // Pop from minStack if popped element is minimum
        if (popped == minStack.peek()) {
            minStack.pop();
        }
    }

    // Get top element
    public int top() {
        if (stack.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return stack.peek();
    }

    // Get minimum element in the stack
    public int getMin() {
        if (minStack.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return minStack.peek();
    }

    // Example usage
    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(3);
        minStack.push(5);
        System.out.println("Min: " + minStack.getMin());  // 3
        minStack.push(2);
        minStack.push(1);
        System.out.println("Min: " + minStack.getMin());  // 1
        minStack.pop();
        System.out.println("Min: " + minStack.getMin());  // 2
        System.out.println("Top: " + minStack.top());     // 2
    }
}
