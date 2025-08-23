package dsa.collections.collection_stack;

import java.util.Stack;

public class Sort{
    public static void sort(Stack<Integer> stack) {
        Stack<Integer> tempstack = new Stack<>();
        while (!stack.isEmpty()) {
            int temp = stack.pop();
            while (!tempstack.isEmpty() && tempstack.peek() < temp) {
                stack.push(tempstack.pop());
            }
            tempstack.push(temp);
        }
            while (!tempstack.isEmpty()) {
                stack.push(tempstack.pop());
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(7);
        stack.push(7);
        stack.push(5);
        stack.push(4);
        System.out.println(stack);
        sort(stack);
        System.out.println(stack);
    }
}
