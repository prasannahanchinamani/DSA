package stack_impl;

public class MinStack {
    private StackimpArray mainStack;
    private StackimpArray minStack;

    public MinStack(int capacity) {
        mainStack = new StackimpArray(capacity);
        minStack = new StackimpArray(capacity);
    }

    public void push(int val) {
        mainStack.push(val);
        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }
    }

    public int pop() {
        int popped = mainStack.pop();
        if (popped == minStack.peek()) {
            minStack.pop();
        }
        return  popped;
    }
    public int peek() {
        return mainStack.peek();
    }

    // Get minimum element
    public int getMin() {
        return minStack.peek();
    }
    public boolean isEmpty() {
        return mainStack.isEmpty();
    }
    public static void main(String[] args) {
        MinStack minStack = new MinStack(10);

        minStack.push(5);
        minStack.push(3);
        minStack.push(7);
        minStack.push(2);

        System.out.println("Min: " + minStack.getMin()); // 2
        minStack.pop(); // removes 2
        System.out.println("Top: " + minStack.peek());    // 7
        System.out.println("Min: " + minStack.getMin()); // 3
    }
}