package dsa.collections.collection_stack;

import java.util.Stack;

public class Reverse {
    public static void insertionAtbottom(Stack<Integer> stack, int item) {
        if (stack.isEmpty()) {
            stack.push(item);
            return;
        }
        int top = stack.pop();
        insertionAtbottom(stack, item);
        stack.push(top);
    }

    public static void reverse(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }
        int top=stack.pop();
        reverse(stack);
        insertionAtbottom(stack,top);

    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(7);
        stack.push(7);
        stack.push(5);
        stack.push(4);
        System.out.println(stack);
        reverse(stack);
        System.out.println(stack);
    }
}
